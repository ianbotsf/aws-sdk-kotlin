// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model

import aws.smithy.kotlin.runtime.content.ByteStream
import aws.smithy.kotlin.runtime.time.Instant

class PutObjectRequest private constructor(builder: Builder) {
    /**
     * The canned ACL to apply to the object. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#CannedACL">Canned
     * ACL.
     * This action is not supported by Amazon S3 on Outposts.
     */
    val acl: aws.sdk.kotlin.services.s3.model.ObjectCannedAcl? = builder.acl
    /**
     * Object data.
     */
    val body: aws.smithy.kotlin.runtime.content.ByteStream? = builder.body
    /**
     * The bucket name to which the PUT action was initiated.
     * When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access points in the Amazon S3 User Guide.
     * When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form AccessPointName-AccountId.outpostID.s3-outposts.Region.amazonaws.com. When using this action using S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using S3 on Outposts in the Amazon S3 User Guide.
     */
    val bucket: kotlin.String? = builder.bucket
    /**
     * Specifies whether Amazon S3 should use an S3 Bucket Key for object encryption with server-side encryption using AWS KMS (SSE-KMS). Setting this header to true causes Amazon S3 to use an S3 Bucket Key for object encryption with SSE-KMS.
     * Specifying this header with a PUT action doesn’t affect bucket-level settings for S3 Bucket Key.
     */
    val bucketKeyEnabled: kotlin.Boolean = builder.bucketKeyEnabled
    /**
     * Can be used to specify caching behavior along the request/reply chain. For more
     * information, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9">http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9.
     */
    val cacheControl: kotlin.String? = builder.cacheControl
    /**
     * Specifies presentational information for the object. For more information, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1">http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1.
     */
    val contentDisposition: kotlin.String? = builder.contentDisposition
    /**
     * Specifies what content encodings have been applied to the object and thus what decoding
     * mechanisms must be applied to obtain the media-type referenced by the Content-Type header
     * field. For more information, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11">http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11.
     */
    val contentEncoding: kotlin.String? = builder.contentEncoding
    /**
     * The language the content is in.
     */
    val contentLanguage: kotlin.String? = builder.contentLanguage
    /**
     * Size of the body in bytes. This parameter is useful when the size of the body cannot be
     * determined automatically. For more information, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.13">http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.13.
     */
    val contentLength: kotlin.Long = builder.contentLength
    /**
     * The base64-encoded 128-bit MD5 digest of the message (without the headers) according to
     * RFC 1864. This header can be used as a message integrity check to verify that the data is
     * the same data that was originally sent. Although it is optional, we recommend using the
     * Content-MD5 mechanism as an end-to-end integrity check. For more information about REST
     * request authentication, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/RESTAuthentication.html">REST
     * Authentication.
     */
    val contentMd5: kotlin.String? = builder.contentMd5
    /**
     * A standard MIME type describing the format of the contents. For more information, see
     * <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17">http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17.
     */
    val contentType: kotlin.String? = builder.contentType
    /**
     * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
     */
    val expectedBucketOwner: kotlin.String? = builder.expectedBucketOwner
    /**
     * The date and time at which the object is no longer cacheable. For more information, see
     * <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.21">http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.21.
     */
    val expires: aws.smithy.kotlin.runtime.time.Instant? = builder.expires
    /**
     * Gives the grantee READ, READ_ACP, and WRITE_ACP permissions on the
     * object.
     * This action is not supported by Amazon S3 on Outposts.
     */
    val grantFullControl: kotlin.String? = builder.grantFullControl
    /**
     * Allows grantee to read the object data and its
     * metadata.
     * This action is not supported by Amazon S3 on Outposts.
     */
    val grantRead: kotlin.String? = builder.grantRead
    /**
     * Allows grantee to read the object ACL.
     * This action is not supported by Amazon S3 on Outposts.
     */
    val grantReadAcp: kotlin.String? = builder.grantReadAcp
    /**
     * Allows grantee to write the ACL for the applicable
     * object.
     * This action is not supported by Amazon S3 on Outposts.
     */
    val grantWriteAcp: kotlin.String? = builder.grantWriteAcp
    /**
     * Object key for which the PUT action was initiated.
     */
    val key: kotlin.String? = builder.key
    /**
     * A map of metadata to store with the object in S3.
     */
    val metadata: Map<String, String>? = builder.metadata
    /**
     * Specifies whether a legal hold will be applied to this object. For more information
     * about S3 Object Lock, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html">Object
     * Lock.
     */
    val objectLockLegalHoldStatus: aws.sdk.kotlin.services.s3.model.ObjectLockLegalHoldStatus? = builder.objectLockLegalHoldStatus
    /**
     * The Object Lock mode that you want to apply to this object.
     */
    val objectLockMode: aws.sdk.kotlin.services.s3.model.ObjectLockMode? = builder.objectLockMode
    /**
     * The date and time when you want this object's Object Lock to expire. Must be formatted
     * as a timestamp parameter.
     */
    val objectLockRetainUntilDate: aws.smithy.kotlin.runtime.time.Instant? = builder.objectLockRetainUntilDate
    /**
     * Confirms that the requester knows that they will be charged for the request. Bucket
     * owners need not specify this parameter in their requests. For information about downloading
     * objects from requester pays buckets, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html">Downloading Objects in
     * Requestor Pays Buckets in the Amazon S3 User Guide.
     */
    val requestPayer: aws.sdk.kotlin.services.s3.model.RequestPayer? = builder.requestPayer
    /**
     * The server-side encryption algorithm used when storing this object in Amazon S3 (for example,
     * AES256, aws:kms).
     */
    val serverSideEncryption: aws.sdk.kotlin.services.s3.model.ServerSideEncryption? = builder.serverSideEncryption
    /**
     * Specifies the algorithm to use to when encrypting the object (for example,
     * AES256).
     */
    val sseCustomerAlgorithm: kotlin.String? = builder.sseCustomerAlgorithm
    /**
     * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This
     * value is used to store the object and then it is discarded; Amazon S3 does not store the
     * encryption key. The key must be appropriate for use with the algorithm specified in the
     * x-amz-server-side-encryption-customer-algorithm header.
     */
    val sseCustomerKey: kotlin.String? = builder.sseCustomerKey
    /**
     * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses
     * this header for a message integrity check to ensure that the encryption key was transmitted
     * without error.
     */
    val sseCustomerKeyMd5: kotlin.String? = builder.sseCustomerKeyMd5
    /**
     * Specifies the Amazon Web Services KMS Encryption Context to use for object encryption. The value of this
     * header is a base64-encoded UTF-8 string holding JSON with the encryption context key-value
     * pairs.
     */
    val ssekmsEncryptionContext: kotlin.String? = builder.ssekmsEncryptionContext
    /**
     * If x-amz-server-side-encryption is present and has the value of
     * aws:kms, this header specifies the ID of the Amazon Web Services Key Management Service
     * (Amazon Web Services KMS) symmetrical customer managed key that was used for the
     * object. If you specify x-amz-server-side-encryption:aws:kms, but do not
     * provide x-amz-server-side-encryption-aws-kms-key-id, Amazon S3 uses the Amazon Web Services
     * managed key to protect the data. If the KMS key does not exist in the same account
     * issuing the command, you must use the full ARN and not just the ID.
     */
    val ssekmsKeyId: kotlin.String? = builder.ssekmsKeyId
    /**
     * By default, Amazon S3 uses the STANDARD Storage Class to store newly created objects. The
     * STANDARD storage class provides high durability and high availability. Depending on
     * performance needs, you can specify a different Storage Class. Amazon S3 on Outposts only uses
     * the OUTPOSTS Storage Class. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html">Storage Classes in the
     * Amazon S3 User Guide.
     */
    val storageClass: aws.sdk.kotlin.services.s3.model.StorageClass? = builder.storageClass
    /**
     * The tag-set for the object. The tag-set must be encoded as URL Query parameters. (For
     * example, "Key1=Value1")
     */
    val tagging: kotlin.String? = builder.tagging
    /**
     * If the bucket is configured as a website, redirects requests for this object to another
     * object in the same bucket or to an external URL. Amazon S3 stores the value of this header in
     * the object metadata. For information about object metadata, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html">Object Key and Metadata.
     *
     * In the following example, the request header sets the redirect to an object
     * (anotherPage.html) in the same bucket:
     *
     *
     * x-amz-website-redirect-location: /anotherPage.html
     *
     *
     * In the following example, the request header sets the object redirect to another
     * website:
     *
     *
     * x-amz-website-redirect-location: http://www.example.com/
     *
     *
     * For more information about website hosting in Amazon S3, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html">Hosting Websites on Amazon S3 and <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html">How to Configure Website Page
     * Redirects.
     */
    val websiteRedirectLocation: kotlin.String? = builder.websiteRedirectLocation

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.PutObjectRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("PutObjectRequest(")
        append("acl=$acl,")
        append("body=$body,")
        append("bucket=$bucket,")
        append("bucketKeyEnabled=$bucketKeyEnabled,")
        append("cacheControl=$cacheControl,")
        append("contentDisposition=$contentDisposition,")
        append("contentEncoding=$contentEncoding,")
        append("contentLanguage=$contentLanguage,")
        append("contentLength=$contentLength,")
        append("contentMd5=$contentMd5,")
        append("contentType=$contentType,")
        append("expectedBucketOwner=$expectedBucketOwner,")
        append("expires=$expires,")
        append("grantFullControl=$grantFullControl,")
        append("grantRead=$grantRead,")
        append("grantReadAcp=$grantReadAcp,")
        append("grantWriteAcp=$grantWriteAcp,")
        append("key=$key,")
        append("metadata=$metadata,")
        append("objectLockLegalHoldStatus=$objectLockLegalHoldStatus,")
        append("objectLockMode=$objectLockMode,")
        append("objectLockRetainUntilDate=$objectLockRetainUntilDate,")
        append("requestPayer=$requestPayer,")
        append("serverSideEncryption=$serverSideEncryption,")
        append("sseCustomerAlgorithm=$sseCustomerAlgorithm,")
        append("sseCustomerKey=*** Sensitive Data Redacted ***,")
        append("sseCustomerKeyMd5=$sseCustomerKeyMd5,")
        append("ssekmsEncryptionContext=*** Sensitive Data Redacted ***,")
        append("ssekmsKeyId=*** Sensitive Data Redacted ***,")
        append("storageClass=$storageClass,")
        append("tagging=$tagging,")
        append("websiteRedirectLocation=$websiteRedirectLocation)")
    }

    override fun hashCode(): kotlin.Int {
        var result = acl?.hashCode() ?: 0
        result = 31 * result + (body?.hashCode() ?: 0)
        result = 31 * result + (bucket?.hashCode() ?: 0)
        result = 31 * result + (bucketKeyEnabled.hashCode())
        result = 31 * result + (cacheControl?.hashCode() ?: 0)
        result = 31 * result + (contentDisposition?.hashCode() ?: 0)
        result = 31 * result + (contentEncoding?.hashCode() ?: 0)
        result = 31 * result + (contentLanguage?.hashCode() ?: 0)
        result = 31 * result + (contentLength.hashCode())
        result = 31 * result + (contentMd5?.hashCode() ?: 0)
        result = 31 * result + (contentType?.hashCode() ?: 0)
        result = 31 * result + (expectedBucketOwner?.hashCode() ?: 0)
        result = 31 * result + (expires?.hashCode() ?: 0)
        result = 31 * result + (grantFullControl?.hashCode() ?: 0)
        result = 31 * result + (grantRead?.hashCode() ?: 0)
        result = 31 * result + (grantReadAcp?.hashCode() ?: 0)
        result = 31 * result + (grantWriteAcp?.hashCode() ?: 0)
        result = 31 * result + (key?.hashCode() ?: 0)
        result = 31 * result + (metadata?.hashCode() ?: 0)
        result = 31 * result + (objectLockLegalHoldStatus?.hashCode() ?: 0)
        result = 31 * result + (objectLockMode?.hashCode() ?: 0)
        result = 31 * result + (objectLockRetainUntilDate?.hashCode() ?: 0)
        result = 31 * result + (requestPayer?.hashCode() ?: 0)
        result = 31 * result + (serverSideEncryption?.hashCode() ?: 0)
        result = 31 * result + (sseCustomerAlgorithm?.hashCode() ?: 0)
        result = 31 * result + (sseCustomerKey?.hashCode() ?: 0)
        result = 31 * result + (sseCustomerKeyMd5?.hashCode() ?: 0)
        result = 31 * result + (ssekmsEncryptionContext?.hashCode() ?: 0)
        result = 31 * result + (ssekmsKeyId?.hashCode() ?: 0)
        result = 31 * result + (storageClass?.hashCode() ?: 0)
        result = 31 * result + (tagging?.hashCode() ?: 0)
        result = 31 * result + (websiteRedirectLocation?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as PutObjectRequest

        if (acl != other.acl) return false
        if (body != other.body) return false
        if (bucket != other.bucket) return false
        if (bucketKeyEnabled != other.bucketKeyEnabled) return false
        if (cacheControl != other.cacheControl) return false
        if (contentDisposition != other.contentDisposition) return false
        if (contentEncoding != other.contentEncoding) return false
        if (contentLanguage != other.contentLanguage) return false
        if (contentLength != other.contentLength) return false
        if (contentMd5 != other.contentMd5) return false
        if (contentType != other.contentType) return false
        if (expectedBucketOwner != other.expectedBucketOwner) return false
        if (expires != other.expires) return false
        if (grantFullControl != other.grantFullControl) return false
        if (grantRead != other.grantRead) return false
        if (grantReadAcp != other.grantReadAcp) return false
        if (grantWriteAcp != other.grantWriteAcp) return false
        if (key != other.key) return false
        if (metadata != other.metadata) return false
        if (objectLockLegalHoldStatus != other.objectLockLegalHoldStatus) return false
        if (objectLockMode != other.objectLockMode) return false
        if (objectLockRetainUntilDate != other.objectLockRetainUntilDate) return false
        if (requestPayer != other.requestPayer) return false
        if (serverSideEncryption != other.serverSideEncryption) return false
        if (sseCustomerAlgorithm != other.sseCustomerAlgorithm) return false
        if (sseCustomerKey != other.sseCustomerKey) return false
        if (sseCustomerKeyMd5 != other.sseCustomerKeyMd5) return false
        if (ssekmsEncryptionContext != other.ssekmsEncryptionContext) return false
        if (ssekmsKeyId != other.ssekmsKeyId) return false
        if (storageClass != other.storageClass) return false
        if (tagging != other.tagging) return false
        if (websiteRedirectLocation != other.websiteRedirectLocation) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.PutObjectRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The canned ACL to apply to the object. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#CannedACL">Canned
         * ACL.
         * This action is not supported by Amazon S3 on Outposts.
         */
        var acl: aws.sdk.kotlin.services.s3.model.ObjectCannedAcl? = null
        /**
         * Object data.
         */
        var body: aws.smithy.kotlin.runtime.content.ByteStream? = null
        /**
         * The bucket name to which the PUT action was initiated.
         * When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access points in the Amazon S3 User Guide.
         * When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form AccessPointName-AccountId.outpostID.s3-outposts.Region.amazonaws.com. When using this action using S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using S3 on Outposts in the Amazon S3 User Guide.
         */
        var bucket: kotlin.String? = null
        /**
         * Specifies whether Amazon S3 should use an S3 Bucket Key for object encryption with server-side encryption using AWS KMS (SSE-KMS). Setting this header to true causes Amazon S3 to use an S3 Bucket Key for object encryption with SSE-KMS.
         * Specifying this header with a PUT action doesn’t affect bucket-level settings for S3 Bucket Key.
         */
        var bucketKeyEnabled: kotlin.Boolean = false
        /**
         * Can be used to specify caching behavior along the request/reply chain. For more
         * information, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9">http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.9.
         */
        var cacheControl: kotlin.String? = null
        /**
         * Specifies presentational information for the object. For more information, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1">http://www.w3.org/Protocols/rfc2616/rfc2616-sec19.html#sec19.5.1.
         */
        var contentDisposition: kotlin.String? = null
        /**
         * Specifies what content encodings have been applied to the object and thus what decoding
         * mechanisms must be applied to obtain the media-type referenced by the Content-Type header
         * field. For more information, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11">http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.11.
         */
        var contentEncoding: kotlin.String? = null
        /**
         * The language the content is in.
         */
        var contentLanguage: kotlin.String? = null
        /**
         * Size of the body in bytes. This parameter is useful when the size of the body cannot be
         * determined automatically. For more information, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.13">http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.13.
         */
        var contentLength: kotlin.Long = 0L
        /**
         * The base64-encoded 128-bit MD5 digest of the message (without the headers) according to
         * RFC 1864. This header can be used as a message integrity check to verify that the data is
         * the same data that was originally sent. Although it is optional, we recommend using the
         * Content-MD5 mechanism as an end-to-end integrity check. For more information about REST
         * request authentication, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/RESTAuthentication.html">REST
         * Authentication.
         */
        var contentMd5: kotlin.String? = null
        /**
         * A standard MIME type describing the format of the contents. For more information, see
         * <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17">http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.17.
         */
        var contentType: kotlin.String? = null
        /**
         * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
         */
        var expectedBucketOwner: kotlin.String? = null
        /**
         * The date and time at which the object is no longer cacheable. For more information, see
         * <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.21">http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.21.
         */
        var expires: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * Gives the grantee READ, READ_ACP, and WRITE_ACP permissions on the
         * object.
         * This action is not supported by Amazon S3 on Outposts.
         */
        var grantFullControl: kotlin.String? = null
        /**
         * Allows grantee to read the object data and its
         * metadata.
         * This action is not supported by Amazon S3 on Outposts.
         */
        var grantRead: kotlin.String? = null
        /**
         * Allows grantee to read the object ACL.
         * This action is not supported by Amazon S3 on Outposts.
         */
        var grantReadAcp: kotlin.String? = null
        /**
         * Allows grantee to write the ACL for the applicable
         * object.
         * This action is not supported by Amazon S3 on Outposts.
         */
        var grantWriteAcp: kotlin.String? = null
        /**
         * Object key for which the PUT action was initiated.
         */
        var key: kotlin.String? = null
        /**
         * A map of metadata to store with the object in S3.
         */
        var metadata: Map<String, String>? = null
        /**
         * Specifies whether a legal hold will be applied to this object. For more information
         * about S3 Object Lock, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock.html">Object
         * Lock.
         */
        var objectLockLegalHoldStatus: aws.sdk.kotlin.services.s3.model.ObjectLockLegalHoldStatus? = null
        /**
         * The Object Lock mode that you want to apply to this object.
         */
        var objectLockMode: aws.sdk.kotlin.services.s3.model.ObjectLockMode? = null
        /**
         * The date and time when you want this object's Object Lock to expire. Must be formatted
         * as a timestamp parameter.
         */
        var objectLockRetainUntilDate: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * Confirms that the requester knows that they will be charged for the request. Bucket
         * owners need not specify this parameter in their requests. For information about downloading
         * objects from requester pays buckets, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html">Downloading Objects in
         * Requestor Pays Buckets in the Amazon S3 User Guide.
         */
        var requestPayer: aws.sdk.kotlin.services.s3.model.RequestPayer? = null
        /**
         * The server-side encryption algorithm used when storing this object in Amazon S3 (for example,
         * AES256, aws:kms).
         */
        var serverSideEncryption: aws.sdk.kotlin.services.s3.model.ServerSideEncryption? = null
        /**
         * Specifies the algorithm to use to when encrypting the object (for example,
         * AES256).
         */
        var sseCustomerAlgorithm: kotlin.String? = null
        /**
         * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This
         * value is used to store the object and then it is discarded; Amazon S3 does not store the
         * encryption key. The key must be appropriate for use with the algorithm specified in the
         * x-amz-server-side-encryption-customer-algorithm header.
         */
        var sseCustomerKey: kotlin.String? = null
        /**
         * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses
         * this header for a message integrity check to ensure that the encryption key was transmitted
         * without error.
         */
        var sseCustomerKeyMd5: kotlin.String? = null
        /**
         * Specifies the Amazon Web Services KMS Encryption Context to use for object encryption. The value of this
         * header is a base64-encoded UTF-8 string holding JSON with the encryption context key-value
         * pairs.
         */
        var ssekmsEncryptionContext: kotlin.String? = null
        /**
         * If x-amz-server-side-encryption is present and has the value of
         * aws:kms, this header specifies the ID of the Amazon Web Services Key Management Service
         * (Amazon Web Services KMS) symmetrical customer managed key that was used for the
         * object. If you specify x-amz-server-side-encryption:aws:kms, but do not
         * provide x-amz-server-side-encryption-aws-kms-key-id, Amazon S3 uses the Amazon Web Services
         * managed key to protect the data. If the KMS key does not exist in the same account
         * issuing the command, you must use the full ARN and not just the ID.
         */
        var ssekmsKeyId: kotlin.String? = null
        /**
         * By default, Amazon S3 uses the STANDARD Storage Class to store newly created objects. The
         * STANDARD storage class provides high durability and high availability. Depending on
         * performance needs, you can specify a different Storage Class. Amazon S3 on Outposts only uses
         * the OUTPOSTS Storage Class. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html">Storage Classes in the
         * Amazon S3 User Guide.
         */
        var storageClass: aws.sdk.kotlin.services.s3.model.StorageClass? = null
        /**
         * The tag-set for the object. The tag-set must be encoded as URL Query parameters. (For
         * example, "Key1=Value1")
         */
        var tagging: kotlin.String? = null
        /**
         * If the bucket is configured as a website, redirects requests for this object to another
         * object in the same bucket or to an external URL. Amazon S3 stores the value of this header in
         * the object metadata. For information about object metadata, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingMetadata.html">Object Key and Metadata.
         *
         * In the following example, the request header sets the redirect to an object
         * (anotherPage.html) in the same bucket:
         *
         *
         * x-amz-website-redirect-location: /anotherPage.html
         *
         *
         * In the following example, the request header sets the object redirect to another
         * website:
         *
         *
         * x-amz-website-redirect-location: http://www.example.com/
         *
         *
         * For more information about website hosting in Amazon S3, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html">Hosting Websites on Amazon S3 and <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/how-to-page-redirect.html">How to Configure Website Page
         * Redirects.
         */
        var websiteRedirectLocation: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.PutObjectRequest) : this() {
            this.acl = x.acl
            this.body = x.body
            this.bucket = x.bucket
            this.bucketKeyEnabled = x.bucketKeyEnabled
            this.cacheControl = x.cacheControl
            this.contentDisposition = x.contentDisposition
            this.contentEncoding = x.contentEncoding
            this.contentLanguage = x.contentLanguage
            this.contentLength = x.contentLength
            this.contentMd5 = x.contentMd5
            this.contentType = x.contentType
            this.expectedBucketOwner = x.expectedBucketOwner
            this.expires = x.expires
            this.grantFullControl = x.grantFullControl
            this.grantRead = x.grantRead
            this.grantReadAcp = x.grantReadAcp
            this.grantWriteAcp = x.grantWriteAcp
            this.key = x.key
            this.metadata = x.metadata
            this.objectLockLegalHoldStatus = x.objectLockLegalHoldStatus
            this.objectLockMode = x.objectLockMode
            this.objectLockRetainUntilDate = x.objectLockRetainUntilDate
            this.requestPayer = x.requestPayer
            this.serverSideEncryption = x.serverSideEncryption
            this.sseCustomerAlgorithm = x.sseCustomerAlgorithm
            this.sseCustomerKey = x.sseCustomerKey
            this.sseCustomerKeyMd5 = x.sseCustomerKeyMd5
            this.ssekmsEncryptionContext = x.ssekmsEncryptionContext
            this.ssekmsKeyId = x.ssekmsKeyId
            this.storageClass = x.storageClass
            this.tagging = x.tagging
            this.websiteRedirectLocation = x.websiteRedirectLocation
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.PutObjectRequest = PutObjectRequest(this)
    }
}
