// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class MoveByoipCidrToIpamResponse private constructor(builder: Builder) {
    /**
     * Information about an address range that is provisioned for use with your Amazon Web Services resources
     * through bring your own IP addresses (BYOIP).
     */
    val byoipCidr: aws.sdk.kotlin.services.ec2.model.ByoipCidr? = builder.byoipCidr

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.MoveByoipCidrToIpamResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("MoveByoipCidrToIpamResponse(")
        append("byoipCidr=$byoipCidr)")
    }

    override fun hashCode(): kotlin.Int {
        var result = byoipCidr?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as MoveByoipCidrToIpamResponse

        if (byoipCidr != other.byoipCidr) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.MoveByoipCidrToIpamResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Information about an address range that is provisioned for use with your Amazon Web Services resources
         * through bring your own IP addresses (BYOIP).
         */
        var byoipCidr: aws.sdk.kotlin.services.ec2.model.ByoipCidr? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.MoveByoipCidrToIpamResponse) : this() {
            this.byoipCidr = x.byoipCidr
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.MoveByoipCidrToIpamResponse = MoveByoipCidrToIpamResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.ByoipCidr] inside the given [block]
         */
        fun byoipCidr(block: aws.sdk.kotlin.services.ec2.model.ByoipCidr.Builder.() -> kotlin.Unit) {
            this.byoipCidr = aws.sdk.kotlin.services.ec2.model.ByoipCidr.invoke(block)
        }
    }
}
