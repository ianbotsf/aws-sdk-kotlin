// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.CreateRouteRequest
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
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerialName
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerializer
import aws.smithy.kotlin.runtime.serde.formurl.QueryLiteral
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct


internal class CreateRouteOperationSerializer: HttpSerialize<CreateRouteRequest> {
    override suspend fun serialize(context: ExecutionContext, input: CreateRouteRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeCreateRouteOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        return builder
    }
}

private fun serializeCreateRouteOperationBody(context: ExecutionContext, input: CreateRouteRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val CARRIERGATEWAYID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("CarrierGatewayId"))
    val CORENETWORKARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("CoreNetworkArn"))
    val DESTINATIONCIDRBLOCK_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("DestinationCidrBlock"))
    val DESTINATIONIPV6CIDRBLOCK_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("DestinationIpv6CidrBlock"))
    val DESTINATIONPREFIXLISTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("DestinationPrefixListId"))
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val EGRESSONLYINTERNETGATEWAYID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("EgressOnlyInternetGatewayId"))
    val GATEWAYID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("GatewayId"))
    val INSTANCEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("InstanceId"))
    val LOCALGATEWAYID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("LocalGatewayId"))
    val NATGATEWAYID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("NatGatewayId"))
    val NETWORKINTERFACEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("NetworkInterfaceId"))
    val ROUTETABLEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("RouteTableId"))
    val TRANSITGATEWAYID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("TransitGatewayId"))
    val VPCENDPOINTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("VpcEndpointId"))
    val VPCPEERINGCONNECTIONID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("VpcPeeringConnectionId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("CreateRouteRequest"))
        trait(QueryLiteral("Action", "CreateRoute"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(CARRIERGATEWAYID_DESCRIPTOR)
        field(CORENETWORKARN_DESCRIPTOR)
        field(DESTINATIONCIDRBLOCK_DESCRIPTOR)
        field(DESTINATIONIPV6CIDRBLOCK_DESCRIPTOR)
        field(DESTINATIONPREFIXLISTID_DESCRIPTOR)
        field(DRYRUN_DESCRIPTOR)
        field(EGRESSONLYINTERNETGATEWAYID_DESCRIPTOR)
        field(GATEWAYID_DESCRIPTOR)
        field(INSTANCEID_DESCRIPTOR)
        field(LOCALGATEWAYID_DESCRIPTOR)
        field(NATGATEWAYID_DESCRIPTOR)
        field(NETWORKINTERFACEID_DESCRIPTOR)
        field(ROUTETABLEID_DESCRIPTOR)
        field(TRANSITGATEWAYID_DESCRIPTOR)
        field(VPCENDPOINTID_DESCRIPTOR)
        field(VPCPEERINGCONNECTIONID_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.carrierGatewayId?.let { field(CARRIERGATEWAYID_DESCRIPTOR, it) }
        input.coreNetworkArn?.let { field(CORENETWORKARN_DESCRIPTOR, it) }
        input.destinationCidrBlock?.let { field(DESTINATIONCIDRBLOCK_DESCRIPTOR, it) }
        input.destinationIpv6CidrBlock?.let { field(DESTINATIONIPV6CIDRBLOCK_DESCRIPTOR, it) }
        input.destinationPrefixListId?.let { field(DESTINATIONPREFIXLISTID_DESCRIPTOR, it) }
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        input.egressOnlyInternetGatewayId?.let { field(EGRESSONLYINTERNETGATEWAYID_DESCRIPTOR, it) }
        input.gatewayId?.let { field(GATEWAYID_DESCRIPTOR, it) }
        input.instanceId?.let { field(INSTANCEID_DESCRIPTOR, it) }
        input.localGatewayId?.let { field(LOCALGATEWAYID_DESCRIPTOR, it) }
        input.natGatewayId?.let { field(NATGATEWAYID_DESCRIPTOR, it) }
        input.networkInterfaceId?.let { field(NETWORKINTERFACEID_DESCRIPTOR, it) }
        input.routeTableId?.let { field(ROUTETABLEID_DESCRIPTOR, it) }
        input.transitGatewayId?.let { field(TRANSITGATEWAYID_DESCRIPTOR, it) }
        input.vpcEndpointId?.let { field(VPCENDPOINTID_DESCRIPTOR, it) }
        input.vpcPeeringConnectionId?.let { field(VPCPEERINGCONNECTIONID_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}
