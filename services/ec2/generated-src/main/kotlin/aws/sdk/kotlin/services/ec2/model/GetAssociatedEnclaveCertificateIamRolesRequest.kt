// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class GetAssociatedEnclaveCertificateIamRolesRequest private constructor(builder: Builder) {
    /**
     * The ARN of the ACM certificate for which to view the associated IAM roles, encryption keys, and Amazon
     * S3 object information.
     */
    val certificateArn: kotlin.String? = builder.certificateArn
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.GetAssociatedEnclaveCertificateIamRolesRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("GetAssociatedEnclaveCertificateIamRolesRequest(")
        append("certificateArn=$certificateArn,")
        append("dryRun=$dryRun)")
    }

    override fun hashCode(): kotlin.Int {
        var result = certificateArn?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as GetAssociatedEnclaveCertificateIamRolesRequest

        if (certificateArn != other.certificateArn) return false
        if (dryRun != other.dryRun) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.GetAssociatedEnclaveCertificateIamRolesRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The ARN of the ACM certificate for which to view the associated IAM roles, encryption keys, and Amazon
         * S3 object information.
         */
        var certificateArn: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.GetAssociatedEnclaveCertificateIamRolesRequest) : this() {
            this.certificateArn = x.certificateArn
            this.dryRun = x.dryRun
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.GetAssociatedEnclaveCertificateIamRolesRequest = GetAssociatedEnclaveCertificateIamRolesRequest(this)
    }
}
