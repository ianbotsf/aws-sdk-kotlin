// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the parameters for DetachNetworkInterface.
 */
class DetachNetworkInterfaceRequest private constructor(builder: Builder) {
    /**
     * The ID of the attachment.
     */
    val attachmentId: kotlin.String? = builder.attachmentId
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * Specifies whether to force a detachment.
     *
     *
     *
     * Use the Force parameter only as a last resort to detach a network interface from a failed instance.
     *
     *
     * If you use the Force parameter to detach a network interface, you might not be able to attach a different network interface to the same index on the instance without first stopping and starting the instance.
     *
     *
     * If you force the detachment of a network interface, the <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">instance metadata
     * might not get updated. This means that the attributes associated
     * with the detached network interface might still be visible. The
     * instance metadata will get updated when you stop and start the
     * instance.
     */
    val force: kotlin.Boolean? = builder.force

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DetachNetworkInterfaceRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DetachNetworkInterfaceRequest(")
        append("attachmentId=$attachmentId,")
        append("dryRun=$dryRun,")
        append("force=$force)")
    }

    override fun hashCode(): kotlin.Int {
        var result = attachmentId?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (force?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DetachNetworkInterfaceRequest

        if (attachmentId != other.attachmentId) return false
        if (dryRun != other.dryRun) return false
        if (force != other.force) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DetachNetworkInterfaceRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The ID of the attachment.
         */
        var attachmentId: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * Specifies whether to force a detachment.
         *
         *
         *
         * Use the Force parameter only as a last resort to detach a network interface from a failed instance.
         *
         *
         * If you use the Force parameter to detach a network interface, you might not be able to attach a different network interface to the same index on the instance without first stopping and starting the instance.
         *
         *
         * If you force the detachment of a network interface, the <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html">instance metadata
         * might not get updated. This means that the attributes associated
         * with the detached network interface might still be visible. The
         * instance metadata will get updated when you stop and start the
         * instance.
         */
        var force: kotlin.Boolean? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DetachNetworkInterfaceRequest) : this() {
            this.attachmentId = x.attachmentId
            this.dryRun = x.dryRun
            this.force = x.force
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DetachNetworkInterfaceRequest = DetachNetworkInterfaceRequest(this)
    }
}
