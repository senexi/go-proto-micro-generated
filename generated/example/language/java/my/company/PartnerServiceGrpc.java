package my.company;

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
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: example.proto")
public final class PartnerServiceGrpc {

  private PartnerServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.PartnerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<my.company.PartnerProtos.Partner,
      my.company.PartnerProtos.AddPartnerReply> getAddPartnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddPartner",
      requestType = my.company.PartnerProtos.Partner.class,
      responseType = my.company.PartnerProtos.AddPartnerReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<my.company.PartnerProtos.Partner,
      my.company.PartnerProtos.AddPartnerReply> getAddPartnerMethod() {
    io.grpc.MethodDescriptor<my.company.PartnerProtos.Partner, my.company.PartnerProtos.AddPartnerReply> getAddPartnerMethod;
    if ((getAddPartnerMethod = PartnerServiceGrpc.getAddPartnerMethod) == null) {
      synchronized (PartnerServiceGrpc.class) {
        if ((getAddPartnerMethod = PartnerServiceGrpc.getAddPartnerMethod) == null) {
          PartnerServiceGrpc.getAddPartnerMethod = getAddPartnerMethod = 
              io.grpc.MethodDescriptor.<my.company.PartnerProtos.Partner, my.company.PartnerProtos.AddPartnerReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.PartnerService", "AddPartner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.company.PartnerProtos.Partner.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.company.PartnerProtos.AddPartnerReply.getDefaultInstance()))
                  .setSchemaDescriptor(new PartnerServiceMethodDescriptorSupplier("AddPartner"))
                  .build();
          }
        }
     }
     return getAddPartnerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<my.company.PartnerProtos.SearchRequest,
      my.company.PartnerProtos.PartnerList> getGetPartnersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPartners",
      requestType = my.company.PartnerProtos.SearchRequest.class,
      responseType = my.company.PartnerProtos.PartnerList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<my.company.PartnerProtos.SearchRequest,
      my.company.PartnerProtos.PartnerList> getGetPartnersMethod() {
    io.grpc.MethodDescriptor<my.company.PartnerProtos.SearchRequest, my.company.PartnerProtos.PartnerList> getGetPartnersMethod;
    if ((getGetPartnersMethod = PartnerServiceGrpc.getGetPartnersMethod) == null) {
      synchronized (PartnerServiceGrpc.class) {
        if ((getGetPartnersMethod = PartnerServiceGrpc.getGetPartnersMethod) == null) {
          PartnerServiceGrpc.getGetPartnersMethod = getGetPartnersMethod = 
              io.grpc.MethodDescriptor.<my.company.PartnerProtos.SearchRequest, my.company.PartnerProtos.PartnerList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.PartnerService", "GetPartners"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.company.PartnerProtos.SearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.company.PartnerProtos.PartnerList.getDefaultInstance()))
                  .setSchemaDescriptor(new PartnerServiceMethodDescriptorSupplier("GetPartners"))
                  .build();
          }
        }
     }
     return getGetPartnersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<my.company.PartnerProtos.SearchRequest,
      my.company.PartnerProtos.PartnerList> getSearchPartnerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchPartner",
      requestType = my.company.PartnerProtos.SearchRequest.class,
      responseType = my.company.PartnerProtos.PartnerList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<my.company.PartnerProtos.SearchRequest,
      my.company.PartnerProtos.PartnerList> getSearchPartnerMethod() {
    io.grpc.MethodDescriptor<my.company.PartnerProtos.SearchRequest, my.company.PartnerProtos.PartnerList> getSearchPartnerMethod;
    if ((getSearchPartnerMethod = PartnerServiceGrpc.getSearchPartnerMethod) == null) {
      synchronized (PartnerServiceGrpc.class) {
        if ((getSearchPartnerMethod = PartnerServiceGrpc.getSearchPartnerMethod) == null) {
          PartnerServiceGrpc.getSearchPartnerMethod = getSearchPartnerMethod = 
              io.grpc.MethodDescriptor.<my.company.PartnerProtos.SearchRequest, my.company.PartnerProtos.PartnerList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.PartnerService", "SearchPartner"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.company.PartnerProtos.SearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  my.company.PartnerProtos.PartnerList.getDefaultInstance()))
                  .setSchemaDescriptor(new PartnerServiceMethodDescriptorSupplier("SearchPartner"))
                  .build();
          }
        }
     }
     return getSearchPartnerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PartnerServiceStub newStub(io.grpc.Channel channel) {
    return new PartnerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PartnerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PartnerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PartnerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PartnerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PartnerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addPartner(my.company.PartnerProtos.Partner request,
        io.grpc.stub.StreamObserver<my.company.PartnerProtos.AddPartnerReply> responseObserver) {
      asyncUnimplementedUnaryCall(getAddPartnerMethod(), responseObserver);
    }

    /**
     */
    public void getPartners(my.company.PartnerProtos.SearchRequest request,
        io.grpc.stub.StreamObserver<my.company.PartnerProtos.PartnerList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPartnersMethod(), responseObserver);
    }

    /**
     */
    public void searchPartner(my.company.PartnerProtos.SearchRequest request,
        io.grpc.stub.StreamObserver<my.company.PartnerProtos.PartnerList> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchPartnerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddPartnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                my.company.PartnerProtos.Partner,
                my.company.PartnerProtos.AddPartnerReply>(
                  this, METHODID_ADD_PARTNER)))
          .addMethod(
            getGetPartnersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                my.company.PartnerProtos.SearchRequest,
                my.company.PartnerProtos.PartnerList>(
                  this, METHODID_GET_PARTNERS)))
          .addMethod(
            getSearchPartnerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                my.company.PartnerProtos.SearchRequest,
                my.company.PartnerProtos.PartnerList>(
                  this, METHODID_SEARCH_PARTNER)))
          .build();
    }
  }

  /**
   */
  public static final class PartnerServiceStub extends io.grpc.stub.AbstractStub<PartnerServiceStub> {
    private PartnerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PartnerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PartnerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PartnerServiceStub(channel, callOptions);
    }

    /**
     */
    public void addPartner(my.company.PartnerProtos.Partner request,
        io.grpc.stub.StreamObserver<my.company.PartnerProtos.AddPartnerReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddPartnerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPartners(my.company.PartnerProtos.SearchRequest request,
        io.grpc.stub.StreamObserver<my.company.PartnerProtos.PartnerList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPartnersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchPartner(my.company.PartnerProtos.SearchRequest request,
        io.grpc.stub.StreamObserver<my.company.PartnerProtos.PartnerList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchPartnerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PartnerServiceBlockingStub extends io.grpc.stub.AbstractStub<PartnerServiceBlockingStub> {
    private PartnerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PartnerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PartnerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PartnerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public my.company.PartnerProtos.AddPartnerReply addPartner(my.company.PartnerProtos.Partner request) {
      return blockingUnaryCall(
          getChannel(), getAddPartnerMethod(), getCallOptions(), request);
    }

    /**
     */
    public my.company.PartnerProtos.PartnerList getPartners(my.company.PartnerProtos.SearchRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPartnersMethod(), getCallOptions(), request);
    }

    /**
     */
    public my.company.PartnerProtos.PartnerList searchPartner(my.company.PartnerProtos.SearchRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchPartnerMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PartnerServiceFutureStub extends io.grpc.stub.AbstractStub<PartnerServiceFutureStub> {
    private PartnerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PartnerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PartnerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PartnerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<my.company.PartnerProtos.AddPartnerReply> addPartner(
        my.company.PartnerProtos.Partner request) {
      return futureUnaryCall(
          getChannel().newCall(getAddPartnerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<my.company.PartnerProtos.PartnerList> getPartners(
        my.company.PartnerProtos.SearchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPartnersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<my.company.PartnerProtos.PartnerList> searchPartner(
        my.company.PartnerProtos.SearchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchPartnerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_PARTNER = 0;
  private static final int METHODID_GET_PARTNERS = 1;
  private static final int METHODID_SEARCH_PARTNER = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PartnerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PartnerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_PARTNER:
          serviceImpl.addPartner((my.company.PartnerProtos.Partner) request,
              (io.grpc.stub.StreamObserver<my.company.PartnerProtos.AddPartnerReply>) responseObserver);
          break;
        case METHODID_GET_PARTNERS:
          serviceImpl.getPartners((my.company.PartnerProtos.SearchRequest) request,
              (io.grpc.stub.StreamObserver<my.company.PartnerProtos.PartnerList>) responseObserver);
          break;
        case METHODID_SEARCH_PARTNER:
          serviceImpl.searchPartner((my.company.PartnerProtos.SearchRequest) request,
              (io.grpc.stub.StreamObserver<my.company.PartnerProtos.PartnerList>) responseObserver);
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

  private static abstract class PartnerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PartnerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return my.company.PartnerProtos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PartnerService");
    }
  }

  private static final class PartnerServiceFileDescriptorSupplier
      extends PartnerServiceBaseDescriptorSupplier {
    PartnerServiceFileDescriptorSupplier() {}
  }

  private static final class PartnerServiceMethodDescriptorSupplier
      extends PartnerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PartnerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PartnerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PartnerServiceFileDescriptorSupplier())
              .addMethod(getAddPartnerMethod())
              .addMethod(getGetPartnersMethod())
              .addMethod(getSearchPartnerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
