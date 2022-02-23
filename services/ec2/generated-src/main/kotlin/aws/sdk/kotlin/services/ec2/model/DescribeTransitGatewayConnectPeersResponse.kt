// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeTransitGatewayConnectPeersResponse private constructor(builder: Builder) {
    /**
     * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
     */
    val nextToken: kotlin.String? = builder.nextToken
    /**
     * Information about the Connect peers.
     */
    val transitGatewayConnectPeers: List<TransitGatewayConnectPeer>? = builder.transitGatewayConnectPeers

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeTransitGatewayConnectPeersResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeTransitGatewayConnectPeersResponse(")
        append("nextToken=$nextToken,")
        append("transitGatewayConnectPeers=$transitGatewayConnectPeers)")
    }

    override fun hashCode(): kotlin.Int {
        var result = nextToken?.hashCode() ?: 0
        result = 31 * result + (transitGatewayConnectPeers?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeTransitGatewayConnectPeersResponse

        if (nextToken != other.nextToken) return false
        if (transitGatewayConnectPeers != other.transitGatewayConnectPeers) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeTransitGatewayConnectPeersResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
         */
        var nextToken: kotlin.String? = null
        /**
         * Information about the Connect peers.
         */
        var transitGatewayConnectPeers: List<TransitGatewayConnectPeer>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeTransitGatewayConnectPeersResponse) : this() {
            this.nextToken = x.nextToken
            this.transitGatewayConnectPeers = x.transitGatewayConnectPeers
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeTransitGatewayConnectPeersResponse = DescribeTransitGatewayConnectPeersResponse(this)
    }
}
