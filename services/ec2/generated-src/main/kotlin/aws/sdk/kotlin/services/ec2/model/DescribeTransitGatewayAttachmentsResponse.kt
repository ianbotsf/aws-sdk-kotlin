// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeTransitGatewayAttachmentsResponse private constructor(builder: Builder) {
    /**
     * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
     */
    val nextToken: kotlin.String? = builder.nextToken
    /**
     * Information about the attachments.
     */
    val transitGatewayAttachments: List<TransitGatewayAttachment>? = builder.transitGatewayAttachments

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeTransitGatewayAttachmentsResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeTransitGatewayAttachmentsResponse(")
        append("nextToken=$nextToken,")
        append("transitGatewayAttachments=$transitGatewayAttachments)")
    }

    override fun hashCode(): kotlin.Int {
        var result = nextToken?.hashCode() ?: 0
        result = 31 * result + (transitGatewayAttachments?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeTransitGatewayAttachmentsResponse

        if (nextToken != other.nextToken) return false
        if (transitGatewayAttachments != other.transitGatewayAttachments) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeTransitGatewayAttachmentsResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
         */
        var nextToken: kotlin.String? = null
        /**
         * Information about the attachments.
         */
        var transitGatewayAttachments: List<TransitGatewayAttachment>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeTransitGatewayAttachmentsResponse) : this() {
            this.nextToken = x.nextToken
            this.transitGatewayAttachments = x.transitGatewayAttachments
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeTransitGatewayAttachmentsResponse = DescribeTransitGatewayAttachmentsResponse(this)
    }
}
