// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.CopyObjectRequest
import aws.sdk.kotlin.services.s3.model.MetadataDirective
import aws.sdk.kotlin.services.s3.model.ObjectCannedAcl
import aws.sdk.kotlin.services.s3.model.ObjectLockLegalHoldStatus
import aws.sdk.kotlin.services.s3.model.ObjectLockMode
import aws.sdk.kotlin.services.s3.model.RequestPayer
import aws.sdk.kotlin.services.s3.model.ServerSideEncryption
import aws.sdk.kotlin.services.s3.model.StorageClass
import aws.sdk.kotlin.services.s3.model.TaggingDirective
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.HttpBody
import aws.smithy.kotlin.runtime.http.HttpMethod
import aws.smithy.kotlin.runtime.http.content.ByteArrayContent
import aws.smithy.kotlin.runtime.http.operation.HttpSerialize
import aws.smithy.kotlin.runtime.http.parameters
import aws.smithy.kotlin.runtime.http.request.HttpRequestBuilder
import aws.smithy.kotlin.runtime.http.request.headers
import aws.smithy.kotlin.runtime.http.request.url
import aws.smithy.kotlin.runtime.http.util.encodeLabel
import aws.smithy.kotlin.runtime.time.Instant
import aws.smithy.kotlin.runtime.time.TimestampFormat


internal class CopyObjectOperationSerializer: HttpSerialize<CopyObjectRequest> {
    override suspend fun serialize(context: ExecutionContext, input: CopyObjectRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.PUT

        builder.url {
            val pathSegments = listOf(
                "${input.bucket}".encodeLabel(),
                "${input.key}".encodeLabel(greedy = true),
            )
            path = pathSegments.joinToString(separator = "/", prefix = "/")
            parameters {
                append("x-id", "CopyObject")
            }
        }

        builder.headers {
            if (input.acl != null) append("x-amz-acl", input.acl.value)
            if (input.bucketKeyEnabled != false) append("x-amz-server-side-encryption-bucket-key-enabled", "${input.bucketKeyEnabled}")
            if (input.cacheControl?.isNotEmpty() == true) append("Cache-Control", input.cacheControl)
            if (input.contentDisposition?.isNotEmpty() == true) append("Content-Disposition", input.contentDisposition)
            if (input.contentEncoding?.isNotEmpty() == true) append("Content-Encoding", input.contentEncoding)
            if (input.contentLanguage?.isNotEmpty() == true) append("Content-Language", input.contentLanguage)
            if (input.contentType?.isNotEmpty() == true) append("Content-Type", input.contentType)
            if (input.copySource?.isNotEmpty() == true) append("x-amz-copy-source", input.copySource)
            if (input.copySourceIfMatch?.isNotEmpty() == true) append("x-amz-copy-source-if-match", input.copySourceIfMatch)
            if (input.copySourceIfModifiedSince != null) append("x-amz-copy-source-if-modified-since", input.copySourceIfModifiedSince.format(TimestampFormat.RFC_5322))
            if (input.copySourceIfNoneMatch?.isNotEmpty() == true) append("x-amz-copy-source-if-none-match", input.copySourceIfNoneMatch)
            if (input.copySourceIfUnmodifiedSince != null) append("x-amz-copy-source-if-unmodified-since", input.copySourceIfUnmodifiedSince.format(TimestampFormat.RFC_5322))
            if (input.copySourceSseCustomerAlgorithm?.isNotEmpty() == true) append("x-amz-copy-source-server-side-encryption-customer-algorithm", input.copySourceSseCustomerAlgorithm)
            if (input.copySourceSseCustomerKey?.isNotEmpty() == true) append("x-amz-copy-source-server-side-encryption-customer-key", input.copySourceSseCustomerKey)
            if (input.copySourceSseCustomerKeyMd5?.isNotEmpty() == true) append("x-amz-copy-source-server-side-encryption-customer-key-MD5", input.copySourceSseCustomerKeyMd5)
            if (input.expectedBucketOwner?.isNotEmpty() == true) append("x-amz-expected-bucket-owner", input.expectedBucketOwner)
            if (input.expectedSourceBucketOwner?.isNotEmpty() == true) append("x-amz-source-expected-bucket-owner", input.expectedSourceBucketOwner)
            if (input.expires != null) append("Expires", input.expires.format(TimestampFormat.RFC_5322))
            if (input.grantFullControl?.isNotEmpty() == true) append("x-amz-grant-full-control", input.grantFullControl)
            if (input.grantRead?.isNotEmpty() == true) append("x-amz-grant-read", input.grantRead)
            if (input.grantReadAcp?.isNotEmpty() == true) append("x-amz-grant-read-acp", input.grantReadAcp)
            if (input.grantWriteAcp?.isNotEmpty() == true) append("x-amz-grant-write-acp", input.grantWriteAcp)
            if (input.metadataDirective != null) append("x-amz-metadata-directive", input.metadataDirective.value)
            if (input.objectLockLegalHoldStatus != null) append("x-amz-object-lock-legal-hold", input.objectLockLegalHoldStatus.value)
            if (input.objectLockMode != null) append("x-amz-object-lock-mode", input.objectLockMode.value)
            if (input.objectLockRetainUntilDate != null) append("x-amz-object-lock-retain-until-date", input.objectLockRetainUntilDate.format(TimestampFormat.ISO_8601))
            if (input.requestPayer != null) append("x-amz-request-payer", input.requestPayer.value)
            if (input.sseCustomerAlgorithm?.isNotEmpty() == true) append("x-amz-server-side-encryption-customer-algorithm", input.sseCustomerAlgorithm)
            if (input.sseCustomerKey?.isNotEmpty() == true) append("x-amz-server-side-encryption-customer-key", input.sseCustomerKey)
            if (input.sseCustomerKeyMd5?.isNotEmpty() == true) append("x-amz-server-side-encryption-customer-key-MD5", input.sseCustomerKeyMd5)
            if (input.ssekmsEncryptionContext?.isNotEmpty() == true) append("x-amz-server-side-encryption-context", input.ssekmsEncryptionContext)
            if (input.ssekmsKeyId?.isNotEmpty() == true) append("x-amz-server-side-encryption-aws-kms-key-id", input.ssekmsKeyId)
            if (input.serverSideEncryption != null) append("x-amz-server-side-encryption", input.serverSideEncryption.value)
            if (input.storageClass != null) append("x-amz-storage-class", input.storageClass.value)
            if (input.tagging?.isNotEmpty() == true) append("x-amz-tagging", input.tagging)
            if (input.taggingDirective != null) append("x-amz-tagging-directive", input.taggingDirective.value)
            if (input.websiteRedirectLocation?.isNotEmpty() == true) append("x-amz-website-redirect-location", input.websiteRedirectLocation)
            input.metadata?.filter { it.value != null }?.forEach { (key, value) ->
                append("x-amz-meta-$key", value!!)
            }
        }

        return builder
    }
}
