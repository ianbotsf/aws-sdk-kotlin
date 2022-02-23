// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.BucketCannedAcl
import aws.sdk.kotlin.services.s3.model.CreateBucketConfiguration
import aws.sdk.kotlin.services.s3.model.CreateBucketRequest
import aws.sdk.kotlin.services.s3.model.ObjectOwnership
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.HttpBody
import aws.smithy.kotlin.runtime.http.HttpMethod
import aws.smithy.kotlin.runtime.http.content.ByteArrayContent
import aws.smithy.kotlin.runtime.http.operation.HttpSerialize
import aws.smithy.kotlin.runtime.http.request.HttpRequestBuilder
import aws.smithy.kotlin.runtime.http.request.headers
import aws.smithy.kotlin.runtime.http.request.url
import aws.smithy.kotlin.runtime.http.util.encodeLabel


internal class CreateBucketOperationSerializer: HttpSerialize<CreateBucketRequest> {
    override suspend fun serialize(context: ExecutionContext, input: CreateBucketRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.PUT

        builder.url {
            val pathSegments = listOf(
                "${input.bucket}".encodeLabel(),
            )
            path = pathSegments.joinToString(separator = "/", prefix = "/")
        }

        builder.headers {
            if (input.acl != null) append("x-amz-acl", input.acl.value)
            if (input.grantFullControl?.isNotEmpty() == true) append("x-amz-grant-full-control", input.grantFullControl)
            if (input.grantRead?.isNotEmpty() == true) append("x-amz-grant-read", input.grantRead)
            if (input.grantReadAcp?.isNotEmpty() == true) append("x-amz-grant-read-acp", input.grantReadAcp)
            if (input.grantWrite?.isNotEmpty() == true) append("x-amz-grant-write", input.grantWrite)
            if (input.grantWriteAcp?.isNotEmpty() == true) append("x-amz-grant-write-acp", input.grantWriteAcp)
            if (input.objectLockEnabledForBucket != false) append("x-amz-bucket-object-lock-enabled", "${input.objectLockEnabledForBucket}")
            if (input.objectOwnership != null) append("x-amz-object-ownership", input.objectOwnership.value)
        }

        if (input.createBucketConfiguration != null) {
            val payload = serializeCreateBucketConfigurationPayloadWithXmlNameCreateBucketConfiguration(input.createBucketConfiguration)
            builder.body = ByteArrayContent(payload)
        }
        builder.headers.setMissing("Content-Type", "application/xml")
        return builder
    }
}
