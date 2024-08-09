package com.DoorControl;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

import com.DoorControl.DoorControl.DoorHistoryRequest;
import com.DoorControl.DoorControl.DoorHistoryResponse;
import com.DoorControl.DoorControl.DoorStatusRequest;
import com.DoorControl.DoorControl.DoorStatusResponse;

public class DoorControlServer {

    public static class DoorControlServiceImpl extends DoorControlServiceGrpc.DoorControlServiceImplBase {

        @Override
        public void streamDoorHistory(DoorHistoryRequest request, StreamObserver<DoorHistoryResponse> responseObserver) {
            for (int i = 0; i < 5; i++) {
                DoorHistoryResponse response = DoorHistoryResponse.newBuilder()
                        .setStaffID("Staff-" + i)
                        .setDoorLevel("Level-" + i)
                        .build();
                responseObserver.onNext(response);
            }
            responseObserver.onCompleted();
        }

        @Override
        public void doorStatus(DoorStatusRequest request, StreamObserver<DoorStatusResponse> responseObserver) {
            DoorStatusResponse response = DoorStatusResponse.newBuilder()
                    .setDoorOpen("Door is open")
                    .setDoorClose("Door is closed")
                    .setDoorLock("Door is locked")
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 50051;
        Server server = ServerBuilder.forPort(port)
                .addService(new DoorControlServiceImpl())
                .build()
                .start();
        System.out.println("Server started, listening on " + port);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("Shutting down gRPC server since JVM is shutting down");
            server.shutdown();
            System.err.println("Server shut down");
        }));

        server.awaitTermination();
    }
}//class
