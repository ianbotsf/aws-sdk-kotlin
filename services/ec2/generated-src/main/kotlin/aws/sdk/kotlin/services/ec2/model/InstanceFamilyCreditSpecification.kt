// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the default credit option for CPU usage of a burstable performance instance family.
 */
class InstanceFamilyCreditSpecification private constructor(builder: Builder) {
    /**
     * The default credit option for CPU usage of the instance family. Valid values are standard and unlimited.
     */
    val cpuCredits: kotlin.String? = builder.cpuCredits
    /**
     * The instance family.
     */
    val instanceFamily: aws.sdk.kotlin.services.ec2.model.UnlimitedSupportedInstanceFamily? = builder.instanceFamily

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.InstanceFamilyCreditSpecification = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("InstanceFamilyCreditSpecification(")
        append("cpuCredits=$cpuCredits,")
        append("instanceFamily=$instanceFamily)")
    }

    override fun hashCode(): kotlin.Int {
        var result = cpuCredits?.hashCode() ?: 0
        result = 31 * result + (instanceFamily?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as InstanceFamilyCreditSpecification

        if (cpuCredits != other.cpuCredits) return false
        if (instanceFamily != other.instanceFamily) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.InstanceFamilyCreditSpecification = Builder(this).apply(block).build()

    class Builder {
        /**
         * The default credit option for CPU usage of the instance family. Valid values are standard and unlimited.
         */
        var cpuCredits: kotlin.String? = null
        /**
         * The instance family.
         */
        var instanceFamily: aws.sdk.kotlin.services.ec2.model.UnlimitedSupportedInstanceFamily? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.InstanceFamilyCreditSpecification) : this() {
            this.cpuCredits = x.cpuCredits
            this.instanceFamily = x.instanceFamily
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.InstanceFamilyCreditSpecification = InstanceFamilyCreditSpecification(this)
    }
}
