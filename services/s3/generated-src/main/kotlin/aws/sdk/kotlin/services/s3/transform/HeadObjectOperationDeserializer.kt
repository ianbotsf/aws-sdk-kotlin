// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.services.s3.internal.S3ErrorDetails
import aws.sdk.kotlin.services.s3.internal.parseS3ErrorResponse
import aws.sdk.kotlin.services.s3.internal.setS3ErrorMetadata
import aws.sdk.kotlin.services.s3.model.ArchiveStatus
import aws.sdk.kotlin.services.s3.model.HeadObjectResponse
import aws.sdk.kotlin.services.s3.model.ObjectLockLegalHoldStatus
import aws.sdk.kotlin.services.s3.model.ObjectLockMode
import aws.sdk.kotlin.services.s3.model.ReplicationStatus
import aws.sdk.kotlin.services.s3.model.RequestCharged
import aws.sdk.kotlin.services.s3.model.S3Exception
import aws.sdk.kotlin.services.s3.model.ServerSideEncryption
import aws.sdk.kotlin.services.s3.model.StorageClass
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.HttpStatusCode
import aws.smithy.kotlin.runtime.http.isSuccess
import aws.smithy.kotlin.runtime.http.operation.HttpDeserialize
import aws.smithy.kotlin.runtime.http.readAll
import aws.smithy.kotlin.runtime.http.response.HttpResponse
import aws.smithy.kotlin.runtime.time.Instant


internal class HeadObjectOperationDeserializer: HttpDeserialize<HeadObjectResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): HeadObjectResponse {
        if (!response.status.isSuccess()) {
            throwHeadObjectError(context, response)
        }
        val builder = HeadObjectResponse.Builder()

        builder.acceptRanges = response.headers["accept-ranges"]
        builder.archiveStatus = response.headers["x-amz-archive-status"]?.let { ArchiveStatus.fromValue(it) }
        builder.bucketKeyEnabled = response.headers["x-amz-server-side-encryption-bucket-key-enabled"]?.toBoolean() ?: false
        builder.cacheControl = response.headers["Cache-Control"]
        builder.contentDisposition = response.headers["Content-Disposition"]
        builder.contentEncoding = response.headers["Content-Encoding"]
        builder.contentLanguage = response.headers["Content-Language"]
        builder.contentLength = response.headers["Content-Length"]?.toLong() ?: 0L
        builder.contentType = response.headers["Content-Type"]
        builder.deleteMarker = response.headers["x-amz-delete-marker"]?.toBoolean() ?: false
        builder.eTag = response.headers["ETag"]
        builder.expiration = response.headers["x-amz-expiration"]
        builder.expires = response.headers["Expires"]?.let { Instant.fromRfc5322(it) }
        builder.lastModified = response.headers["Last-Modified"]?.let { Instant.fromRfc5322(it) }
        builder.missingMeta = response.headers["x-amz-missing-meta"]?.toInt() ?: 0
        builder.objectLockLegalHoldStatus = response.headers["x-amz-object-lock-legal-hold"]?.let { ObjectLockLegalHoldStatus.fromValue(it) }
        builder.objectLockMode = response.headers["x-amz-object-lock-mode"]?.let { ObjectLockMode.fromValue(it) }
        builder.objectLockRetainUntilDate = response.headers["x-amz-object-lock-retain-until-date"]?.let { Instant.fromIso8601(it) }
        builder.partsCount = response.headers["x-amz-mp-parts-count"]?.toInt() ?: 0
        builder.replicationStatus = response.headers["x-amz-replication-status"]?.let { ReplicationStatus.fromValue(it) }
        builder.requestCharged = response.headers["x-amz-request-charged"]?.let { RequestCharged.fromValue(it) }
        builder.restore = response.headers["x-amz-restore"]
        builder.sseCustomerAlgorithm = response.headers["x-amz-server-side-encryption-customer-algorithm"]
        builder.sseCustomerKeyMd5 = response.headers["x-amz-server-side-encryption-customer-key-MD5"]
        builder.ssekmsKeyId = response.headers["x-amz-server-side-encryption-aws-kms-key-id"]
        builder.serverSideEncryption = response.headers["x-amz-server-side-encryption"]?.let { ServerSideEncryption.fromValue(it) }
        builder.storageClass = response.headers["x-amz-storage-class"]?.let { StorageClass.fromValue(it) }
        builder.versionId = response.headers["x-amz-version-id"]
        builder.websiteRedirectLocation = response.headers["x-amz-website-redirect-location"]
        val keysForMetadata = response.headers.names().filter { it.startsWith("x-amz-meta-") }
        if (keysForMetadata.isNotEmpty()) {
            val map = mutableMapOf<String, String>()
            for (hdrKey in keysForMetadata) {
                val el = response.headers[hdrKey] ?: continue
                val key = hdrKey.removePrefix("x-amz-meta-")
                map[key] = el
            }
            builder.metadata = map
        } else {
            builder.metadata = emptyMap()
        }

        return builder.build()
    }
}

private suspend fun throwHeadObjectError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
    val payload = response.body.readAll()
    val wrappedResponse = response.withPayload(payload)

    val errorDetails = try {
        if (payload == null && response.status == HttpStatusCode.NotFound) {
            S3ErrorDetails(code = "NotFound")
        } else {
            checkNotNull(payload){ "unable to parse error from empty response" }
            parseS3ErrorResponse(payload)
        }
    } catch (ex: Exception) {
        throw S3Exception("Failed to parse response as 'restXml' error", ex).also {
            setS3ErrorMetadata(it, wrappedResponse, null)
        }
    }

    val ex = when(errorDetails.code) {
        "NotFound" -> NotFoundDeserializer().deserialize(context, wrappedResponse)
        else -> S3Exception(errorDetails.message)
    }

    setS3ErrorMetadata(ex, wrappedResponse, errorDetails)
    throw ex
}
