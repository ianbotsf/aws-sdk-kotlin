// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class DeleteBucketMetricsConfigurationResponse private constructor(builder: Builder) {

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.DeleteBucketMetricsConfigurationResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteBucketMetricsConfigurationResponse(")
        append(")")
    }

    override fun hashCode(): kotlin.Int {
        return this::class.hashCode()
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeleteBucketMetricsConfigurationResponse

        return true
    }

    class Builder {

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.DeleteBucketMetricsConfigurationResponse) : this() {
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.DeleteBucketMetricsConfigurationResponse = DeleteBucketMetricsConfigurationResponse(this)
    }
}
