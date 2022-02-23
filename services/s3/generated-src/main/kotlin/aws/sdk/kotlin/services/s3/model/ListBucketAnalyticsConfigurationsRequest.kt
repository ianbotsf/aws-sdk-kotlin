// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class ListBucketAnalyticsConfigurationsRequest private constructor(builder: Builder) {
    /**
     * The name of the bucket from which analytics configurations are retrieved.
     */
    val bucket: kotlin.String? = builder.bucket
    /**
     * The ContinuationToken that represents a placeholder from where this request should
     * begin.
     */
    val continuationToken: kotlin.String? = builder.continuationToken
    /**
     * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
     */
    val expectedBucketOwner: kotlin.String? = builder.expectedBucketOwner

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.ListBucketAnalyticsConfigurationsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ListBucketAnalyticsConfigurationsRequest(")
        append("bucket=$bucket,")
        append("continuationToken=$continuationToken,")
        append("expectedBucketOwner=$expectedBucketOwner)")
    }

    override fun hashCode(): kotlin.Int {
        var result = bucket?.hashCode() ?: 0
        result = 31 * result + (continuationToken?.hashCode() ?: 0)
        result = 31 * result + (expectedBucketOwner?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ListBucketAnalyticsConfigurationsRequest

        if (bucket != other.bucket) return false
        if (continuationToken != other.continuationToken) return false
        if (expectedBucketOwner != other.expectedBucketOwner) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.ListBucketAnalyticsConfigurationsRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The name of the bucket from which analytics configurations are retrieved.
         */
        var bucket: kotlin.String? = null
        /**
         * The ContinuationToken that represents a placeholder from where this request should
         * begin.
         */
        var continuationToken: kotlin.String? = null
        /**
         * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
         */
        var expectedBucketOwner: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.ListBucketAnalyticsConfigurationsRequest) : this() {
            this.bucket = x.bucket
            this.continuationToken = x.continuationToken
            this.expectedBucketOwner = x.expectedBucketOwner
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.ListBucketAnalyticsConfigurationsRequest = ListBucketAnalyticsConfigurationsRequest(this)
    }
}
