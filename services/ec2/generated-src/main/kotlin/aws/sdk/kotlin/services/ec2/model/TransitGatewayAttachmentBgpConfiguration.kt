// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * The BGP configuration information.
 */
class TransitGatewayAttachmentBgpConfiguration private constructor(builder: Builder) {
    /**
     * The BGP status.
     */
    val bgpStatus: aws.sdk.kotlin.services.ec2.model.BgpStatus? = builder.bgpStatus
    /**
     * The interior BGP peer IP address for the appliance.
     */
    val peerAddress: kotlin.String? = builder.peerAddress
    /**
     * The peer Autonomous System Number (ASN).
     */
    val peerAsn: kotlin.Long? = builder.peerAsn
    /**
     * The interior BGP peer IP address for the transit gateway.
     */
    val transitGatewayAddress: kotlin.String? = builder.transitGatewayAddress
    /**
     * The transit gateway Autonomous System Number (ASN).
     */
    val transitGatewayAsn: kotlin.Long? = builder.transitGatewayAsn

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.TransitGatewayAttachmentBgpConfiguration = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("TransitGatewayAttachmentBgpConfiguration(")
        append("bgpStatus=$bgpStatus,")
        append("peerAddress=$peerAddress,")
        append("peerAsn=$peerAsn,")
        append("transitGatewayAddress=$transitGatewayAddress,")
        append("transitGatewayAsn=$transitGatewayAsn)")
    }

    override fun hashCode(): kotlin.Int {
        var result = bgpStatus?.hashCode() ?: 0
        result = 31 * result + (peerAddress?.hashCode() ?: 0)
        result = 31 * result + (peerAsn?.hashCode() ?: 0)
        result = 31 * result + (transitGatewayAddress?.hashCode() ?: 0)
        result = 31 * result + (transitGatewayAsn?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as TransitGatewayAttachmentBgpConfiguration

        if (bgpStatus != other.bgpStatus) return false
        if (peerAddress != other.peerAddress) return false
        if (peerAsn != other.peerAsn) return false
        if (transitGatewayAddress != other.transitGatewayAddress) return false
        if (transitGatewayAsn != other.transitGatewayAsn) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.TransitGatewayAttachmentBgpConfiguration = Builder(this).apply(block).build()

    class Builder {
        /**
         * The BGP status.
         */
        var bgpStatus: aws.sdk.kotlin.services.ec2.model.BgpStatus? = null
        /**
         * The interior BGP peer IP address for the appliance.
         */
        var peerAddress: kotlin.String? = null
        /**
         * The peer Autonomous System Number (ASN).
         */
        var peerAsn: kotlin.Long? = null
        /**
         * The interior BGP peer IP address for the transit gateway.
         */
        var transitGatewayAddress: kotlin.String? = null
        /**
         * The transit gateway Autonomous System Number (ASN).
         */
        var transitGatewayAsn: kotlin.Long? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.TransitGatewayAttachmentBgpConfiguration) : this() {
            this.bgpStatus = x.bgpStatus
            this.peerAddress = x.peerAddress
            this.peerAsn = x.peerAsn
            this.transitGatewayAddress = x.transitGatewayAddress
            this.transitGatewayAsn = x.transitGatewayAsn
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.TransitGatewayAttachmentBgpConfiguration = TransitGatewayAttachmentBgpConfiguration(this)
    }
}
