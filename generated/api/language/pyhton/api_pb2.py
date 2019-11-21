# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: api.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from github.com.gogo.protobuf.gogoproto import gogo_pb2 as github_dot_com_dot_gogo_dot_protobuf_dot_gogoproto_dot_gogo__pb2
from github.com.gogo.googleapis.google.api import annotations_pb2 as github_dot_com_dot_gogo_dot_googleapis_dot_google_dot_api_dot_annotations__pb2
from github.com.grpc_ecosystem.grpc_gateway.protoc_gen_swagger.options import annotations_pb2 as github_dot_com_dot_grpc__ecosystem_dot_grpc__gateway_dot_protoc__gen__swagger_dot_options_dot_annotations__pb2
from github.com.gogo.googleapis.google.rpc import status_pb2 as github_dot_com_dot_gogo_dot_googleapis_dot_google_dot_rpc_dot_status__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='api.proto',
  package='proto',
  syntax='proto3',
  serialized_options=_b('\n\nmy.companyB\rPartnerProtosP\001\222A\256\005\022\231\001\n\006My API\"@\n\002me\022(https://github.com/senexi/go-proto-micro\032\020none@example.com*H\n\010Apache 2\022<https://github.com/senexi/go-proto-micro/blob/master/LICENSE2\0031.0Rh\n\003400\022a\nGReturned when the user does not have permission to access the resource.\022\026\n\024\032\022.google.rpc.StatusRh\n\003401\022a\nGReturned when the user does not have permission to access the resource.\022\026\n\024\032\022.google.rpc.StatusRh\n\003403\022a\nGReturned when the user does not have permission to access the resource.\022\026\n\024\032\022.google.rpc.StatusRh\n\003404\022a\nGReturned when the user does not have permission to access the resource.\022\026\n\024\032\022.google.rpc.StatusRh\n\003500\022a\nGReturned when the user does not have permission to access the resource.\022\026\n\024\032\022.google.rpc.Status'),
  serialized_pb=_b('\n\tapi.proto\x12\x05proto\x1a-github.com/gogo/protobuf/gogoproto/gogo.proto\x1a\x37github.com/gogo/googleapis/google/api/annotations.proto\x1aSgithub.com/grpc-ecosystem/grpc-gateway/protoc-gen-swagger/options/annotations.proto\x1a\x32github.com/gogo/googleapis/google/rpc/status.proto\"\x8d\x02\n\x07Partner\x12\'\n\x04name\x18\x01 \x01(\tB\x19\xea\xde\x1f\x04name\xf2\xde\x1f\rpg:\",notnull\"\x12\n\n\x02id\x18\x02 \x01(\x05\x12\r\n\x05\x65mail\x18\x03 \x01(\t\x12\x1f\n\x03sss\x18\x05 \x01(\x0b\x32\x12.google.rpc.Status\x12)\n\x05phone\x18\x04 \x03(\x0b\x32\x1a.proto.Partner.PhoneNumber\x1a\x45\n\x0bPhoneNumber\x12\x0e\n\x06number\x18\x01 \x01(\t\x12&\n\x04type\x18\x02 \x01(\x0e\x32\x18.proto.Partner.PhoneType\"+\n\tPhoneType\x12\n\n\x06MOBILE\x10\x00\x12\x08\n\x04HOME\x10\x01\x12\x08\n\x04WORK\x10\x02\"/\n\x0bPartnerList\x12 \n\x08partners\x18\x01 \x03(\x0b\x32\x0e.proto.Partner\"\"\n\x0f\x41\x64\x64PartnerReply\x12\x0f\n\x07message\x18\x01 \x01(\t\"&\n\rSearchRequest\x12\x15\n\rsearch_string\x18\x01 \x01(\t2\xd1\x01\n\x0ePartnerService\x12\x36\n\nAddPartner\x12\x0e.proto.Partner\x1a\x16.proto.AddPartnerReply\"\x00\x12J\n\x0bGetPartners\x12\x14.proto.SearchRequest\x1a\x12.proto.PartnerList\"\x11\x82\xd3\xe4\x93\x02\x0b\x12\t/partners\x12;\n\rSearchPartner\x12\x14.proto.SearchRequest\x1a\x12.proto.PartnerList\"\x00\x42\xcf\x05\n\nmy.companyB\rPartnerProtosP\x01\x92\x41\xae\x05\x12\x99\x01\n\x06My API\"@\n\x02me\x12(https://github.com/senexi/go-proto-micro\x1a\x10none@example.com*H\n\x08\x41pache 2\x12<https://github.com/senexi/go-proto-micro/blob/master/LICENSE2\x03\x31.0Rh\n\x03\x34\x30\x30\x12\x61\nGReturned when the user does not have permission to access the resource.\x12\x16\n\x14\x1a\x12.google.rpc.StatusRh\n\x03\x34\x30\x31\x12\x61\nGReturned when the user does not have permission to access the resource.\x12\x16\n\x14\x1a\x12.google.rpc.StatusRh\n\x03\x34\x30\x33\x12\x61\nGReturned when the user does not have permission to access the resource.\x12\x16\n\x14\x1a\x12.google.rpc.StatusRh\n\x03\x34\x30\x34\x12\x61\nGReturned when the user does not have permission to access the resource.\x12\x16\n\x14\x1a\x12.google.rpc.StatusRh\n\x03\x35\x30\x30\x12\x61\nGReturned when the user does not have permission to access the resource.\x12\x16\n\x14\x1a\x12.google.rpc.Statusb\x06proto3')
  ,
  dependencies=[github_dot_com_dot_gogo_dot_protobuf_dot_gogoproto_dot_gogo__pb2.DESCRIPTOR,github_dot_com_dot_gogo_dot_googleapis_dot_google_dot_api_dot_annotations__pb2.DESCRIPTOR,github_dot_com_dot_grpc__ecosystem_dot_grpc__gateway_dot_protoc__gen__swagger_dot_options_dot_annotations__pb2.DESCRIPTOR,github_dot_com_dot_gogo_dot_googleapis_dot_google_dot_rpc_dot_status__pb2.DESCRIPTOR,])



_PARTNER_PHONETYPE = _descriptor.EnumDescriptor(
  name='PhoneType',
  full_name='proto.Partner.PhoneType',
  filename=None,
  file=DESCRIPTOR,
  values=[
    _descriptor.EnumValueDescriptor(
      name='MOBILE', index=0, number=0,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='HOME', index=1, number=1,
      serialized_options=None,
      type=None),
    _descriptor.EnumValueDescriptor(
      name='WORK', index=2, number=2,
      serialized_options=None,
      type=None),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=488,
  serialized_end=531,
)
_sym_db.RegisterEnumDescriptor(_PARTNER_PHONETYPE)


_PARTNER_PHONENUMBER = _descriptor.Descriptor(
  name='PhoneNumber',
  full_name='proto.Partner.PhoneNumber',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='number', full_name='proto.Partner.PhoneNumber.number', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='type', full_name='proto.Partner.PhoneNumber.type', index=1,
      number=2, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=417,
  serialized_end=486,
)

_PARTNER = _descriptor.Descriptor(
  name='Partner',
  full_name='proto.Partner',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='proto.Partner.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=_b('\352\336\037\004name\362\336\037\rpg:\",notnull\"'), file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='id', full_name='proto.Partner.id', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='email', full_name='proto.Partner.email', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='sss', full_name='proto.Partner.sss', index=3,
      number=5, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='phone', full_name='proto.Partner.phone', index=4,
      number=4, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[_PARTNER_PHONENUMBER, ],
  enum_types=[
    _PARTNER_PHONETYPE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=262,
  serialized_end=531,
)


_PARTNERLIST = _descriptor.Descriptor(
  name='PartnerList',
  full_name='proto.PartnerList',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='partners', full_name='proto.PartnerList.partners', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=533,
  serialized_end=580,
)


_ADDPARTNERREPLY = _descriptor.Descriptor(
  name='AddPartnerReply',
  full_name='proto.AddPartnerReply',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='message', full_name='proto.AddPartnerReply.message', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=582,
  serialized_end=616,
)


_SEARCHREQUEST = _descriptor.Descriptor(
  name='SearchRequest',
  full_name='proto.SearchRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='search_string', full_name='proto.SearchRequest.search_string', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=618,
  serialized_end=656,
)

_PARTNER_PHONENUMBER.fields_by_name['type'].enum_type = _PARTNER_PHONETYPE
_PARTNER_PHONENUMBER.containing_type = _PARTNER
_PARTNER.fields_by_name['sss'].message_type = github_dot_com_dot_gogo_dot_googleapis_dot_google_dot_rpc_dot_status__pb2._STATUS
_PARTNER.fields_by_name['phone'].message_type = _PARTNER_PHONENUMBER
_PARTNER_PHONETYPE.containing_type = _PARTNER
_PARTNERLIST.fields_by_name['partners'].message_type = _PARTNER
DESCRIPTOR.message_types_by_name['Partner'] = _PARTNER
DESCRIPTOR.message_types_by_name['PartnerList'] = _PARTNERLIST
DESCRIPTOR.message_types_by_name['AddPartnerReply'] = _ADDPARTNERREPLY
DESCRIPTOR.message_types_by_name['SearchRequest'] = _SEARCHREQUEST
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Partner = _reflection.GeneratedProtocolMessageType('Partner', (_message.Message,), {

  'PhoneNumber' : _reflection.GeneratedProtocolMessageType('PhoneNumber', (_message.Message,), {
    'DESCRIPTOR' : _PARTNER_PHONENUMBER,
    '__module__' : 'api_pb2'
    # @@protoc_insertion_point(class_scope:proto.Partner.PhoneNumber)
    })
  ,
  'DESCRIPTOR' : _PARTNER,
  '__module__' : 'api_pb2'
  # @@protoc_insertion_point(class_scope:proto.Partner)
  })
_sym_db.RegisterMessage(Partner)
_sym_db.RegisterMessage(Partner.PhoneNumber)

PartnerList = _reflection.GeneratedProtocolMessageType('PartnerList', (_message.Message,), {
  'DESCRIPTOR' : _PARTNERLIST,
  '__module__' : 'api_pb2'
  # @@protoc_insertion_point(class_scope:proto.PartnerList)
  })
_sym_db.RegisterMessage(PartnerList)

AddPartnerReply = _reflection.GeneratedProtocolMessageType('AddPartnerReply', (_message.Message,), {
  'DESCRIPTOR' : _ADDPARTNERREPLY,
  '__module__' : 'api_pb2'
  # @@protoc_insertion_point(class_scope:proto.AddPartnerReply)
  })
_sym_db.RegisterMessage(AddPartnerReply)

SearchRequest = _reflection.GeneratedProtocolMessageType('SearchRequest', (_message.Message,), {
  'DESCRIPTOR' : _SEARCHREQUEST,
  '__module__' : 'api_pb2'
  # @@protoc_insertion_point(class_scope:proto.SearchRequest)
  })
_sym_db.RegisterMessage(SearchRequest)


DESCRIPTOR._options = None
_PARTNER.fields_by_name['name']._options = None

_PARTNERSERVICE = _descriptor.ServiceDescriptor(
  name='PartnerService',
  full_name='proto.PartnerService',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  serialized_start=659,
  serialized_end=868,
  methods=[
  _descriptor.MethodDescriptor(
    name='AddPartner',
    full_name='proto.PartnerService.AddPartner',
    index=0,
    containing_service=None,
    input_type=_PARTNER,
    output_type=_ADDPARTNERREPLY,
    serialized_options=None,
  ),
  _descriptor.MethodDescriptor(
    name='GetPartners',
    full_name='proto.PartnerService.GetPartners',
    index=1,
    containing_service=None,
    input_type=_SEARCHREQUEST,
    output_type=_PARTNERLIST,
    serialized_options=_b('\202\323\344\223\002\013\022\t/partners'),
  ),
  _descriptor.MethodDescriptor(
    name='SearchPartner',
    full_name='proto.PartnerService.SearchPartner',
    index=2,
    containing_service=None,
    input_type=_SEARCHREQUEST,
    output_type=_PARTNERLIST,
    serialized_options=None,
  ),
])
_sym_db.RegisterServiceDescriptor(_PARTNERSERVICE)

DESCRIPTOR.services_by_name['PartnerService'] = _PARTNERSERVICE

# @@protoc_insertion_point(module_scope)