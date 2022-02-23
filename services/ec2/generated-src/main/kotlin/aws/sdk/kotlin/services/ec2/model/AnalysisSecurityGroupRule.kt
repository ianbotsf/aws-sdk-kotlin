// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a security group rule.
 */
class AnalysisSecurityGroupRule private constructor(builder: Builder) {
    /**
     * The IPv4 address range, in CIDR notation.
     */
    val cidr: kotlin.String? = builder.cidr
    /**
     * The direction. The following are possible values:
     *
     *
     * egress
     *
     * ingress
     */
    val direction: kotlin.String? = builder.direction
    /**
     * The port range.
     */
    val portRange: aws.sdk.kotlin.services.ec2.model.PortRange? = builder.portRange
    /**
     * The prefix list ID.
     */
    val prefixListId: kotlin.String? = builder.prefixListId
    /**
     * The protocol name.
     */
    val protocol: kotlin.String? = builder.protocol
    /**
     * The security group ID.
     */
    val securityGroupId: kotlin.String? = builder.securityGroupId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.AnalysisSecurityGroupRule = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("AnalysisSecurityGroupRule(")
        append("cidr=$cidr,")
        append("direction=$direction,")
        append("portRange=$portRange,")
        append("prefixListId=$prefixListId,")
        append("protocol=$protocol,")
        append("securityGroupId=$securityGroupId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = cidr?.hashCode() ?: 0
        result = 31 * result + (direction?.hashCode() ?: 0)
        result = 31 * result + (portRange?.hashCode() ?: 0)
        result = 31 * result + (prefixListId?.hashCode() ?: 0)
        result = 31 * result + (protocol?.hashCode() ?: 0)
        result = 31 * result + (securityGroupId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as AnalysisSecurityGroupRule

        if (cidr != other.cidr) return false
        if (direction != other.direction) return false
        if (portRange != other.portRange) return false
        if (prefixListId != other.prefixListId) return false
        if (protocol != other.protocol) return false
        if (securityGroupId != other.securityGroupId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.AnalysisSecurityGroupRule = Builder(this).apply(block).build()

    class Builder {
        /**
         * The IPv4 address range, in CIDR notation.
         */
        var cidr: kotlin.String? = null
        /**
         * The direction. The following are possible values:
         *
         *
         * egress
         *
         * ingress
         */
        var direction: kotlin.String? = null
        /**
         * The port range.
         */
        var portRange: aws.sdk.kotlin.services.ec2.model.PortRange? = null
        /**
         * The prefix list ID.
         */
        var prefixListId: kotlin.String? = null
        /**
         * The protocol name.
         */
        var protocol: kotlin.String? = null
        /**
         * The security group ID.
         */
        var securityGroupId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.AnalysisSecurityGroupRule) : this() {
            this.cidr = x.cidr
            this.direction = x.direction
            this.portRange = x.portRange
            this.prefixListId = x.prefixListId
            this.protocol = x.protocol
            this.securityGroupId = x.securityGroupId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.AnalysisSecurityGroupRule = AnalysisSecurityGroupRule(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.PortRange] inside the given [block]
         */
        fun portRange(block: aws.sdk.kotlin.services.ec2.model.PortRange.Builder.() -> kotlin.Unit) {
            this.portRange = aws.sdk.kotlin.services.ec2.model.PortRange.invoke(block)
        }
    }
}
