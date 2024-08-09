package com.ScreenControl;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.ScreenControl.ScreenControl.AllScreenStopRequest;
import com.ScreenControl.ScreenControl.AllScreenStopResponse;
import com.ScreenControl.ScreenControl.ScreenStatusRequest;
import com.ScreenControl.ScreenControl.ScreenStatusResponse;
import com.ScreenControl.ScreenControl.TurnScreenONRequest;
import com.ScreenControl.ScreenControl.TurnScreenONResponse;


public class ScreenControlClient {
	
	private static final Logger logger = Logger.getLogger(ScreenControlClient.class.getName());

	private static final String AllScreenOFF = null;

    private final ManagedChannel channel;
    private final ScreenControlServiceGrpc.ScreenControlServiceBlockingStub blockingStub;

    /** Construct client connecting to ScreenControl server at {@code host:port}. */
    public ScreenControlClient(String host, int port) {
        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        blockingStub = ScreenControlServiceGrpc.newBlockingStub(channel);
    }

    /** Shut down the client channel gracefully. */
    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    /** Call the ScreenStatus RPC method. */
    public void getScreenStatus(String screenId, String status) {
        logger.info("Checking status for screen ID: " + screenId);
        ScreenStatusRequest request = ScreenStatusRequest.newBuilder()
                .setScreenID(screenId)
                .setStatus(status)
                .build();
        ScreenStatusResponse response;
        try {
            response = blockingStub.screenStatus(request);
            logger.info("Screen ON: " + response.getScreenON() + ", Screen OFF: " + response.getScreenOFF());
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
        }
    }

    /** Call the TurnScreenON RPC method. */
    public void turnScreenON(String screenId, String screenOn) {
        logger.info("Turning ON screen ID: " + screenId);
        TurnScreenONRequest request = TurnScreenONRequest.newBuilder()
                .setScreenID(screenId)
                .setScreenON(screenOn)
                .build();
        TurnScreenONResponse response;
        try {
            response = blockingStub.turnScreenON(request);
            logger.info("Screen ON: " + response.getScreenON());
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
        }
    }

    /** Call the AllScreenStop RPC method. */
    public void stopAllScreens(String screenId, String status) {
        logger.info("Stopping all screens for screen ID: " + screenId);
        AllScreenStopRequest request = AllScreenStopRequest.newBuilder()
                .setScreenID(screenId)
                .setAllScreenOFF(AllScreenOFF)
                .build();
        AllScreenStopResponse response;
        try {
            response = blockingStub.allScreenStop(request);
            logger.info("Screen OFF: " + response.getAllScreenOFF());
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
        }
    }

    public static void main(String[] args) throws Exception {
        ScreenControlClient client = new ScreenControlClient("localhost", 50051);
        try {
            client.getScreenStatus("123", "ON");
            client.turnScreenON("123", "ON");
            client.stopAllScreens("123", "STOPPED");
        } finally {
            client.shutdown();
        }
    }
    
}//class
	
	
