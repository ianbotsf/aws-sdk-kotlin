// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

class EnableImageDeprecationRequest private constructor(builder: Builder) {
    /**
     * The date and time to deprecate the AMI, in UTC, in the following format:
     * YYYY-MM-DDTHH:MM:SSZ.
     * If you specify a value for seconds, Amazon EC2 rounds the seconds to the
     * nearest minute.
     * You can’t specify a date in the past. The upper limit for DeprecateAt is 10
     * years from now.
     */
    val deprecateAt: aws.smithy.kotlin.runtime.time.Instant? = builder.deprecateAt
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is
     * DryRunOperation. Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ID of the AMI.
     */
    val imageId: kotlin.String? = builder.imageId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.EnableImageDeprecationRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("EnableImageDeprecationRequest(")
        append("deprecateAt=$deprecateAt,")
        append("dryRun=$dryRun,")
        append("imageId=$imageId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = deprecateAt?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (imageId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as EnableImageDeprecationRequest

        if (deprecateAt != other.deprecateAt) return false
        if (dryRun != other.dryRun) return false
        if (imageId != other.imageId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.EnableImageDeprecationRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The date and time to deprecate the AMI, in UTC, in the following format:
         * YYYY-MM-DDTHH:MM:SSZ.
         * If you specify a value for seconds, Amazon EC2 rounds the seconds to the
         * nearest minute.
         * You can’t specify a date in the past. The upper limit for DeprecateAt is 10
         * years from now.
         */
        var deprecateAt: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is
         * DryRunOperation. Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The ID of the AMI.
         */
        var imageId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.EnableImageDeprecationRequest) : this() {
            this.deprecateAt = x.deprecateAt
            this.dryRun = x.dryRun
            this.imageId = x.imageId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.EnableImageDeprecationRequest = EnableImageDeprecationRequest(this)
    }
}
