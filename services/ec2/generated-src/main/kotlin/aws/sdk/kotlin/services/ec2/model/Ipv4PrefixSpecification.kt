// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes an IPv4 prefix.
 */
class Ipv4PrefixSpecification private constructor(builder: Builder) {
    /**
     * The IPv4 prefix. For information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-prefix-eni.html">
     * Assigning prefixes to Amazon EC2 network interfaces in the
     * Amazon Elastic Compute Cloud User Guide.
     */
    val ipv4Prefix: kotlin.String? = builder.ipv4Prefix

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.Ipv4PrefixSpecification = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("Ipv4PrefixSpecification(")
        append("ipv4Prefix=$ipv4Prefix)")
    }

    override fun hashCode(): kotlin.Int {
        var result = ipv4Prefix?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as Ipv4PrefixSpecification

        if (ipv4Prefix != other.ipv4Prefix) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.Ipv4PrefixSpecification = Builder(this).apply(block).build()

    class Builder {
        /**
         * The IPv4 prefix. For information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-prefix-eni.html">
         * Assigning prefixes to Amazon EC2 network interfaces in the
         * Amazon Elastic Compute Cloud User Guide.
         */
        var ipv4Prefix: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.Ipv4PrefixSpecification) : this() {
            this.ipv4Prefix = x.ipv4Prefix
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.Ipv4PrefixSpecification = Ipv4PrefixSpecification(this)
    }
}
