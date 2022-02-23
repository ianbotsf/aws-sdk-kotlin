// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a recurring charge.
 */
class RecurringCharge private constructor(builder: Builder) {
    /**
     * The amount of the recurring charge.
     */
    val amount: kotlin.Double? = builder.amount
    /**
     * The frequency of the recurring charge.
     */
    val frequency: aws.sdk.kotlin.services.ec2.model.RecurringChargeFrequency? = builder.frequency

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.RecurringCharge = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("RecurringCharge(")
        append("amount=$amount,")
        append("frequency=$frequency)")
    }

    override fun hashCode(): kotlin.Int {
        var result = amount?.hashCode() ?: 0
        result = 31 * result + (frequency?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as RecurringCharge

        if (amount != other.amount) return false
        if (frequency != other.frequency) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.RecurringCharge = Builder(this).apply(block).build()

    class Builder {
        /**
         * The amount of the recurring charge.
         */
        var amount: kotlin.Double? = null
        /**
         * The frequency of the recurring charge.
         */
        var frequency: aws.sdk.kotlin.services.ec2.model.RecurringChargeFrequency? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.RecurringCharge) : this() {
            this.amount = x.amount
            this.frequency = x.frequency
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.RecurringCharge = RecurringCharge(this)
    }
}
