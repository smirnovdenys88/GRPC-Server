package com.grpc.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;


import java.io.IOException;

public class GrpcServer {

    private static int port = 9633;

    public static void main(String[] args) throws IOException, InterruptedException {

        Server server = ServerBuilder
                .forPort(port)
//                .useTransportSecurity()
                .addService(new AddressBookImpl())
                .build();

        server.start();
        server.awaitTermination();
    }
}

