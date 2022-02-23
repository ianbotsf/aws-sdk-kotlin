// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class CreateTrafficMirrorTargetRequest private constructor(builder: Builder) {
    /**
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to ensure idempotency.
     */
    val clientToken: kotlin.String? = builder.clientToken
    /**
     * The description of the Traffic Mirror target.
     */
    val description: kotlin.String? = builder.description
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The network interface ID that is associated with the target.
     */
    val networkInterfaceId: kotlin.String? = builder.networkInterfaceId
    /**
     * The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
     */
    val networkLoadBalancerArn: kotlin.String? = builder.networkLoadBalancerArn
    /**
     * The tags to assign to the Traffic Mirror target.
     */
    val tagSpecifications: List<TagSpecification>? = builder.tagSpecifications

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreateTrafficMirrorTargetRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateTrafficMirrorTargetRequest(")
        append("clientToken=$clientToken,")
        append("description=$description,")
        append("dryRun=$dryRun,")
        append("networkInterfaceId=$networkInterfaceId,")
        append("networkLoadBalancerArn=$networkLoadBalancerArn,")
        append("tagSpecifications=$tagSpecifications)")
    }

    override fun hashCode(): kotlin.Int {
        var result = clientToken?.hashCode() ?: 0
        result = 31 * result + (description?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (networkInterfaceId?.hashCode() ?: 0)
        result = 31 * result + (networkLoadBalancerArn?.hashCode() ?: 0)
        result = 31 * result + (tagSpecifications?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateTrafficMirrorTargetRequest

        if (clientToken != other.clientToken) return false
        if (description != other.description) return false
        if (dryRun != other.dryRun) return false
        if (networkInterfaceId != other.networkInterfaceId) return false
        if (networkLoadBalancerArn != other.networkLoadBalancerArn) return false
        if (tagSpecifications != other.tagSpecifications) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreateTrafficMirrorTargetRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to ensure idempotency.
         */
        var clientToken: kotlin.String? = null
        /**
         * The description of the Traffic Mirror target.
         */
        var description: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The network interface ID that is associated with the target.
         */
        var networkInterfaceId: kotlin.String? = null
        /**
         * The Amazon Resource Name (ARN) of the Network Load Balancer that is associated with the target.
         */
        var networkLoadBalancerArn: kotlin.String? = null
        /**
         * The tags to assign to the Traffic Mirror target.
         */
        var tagSpecifications: List<TagSpecification>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreateTrafficMirrorTargetRequest) : this() {
            this.clientToken = x.clientToken
            this.description = x.description
            this.dryRun = x.dryRun
            this.networkInterfaceId = x.networkInterfaceId
            this.networkLoadBalancerArn = x.networkLoadBalancerArn
            this.tagSpecifications = x.tagSpecifications
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreateTrafficMirrorTargetRequest = CreateTrafficMirrorTargetRequest(this)
    }
}
