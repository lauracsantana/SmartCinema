package com.DoorControl;

import com.DoorControl.DoorControl.DoorHistoryRequest;
import com.DoorControl.DoorControl.DoorHistoryResponse;
import com.DoorControl.DoorControl.DoorStatusRequest;
import com.DoorControl.DoorControl.DoorStatusResponse;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class DoorControlClient {

    private final DoorControlServiceGrpc.DoorControlServiceBlockingStub blockingStub;
    private final DoorControlServiceGrpc.DoorControlServiceStub asyncStub;

    public DoorControlClient(ManagedChannel channel) {
        blockingStub = DoorControlServiceGrpc.newBlockingStub(channel);
        asyncStub = DoorControlServiceGrpc.newStub(channel);
    }

    public void getDoorStatus(String doorId) {
        DoorStatusRequest request = DoorStatusRequest.newBuilder().setDoorID(doorId).build();
        DoorStatusResponse response = blockingStub.doorStatus(request);
        System.out.println("Door Open: " + response.getDoorOpen());
        System.out.println("Door Close: " + response.getDoorClose());
        System.out.println("Door Lock: " + response.getDoorLock());
    }

    public void streamDoorHistory(String doorId) {
        DoorHistoryRequest request = DoorHistoryRequest.newBuilder().setDoorID(doorId).build();
        asyncStub.streamDoorHistory(request, new StreamObserver<DoorHistoryResponse>() {
            @Override
            public void onNext(DoorHistoryResponse response) {
                System.out.println("Staff ID: " + response.getStaffID());
                System.out.println("Door Level: " + response.getDoorLevel());
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Stream error: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Stream completed.");
            }
        });
    }

    public static void main(String[] args) {
        String target = "localhost:50051"; // Replace with your server address
        ManagedChannel channel = ManagedChannelBuilder.forTarget(target)
                                                      .usePlaintext()
                                                      .build();

        DoorControlClient client = new DoorControlClient(channel);

        client.getDoorStatus("Door-1234");
        client.streamDoorHistory("Door-1234");

        // Shutdown the channel when done
        channel.shutdown();
    }
}
