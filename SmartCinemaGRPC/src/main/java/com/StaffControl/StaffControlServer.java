package com.StaffControl;

import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;
import java.util.logging.Logger;

public class StaffControlServer {

	private static final Logger logger = Logger.getLogger(StaffControlServer.class.getName());

    private final int port;
    private final Server server;

    public StaffControlServer(int port) {
        this.port = port;
        this.server = ServerBuilder.forPort(port)
                .addService((BindableService) new StaffControlServiceImpl())
                .build();
    }

    public void start() throws IOException {
        server.start();
        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("*** shutting down gRPC server since JVM is shutting down");
            StaffControlServer.this.stop();
            System.err.println("*** server shut down");
        }));
    }

    public void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    public void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        StaffControlServer server = new StaffControlServer(50051);
        server.start();
        server.blockUntilShutdown();
    }

}//class
