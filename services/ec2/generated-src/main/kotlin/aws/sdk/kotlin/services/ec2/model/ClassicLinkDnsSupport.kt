// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the ClassicLink DNS support status of a VPC.
 */
class ClassicLinkDnsSupport private constructor(builder: Builder) {
    /**
     * Indicates whether ClassicLink DNS support is enabled for the VPC.
     */
    val classicLinkDnsSupported: kotlin.Boolean? = builder.classicLinkDnsSupported
    /**
     * The ID of the VPC.
     */
    val vpcId: kotlin.String? = builder.vpcId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ClassicLinkDnsSupport = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ClassicLinkDnsSupport(")
        append("classicLinkDnsSupported=$classicLinkDnsSupported,")
        append("vpcId=$vpcId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = classicLinkDnsSupported?.hashCode() ?: 0
        result = 31 * result + (vpcId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ClassicLinkDnsSupport

        if (classicLinkDnsSupported != other.classicLinkDnsSupported) return false
        if (vpcId != other.vpcId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ClassicLinkDnsSupport = Builder(this).apply(block).build()

    class Builder {
        /**
         * Indicates whether ClassicLink DNS support is enabled for the VPC.
         */
        var classicLinkDnsSupported: kotlin.Boolean? = null
        /**
         * The ID of the VPC.
         */
        var vpcId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ClassicLinkDnsSupport) : this() {
            this.classicLinkDnsSupported = x.classicLinkDnsSupported
            this.vpcId = x.vpcId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ClassicLinkDnsSupport = ClassicLinkDnsSupport(this)
    }
}
