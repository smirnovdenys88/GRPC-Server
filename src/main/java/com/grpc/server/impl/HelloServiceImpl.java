package com.grpc.server.impl;

import com.grpc.server.service.HelloRequest;
import com.grpc.server.service.HelloResponse;
import com.grpc.server.service.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {
    private static Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class);

    @Override
    public void hello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        logger.info("Receive message : " + request.toString());
        try {
            HelloResponse helloResponse = HelloResponse.newBuilder()
                    .setGreeting("Hello it is server grpc " + request.getFirstName() + " " + request.getLastName())
                    .build();
            responseObserver.onNext(helloResponse);
            responseObserver.onCompleted();
            logger.info("Send callback message : " + helloResponse.toString());

        } catch (Exception e) {
            responseObserver.onError(e);
        }

    }
}
