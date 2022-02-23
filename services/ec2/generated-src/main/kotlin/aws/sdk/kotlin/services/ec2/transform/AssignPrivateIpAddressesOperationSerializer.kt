// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.AssignPrivateIpAddressesRequest
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.HttpBody
import aws.smithy.kotlin.runtime.http.HttpMethod
import aws.smithy.kotlin.runtime.http.content.ByteArrayContent
import aws.smithy.kotlin.runtime.http.operation.HttpSerialize
import aws.smithy.kotlin.runtime.http.request.HttpRequestBuilder
import aws.smithy.kotlin.runtime.http.request.url
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlFlattened
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerialName
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerializer
import aws.smithy.kotlin.runtime.serde.formurl.QueryLiteral
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct


internal class AssignPrivateIpAddressesOperationSerializer: HttpSerialize<AssignPrivateIpAddressesRequest> {
    override suspend fun serialize(context: ExecutionContext, input: AssignPrivateIpAddressesRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeAssignPrivateIpAddressesOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        return builder
    }
}

private fun serializeAssignPrivateIpAddressesOperationBody(context: ExecutionContext, input: AssignPrivateIpAddressesRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val ALLOWREASSIGNMENT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("AllowReassignment"))
    val IPV4PREFIXCOUNT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("Ipv4PrefixCount"))
    val IPV4PREFIXES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("Ipv4Prefix"), FormUrlFlattened)
    val NETWORKINTERFACEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("NetworkInterfaceId"))
    val PRIVATEIPADDRESSES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("PrivateIpAddress"), FormUrlFlattened)
    val SECONDARYPRIVATEIPADDRESSCOUNT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("SecondaryPrivateIpAddressCount"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("AssignPrivateIpAddressesRequest"))
        trait(QueryLiteral("Action", "AssignPrivateIpAddresses"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(ALLOWREASSIGNMENT_DESCRIPTOR)
        field(IPV4PREFIXCOUNT_DESCRIPTOR)
        field(IPV4PREFIXES_DESCRIPTOR)
        field(NETWORKINTERFACEID_DESCRIPTOR)
        field(PRIVATEIPADDRESSES_DESCRIPTOR)
        field(SECONDARYPRIVATEIPADDRESSCOUNT_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.allowReassignment?.let { field(ALLOWREASSIGNMENT_DESCRIPTOR, it) }
        input.ipv4PrefixCount?.let { field(IPV4PREFIXCOUNT_DESCRIPTOR, it) }
        if (input.ipv4Prefixes != null) {
            listField(IPV4PREFIXES_DESCRIPTOR) {
                for (el0 in input.ipv4Prefixes) {
                    serializeString(el0)
                }
            }
        }
        input.networkInterfaceId?.let { field(NETWORKINTERFACEID_DESCRIPTOR, it) }
        if (input.privateIpAddresses != null) {
            listField(PRIVATEIPADDRESSES_DESCRIPTOR) {
                for (el0 in input.privateIpAddresses) {
                    serializeString(el0)
                }
            }
        }
        input.secondaryPrivateIpAddressCount?.let { field(SECONDARYPRIVATEIPADDRESSCOUNT_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}
