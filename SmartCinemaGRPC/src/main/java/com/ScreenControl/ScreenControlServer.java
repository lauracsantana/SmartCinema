package com.ScreenControl;

import java.io.IOException;

import com.ScreenControl.ScreenControl.AllScreenStopRequest;
import com.ScreenControl.ScreenControl.AllScreenStopResponse;
import com.ScreenControl.ScreenControl.ScreenStatusRequest;
import com.ScreenControl.ScreenControl.ScreenStatusResponse;
import com.ScreenControl.ScreenControl.TurnScreenONRequest;
import com.ScreenControl.ScreenControl.TurnScreenONResponse;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class ScreenControlServer {

    public static class ScreenControlServiceImpl extends ScreenControlServiceGrpc.ScreenControlServiceImplBase {

        @Override
        public void screenStatus(ScreenStatusRequest request, StreamObserver<ScreenStatusResponse> responseObserver) {
            // Example implementation: send dummy data
            String screenID = request.getScreenID();
            String status = request.getStatus();

            // For demonstration purposes, we will return fixed status values
            ScreenStatusResponse response = ScreenStatusResponse.newBuilder()
                    .setScreenON("ON".equals(status) ? "Screen is ON" : "Screen is OFF")
                    .setScreenOFF("OFF".equals(status) ? "Screen is OFF" : "Screen is ON")
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void turnScreenON(TurnScreenONRequest request, StreamObserver<TurnScreenONResponse> responseObserver) {
            // Example implementation: send dummy data
            TurnScreenONResponse response = TurnScreenONResponse.newBuilder()
                    .setScreenID(request.getScreenID())
                    .setScreenON("ON")
                    .setScreenOFF("OFF")
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void allScreenStop(AllScreenStopRequest request, StreamObserver<AllScreenStopResponse> responseObserver) {
            // Example implementation: send dummy data
            AllScreenStopResponse response = AllScreenStopResponse.newBuilder()
                    .setScreenID(request.getScreenID())
                    .setAllScreenOFF("All screens are OFF")
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 50051;
        Server server = ServerBuilder.forPort(port)
                .addService(new ScreenControlServiceImpl())
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
}
