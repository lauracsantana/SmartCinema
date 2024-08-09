package com.DoorControl;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: DoorControl.proto")
public final class DoorControlServiceGrpc {

  private DoorControlServiceGrpc() {}

  public static final String SERVICE_NAME = "DoorControlService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.DoorControl.DoorControl.DoorHistoryRequest,
      com.DoorControl.DoorControl.DoorHistoryResponse> getStreamDoorHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamDoorHistory",
      requestType = com.DoorControl.DoorControl.DoorHistoryRequest.class,
      responseType = com.DoorControl.DoorControl.DoorHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.DoorControl.DoorControl.DoorHistoryRequest,
      com.DoorControl.DoorControl.DoorHistoryResponse> getStreamDoorHistoryMethod() {
    io.grpc.MethodDescriptor<com.DoorControl.DoorControl.DoorHistoryRequest, com.DoorControl.DoorControl.DoorHistoryResponse> getStreamDoorHistoryMethod;
    if ((getStreamDoorHistoryMethod = DoorControlServiceGrpc.getStreamDoorHistoryMethod) == null) {
      synchronized (DoorControlServiceGrpc.class) {
        if ((getStreamDoorHistoryMethod = DoorControlServiceGrpc.getStreamDoorHistoryMethod) == null) {
          DoorControlServiceGrpc.getStreamDoorHistoryMethod = getStreamDoorHistoryMethod = 
              io.grpc.MethodDescriptor.<com.DoorControl.DoorControl.DoorHistoryRequest, com.DoorControl.DoorControl.DoorHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "DoorControlService", "StreamDoorHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.DoorControl.DoorControl.DoorHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.DoorControl.DoorControl.DoorHistoryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DoorControlServiceMethodDescriptorSupplier("StreamDoorHistory"))
                  .build();
          }
        }
     }
     return getStreamDoorHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.DoorControl.DoorControl.DoorStatusRequest,
      com.DoorControl.DoorControl.DoorStatusResponse> getDoorStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DoorStatus",
      requestType = com.DoorControl.DoorControl.DoorStatusRequest.class,
      responseType = com.DoorControl.DoorControl.DoorStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.DoorControl.DoorControl.DoorStatusRequest,
      com.DoorControl.DoorControl.DoorStatusResponse> getDoorStatusMethod() {
    io.grpc.MethodDescriptor<com.DoorControl.DoorControl.DoorStatusRequest, com.DoorControl.DoorControl.DoorStatusResponse> getDoorStatusMethod;
    if ((getDoorStatusMethod = DoorControlServiceGrpc.getDoorStatusMethod) == null) {
      synchronized (DoorControlServiceGrpc.class) {
        if ((getDoorStatusMethod = DoorControlServiceGrpc.getDoorStatusMethod) == null) {
          DoorControlServiceGrpc.getDoorStatusMethod = getDoorStatusMethod = 
              io.grpc.MethodDescriptor.<com.DoorControl.DoorControl.DoorStatusRequest, com.DoorControl.DoorControl.DoorStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "DoorControlService", "DoorStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.DoorControl.DoorControl.DoorStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.DoorControl.DoorControl.DoorStatusResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DoorControlServiceMethodDescriptorSupplier("DoorStatus"))
                  .build();
          }
        }
     }
     return getDoorStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DoorControlServiceStub newStub(io.grpc.Channel channel) {
    return new DoorControlServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DoorControlServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DoorControlServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DoorControlServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DoorControlServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class DoorControlServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void streamDoorHistory(com.DoorControl.DoorControl.DoorHistoryRequest request,
        io.grpc.stub.StreamObserver<com.DoorControl.DoorControl.DoorHistoryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStreamDoorHistoryMethod(), responseObserver);
    }

    /**
     */
    public void doorStatus(com.DoorControl.DoorControl.DoorStatusRequest request,
        io.grpc.stub.StreamObserver<com.DoorControl.DoorControl.DoorStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDoorStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStreamDoorHistoryMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.DoorControl.DoorControl.DoorHistoryRequest,
                com.DoorControl.DoorControl.DoorHistoryResponse>(
                  this, METHODID_STREAM_DOOR_HISTORY)))
          .addMethod(
            getDoorStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.DoorControl.DoorControl.DoorStatusRequest,
                com.DoorControl.DoorControl.DoorStatusResponse>(
                  this, METHODID_DOOR_STATUS)))
          .build();
    }
  }

  /**
   */
  public static final class DoorControlServiceStub extends io.grpc.stub.AbstractStub<DoorControlServiceStub> {
    private DoorControlServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DoorControlServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DoorControlServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DoorControlServiceStub(channel, callOptions);
    }

    /**
     */
    public void streamDoorHistory(com.DoorControl.DoorControl.DoorHistoryRequest request,
        io.grpc.stub.StreamObserver<com.DoorControl.DoorControl.DoorHistoryResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getStreamDoorHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void doorStatus(com.DoorControl.DoorControl.DoorStatusRequest request,
        io.grpc.stub.StreamObserver<com.DoorControl.DoorControl.DoorStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDoorStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DoorControlServiceBlockingStub extends io.grpc.stub.AbstractStub<DoorControlServiceBlockingStub> {
    private DoorControlServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DoorControlServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DoorControlServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DoorControlServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.DoorControl.DoorControl.DoorHistoryResponse> streamDoorHistory(
        com.DoorControl.DoorControl.DoorHistoryRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getStreamDoorHistoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.DoorControl.DoorControl.DoorStatusResponse doorStatus(com.DoorControl.DoorControl.DoorStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getDoorStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DoorControlServiceFutureStub extends io.grpc.stub.AbstractStub<DoorControlServiceFutureStub> {
    private DoorControlServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DoorControlServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DoorControlServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DoorControlServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.DoorControl.DoorControl.DoorStatusResponse> doorStatus(
        com.DoorControl.DoorControl.DoorStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDoorStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_STREAM_DOOR_HISTORY = 0;
  private static final int METHODID_DOOR_STATUS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DoorControlServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DoorControlServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STREAM_DOOR_HISTORY:
          serviceImpl.streamDoorHistory((com.DoorControl.DoorControl.DoorHistoryRequest) request,
              (io.grpc.stub.StreamObserver<com.DoorControl.DoorControl.DoorHistoryResponse>) responseObserver);
          break;
        case METHODID_DOOR_STATUS:
          serviceImpl.doorStatus((com.DoorControl.DoorControl.DoorStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.DoorControl.DoorControl.DoorStatusResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DoorControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DoorControlServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.DoorControl.DoorControl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DoorControlService");
    }
  }

  private static final class DoorControlServiceFileDescriptorSupplier
      extends DoorControlServiceBaseDescriptorSupplier {
    DoorControlServiceFileDescriptorSupplier() {}
  }

  private static final class DoorControlServiceMethodDescriptorSupplier
      extends DoorControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DoorControlServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DoorControlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DoorControlServiceFileDescriptorSupplier())
              .addMethod(getStreamDoorHistoryMethod())
              .addMethod(getDoorStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
