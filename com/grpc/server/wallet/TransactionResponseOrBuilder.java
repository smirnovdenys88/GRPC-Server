// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/WalletService.proto

package com.grpc.server.wallet;

public interface TransactionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.grpc.server.wallet.TransactionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string userFrom = 1;</code>
   */
  java.lang.String getUserFrom();
  /**
   * <code>optional string userFrom = 1;</code>
   */
  com.google.protobuf.ByteString
      getUserFromBytes();

  /**
   * <code>optional string passwordFrom = 2;</code>
   */
  java.lang.String getPasswordFrom();
  /**
   * <code>optional string passwordFrom = 2;</code>
   */
  com.google.protobuf.ByteString
      getPasswordFromBytes();

  /**
   * <code>optional string userTo = 3;</code>
   */
  java.lang.String getUserTo();
  /**
   * <code>optional string userTo = 3;</code>
   */
  com.google.protobuf.ByteString
      getUserToBytes();
}
