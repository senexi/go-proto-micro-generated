/**
 * @fileoverview gRPC-Web generated client stub for proto
 * @enhanceable
 * @public
 */

// GENERATED CODE -- DO NOT EDIT!



const grpc = {};
grpc.web = require('grpc-web');


var github_com_gogo_protobuf_gogoproto_gogo_pb = require('./github.com/gogo/protobuf/gogoproto/gogo_pb.js')

var github_com_gogo_googleapis_google_api_annotations_pb = require('./github.com/gogo/googleapis/google/api/annotations_pb.js')

var github_com_grpc$ecosystem_grpc$gateway_protoc$gen$swagger_options_annotations_pb = require('./github.com/grpc-ecosystem/grpc-gateway/protoc-gen-swagger/options/annotations_pb.js')

var github_com_gogo_googleapis_google_rpc_status_pb = require('./github.com/gogo/googleapis/google/rpc/status_pb.js')
const proto = {};
proto.proto = require('./example_pb.js');

/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?Object} options
 * @constructor
 * @struct
 * @final
 */
proto.proto.PartnerServiceClient =
    function(hostname, credentials, options) {
  if (!options) options = {};
  options['format'] = 'text';

  /**
   * @private @const {!grpc.web.GrpcWebClientBase} The client
   */
  this.client_ = new grpc.web.GrpcWebClientBase(options);

  /**
   * @private @const {string} The hostname
   */
  this.hostname_ = hostname;

};


/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?Object} options
 * @constructor
 * @struct
 * @final
 */
proto.proto.PartnerServicePromiseClient =
    function(hostname, credentials, options) {
  if (!options) options = {};
  options['format'] = 'text';

  /**
   * @private @const {!grpc.web.GrpcWebClientBase} The client
   */
  this.client_ = new grpc.web.GrpcWebClientBase(options);

  /**
   * @private @const {string} The hostname
   */
  this.hostname_ = hostname;

};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.proto.Partner,
 *   !proto.proto.AddPartnerReply>}
 */
const methodDescriptor_PartnerService_AddPartner = new grpc.web.MethodDescriptor(
  '/proto.PartnerService/AddPartner',
  grpc.web.MethodType.UNARY,
  proto.proto.Partner,
  proto.proto.AddPartnerReply,
  /**
   * @param {!proto.proto.Partner} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.proto.AddPartnerReply.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.proto.Partner,
 *   !proto.proto.AddPartnerReply>}
 */
const methodInfo_PartnerService_AddPartner = new grpc.web.AbstractClientBase.MethodInfo(
  proto.proto.AddPartnerReply,
  /**
   * @param {!proto.proto.Partner} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.proto.AddPartnerReply.deserializeBinary
);


/**
 * @param {!proto.proto.Partner} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.proto.AddPartnerReply)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.proto.AddPartnerReply>|undefined}
 *     The XHR Node Readable Stream
 */
proto.proto.PartnerServiceClient.prototype.addPartner =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/proto.PartnerService/AddPartner',
      request,
      metadata || {},
      methodDescriptor_PartnerService_AddPartner,
      callback);
};


/**
 * @param {!proto.proto.Partner} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.proto.AddPartnerReply>}
 *     A native promise that resolves to the response
 */
proto.proto.PartnerServicePromiseClient.prototype.addPartner =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/proto.PartnerService/AddPartner',
      request,
      metadata || {},
      methodDescriptor_PartnerService_AddPartner);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.proto.SearchRequest,
 *   !proto.proto.PartnerList>}
 */
const methodDescriptor_PartnerService_GetPartners = new grpc.web.MethodDescriptor(
  '/proto.PartnerService/GetPartners',
  grpc.web.MethodType.UNARY,
  proto.proto.SearchRequest,
  proto.proto.PartnerList,
  /**
   * @param {!proto.proto.SearchRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.proto.PartnerList.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.proto.SearchRequest,
 *   !proto.proto.PartnerList>}
 */
const methodInfo_PartnerService_GetPartners = new grpc.web.AbstractClientBase.MethodInfo(
  proto.proto.PartnerList,
  /**
   * @param {!proto.proto.SearchRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.proto.PartnerList.deserializeBinary
);


/**
 * @param {!proto.proto.SearchRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.proto.PartnerList)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.proto.PartnerList>|undefined}
 *     The XHR Node Readable Stream
 */
proto.proto.PartnerServiceClient.prototype.getPartners =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/proto.PartnerService/GetPartners',
      request,
      metadata || {},
      methodDescriptor_PartnerService_GetPartners,
      callback);
};


/**
 * @param {!proto.proto.SearchRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.proto.PartnerList>}
 *     A native promise that resolves to the response
 */
proto.proto.PartnerServicePromiseClient.prototype.getPartners =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/proto.PartnerService/GetPartners',
      request,
      metadata || {},
      methodDescriptor_PartnerService_GetPartners);
};


/**
 * @const
 * @type {!grpc.web.MethodDescriptor<
 *   !proto.proto.SearchRequest,
 *   !proto.proto.PartnerList>}
 */
const methodDescriptor_PartnerService_SearchPartner = new grpc.web.MethodDescriptor(
  '/proto.PartnerService/SearchPartner',
  grpc.web.MethodType.UNARY,
  proto.proto.SearchRequest,
  proto.proto.PartnerList,
  /**
   * @param {!proto.proto.SearchRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.proto.PartnerList.deserializeBinary
);


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.proto.SearchRequest,
 *   !proto.proto.PartnerList>}
 */
const methodInfo_PartnerService_SearchPartner = new grpc.web.AbstractClientBase.MethodInfo(
  proto.proto.PartnerList,
  /**
   * @param {!proto.proto.SearchRequest} request
   * @return {!Uint8Array}
   */
  function(request) {
    return request.serializeBinary();
  },
  proto.proto.PartnerList.deserializeBinary
);


/**
 * @param {!proto.proto.SearchRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.proto.PartnerList)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.proto.PartnerList>|undefined}
 *     The XHR Node Readable Stream
 */
proto.proto.PartnerServiceClient.prototype.searchPartner =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/proto.PartnerService/SearchPartner',
      request,
      metadata || {},
      methodDescriptor_PartnerService_SearchPartner,
      callback);
};


/**
 * @param {!proto.proto.SearchRequest} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.proto.PartnerList>}
 *     A native promise that resolves to the response
 */
proto.proto.PartnerServicePromiseClient.prototype.searchPartner =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/proto.PartnerService/SearchPartner',
      request,
      metadata || {},
      methodDescriptor_PartnerService_SearchPartner);
};


module.exports = proto.proto;

