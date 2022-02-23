// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the parameters for CreateVpnConnection.
 */
class CreateVpnConnectionRequest private constructor(builder: Builder) {
    /**
     * The ID of the customer gateway.
     */
    val customerGatewayId: kotlin.String? = builder.customerGatewayId
    /**
     * Checks whether you have the required permissions for the action, without actually
     * making the request, and provides an error response. If you have the required
     * permissions, the error response is DryRunOperation. Otherwise, it is
     * UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The options for the VPN connection.
     */
    val options: aws.sdk.kotlin.services.ec2.model.VpnConnectionOptionsSpecification? = builder.options
    /**
     * The tags to apply to the VPN connection.
     */
    val tagSpecifications: List<TagSpecification>? = builder.tagSpecifications
    /**
     * The ID of the transit gateway. If you specify a transit gateway, you cannot specify a virtual private
     * gateway.
     */
    val transitGatewayId: kotlin.String? = builder.transitGatewayId
    /**
     * The type of VPN connection (ipsec.1).
     */
    val type: kotlin.String? = builder.type
    /**
     * The ID of the virtual private gateway. If you specify a virtual private gateway, you
     * cannot specify a transit gateway.
     */
    val vpnGatewayId: kotlin.String? = builder.vpnGatewayId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreateVpnConnectionRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateVpnConnectionRequest(")
        append("customerGatewayId=$customerGatewayId,")
        append("dryRun=$dryRun,")
        append("options=$options,")
        append("tagSpecifications=$tagSpecifications,")
        append("transitGatewayId=$transitGatewayId,")
        append("type=$type,")
        append("vpnGatewayId=$vpnGatewayId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = customerGatewayId?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (options?.hashCode() ?: 0)
        result = 31 * result + (tagSpecifications?.hashCode() ?: 0)
        result = 31 * result + (transitGatewayId?.hashCode() ?: 0)
        result = 31 * result + (type?.hashCode() ?: 0)
        result = 31 * result + (vpnGatewayId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateVpnConnectionRequest

        if (customerGatewayId != other.customerGatewayId) return false
        if (dryRun != other.dryRun) return false
        if (options != other.options) return false
        if (tagSpecifications != other.tagSpecifications) return false
        if (transitGatewayId != other.transitGatewayId) return false
        if (type != other.type) return false
        if (vpnGatewayId != other.vpnGatewayId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreateVpnConnectionRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The ID of the customer gateway.
         */
        var customerGatewayId: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually
         * making the request, and provides an error response. If you have the required
         * permissions, the error response is DryRunOperation. Otherwise, it is
         * UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The options for the VPN connection.
         */
        var options: aws.sdk.kotlin.services.ec2.model.VpnConnectionOptionsSpecification? = null
        /**
         * The tags to apply to the VPN connection.
         */
        var tagSpecifications: List<TagSpecification>? = null
        /**
         * The ID of the transit gateway. If you specify a transit gateway, you cannot specify a virtual private
         * gateway.
         */
        var transitGatewayId: kotlin.String? = null
        /**
         * The type of VPN connection (ipsec.1).
         */
        var type: kotlin.String? = null
        /**
         * The ID of the virtual private gateway. If you specify a virtual private gateway, you
         * cannot specify a transit gateway.
         */
        var vpnGatewayId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreateVpnConnectionRequest) : this() {
            this.customerGatewayId = x.customerGatewayId
            this.dryRun = x.dryRun
            this.options = x.options
            this.tagSpecifications = x.tagSpecifications
            this.transitGatewayId = x.transitGatewayId
            this.type = x.type
            this.vpnGatewayId = x.vpnGatewayId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreateVpnConnectionRequest = CreateVpnConnectionRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.VpnConnectionOptionsSpecification] inside the given [block]
         */
        fun options(block: aws.sdk.kotlin.services.ec2.model.VpnConnectionOptionsSpecification.Builder.() -> kotlin.Unit) {
            this.options = aws.sdk.kotlin.services.ec2.model.VpnConnectionOptionsSpecification.invoke(block)
        }
    }
}
