package com.grpc.server;

import com.grpc.server.impl.HelloServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class GrpcServer {
    private static final Logger LOG = LogManager.getLogger(GrpcServer.class);
    private static int port = 6666;
    public static void main(String[] args) throws IOException, InterruptedException {

        Server server = ServerBuilder
                .forPort(port)
                .addService(new HelloServiceImpl())
                .build();

        server.start();

        LOG.info("Server GRPC start port: " + port);

        server.awaitTermination();
    }
}

