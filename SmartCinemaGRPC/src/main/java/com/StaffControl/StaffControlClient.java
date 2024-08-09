package com.StaffControl;

import com.StaffControl.StaffControl.StaffHoursRequest;
import com.StaffControl.StaffControl.StaffHoursResponse;
import com.StaffControl.StaffControl.StaffStatusRequest;
import com.StaffControl.StaffControl.StaffStatusResponse;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class StaffControlClient {

    private final StaffControlServiceGrpc.StaffControlServiceStub asyncStub;
    private final StaffControlServiceGrpc.StaffControlServiceBlockingStub blockingStub;

    public StaffControlClient(ManagedChannel channel) {
        blockingStub = StaffControlServiceGrpc.newBlockingStub(channel);
        asyncStub = StaffControlServiceGrpc.newStub(channel);
    }

    public void getStaffStatus(String staffId) {
        StaffStatusRequest request = StaffStatusRequest.newBuilder().setStaffID(staffId).build();
        StaffStatusResponse response = blockingStub.staffStatus(request);
        System.out.println("Staff ON: " + response.getStaffON());
        System.out.println("Staff OFF: " + response.getStaffOFF());
    }

    public void streamStaffHours(String staffId) {
        StaffHoursRequest request = StaffHoursRequest.newBuilder().setStaffID(staffId).build();
        asyncStub.streamStaffHours(request, new StreamObserver<StaffHoursResponse>() {
            @Override
            public void onNext(StaffHoursResponse response) {
                System.out.println("Staff Hours: " + response.getStaffHours());
                System.out.println("Is Staff On: " + response.getIsOn());
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

        StaffControlClient client = new StaffControlClient(channel);


        client.getStaffStatus("1234");
        client.streamStaffHours("1234");

        channel.shutdown();
    }
}//class
