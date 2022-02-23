// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Specifies a Diffie-Hellman group number for the VPN tunnel for phase 1 IKE
 * negotiations.
 */
class Phase1DhGroupNumbersRequestListValue private constructor(builder: Builder) {
    /**
     * The Diffie-Hellmann group number.
     */
    val value: kotlin.Int? = builder.value

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.Phase1DhGroupNumbersRequestListValue = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("Phase1DhGroupNumbersRequestListValue(")
        append("value=$value)")
    }

    override fun hashCode(): kotlin.Int {
        var result = value ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as Phase1DhGroupNumbersRequestListValue

        if (value != other.value) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.Phase1DhGroupNumbersRequestListValue = Builder(this).apply(block).build()

    class Builder {
        /**
         * The Diffie-Hellmann group number.
         */
        var value: kotlin.Int? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.Phase1DhGroupNumbersRequestListValue) : this() {
            this.value = x.value
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.Phase1DhGroupNumbersRequestListValue = Phase1DhGroupNumbersRequestListValue(this)
    }
}
