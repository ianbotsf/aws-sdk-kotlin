// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a message about an Availability Zone, Local Zone, or Wavelength Zone.
 */
class AvailabilityZoneMessage private constructor(builder: Builder) {
    /**
     * The message about the Availability Zone, Local Zone, or Wavelength Zone.
     */
    val message: kotlin.String? = builder.message

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.AvailabilityZoneMessage = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("AvailabilityZoneMessage(")
        append("message=$message)")
    }

    override fun hashCode(): kotlin.Int {
        var result = message?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as AvailabilityZoneMessage

        if (message != other.message) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.AvailabilityZoneMessage = Builder(this).apply(block).build()

    class Builder {
        /**
         * The message about the Availability Zone, Local Zone, or Wavelength Zone.
         */
        var message: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.AvailabilityZoneMessage) : this() {
            this.message = x.message
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.AvailabilityZoneMessage = AvailabilityZoneMessage(this)
    }
}
