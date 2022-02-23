// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the Inference accelerators for the instance type.
 */
class InferenceAcceleratorInfo private constructor(builder: Builder) {
    /**
     * Describes the Inference accelerators for the instance type.
     */
    val accelerators: List<InferenceDeviceInfo>? = builder.accelerators

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.InferenceAcceleratorInfo = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("InferenceAcceleratorInfo(")
        append("accelerators=$accelerators)")
    }

    override fun hashCode(): kotlin.Int {
        var result = accelerators?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as InferenceAcceleratorInfo

        if (accelerators != other.accelerators) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.InferenceAcceleratorInfo = Builder(this).apply(block).build()

    class Builder {
        /**
         * Describes the Inference accelerators for the instance type.
         */
        var accelerators: List<InferenceDeviceInfo>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.InferenceAcceleratorInfo) : this() {
            this.accelerators = x.accelerators
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.InferenceAcceleratorInfo = InferenceAcceleratorInfo(this)
    }
}
