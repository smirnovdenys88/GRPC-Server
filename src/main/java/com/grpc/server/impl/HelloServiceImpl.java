package com.grpc.server.impl;

import com.grpc.server.service.HelloRequest;
import com.grpc.server.service.HelloResponse;
import com.grpc.server.service.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;

public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {

    @Override
    public void hello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {

        try {
            HelloResponse helloResponse = HelloResponse.newBuilder()
                    .setGreeting("Hello it is server grpc " + request.getFirstName() + " " + request.getLastName())
                    .build();
            responseObserver.onNext(helloResponse);
            responseObserver.onCompleted();

        } catch (Exception e) {
            responseObserver.onError(e);
        }

    }
}
