// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes an elastic inference accelerator.
 */
class LaunchTemplateElasticInferenceAcceleratorResponse private constructor(builder: Builder) {
    /**
     * The number of elastic inference accelerators to attach to the instance.
     *
     * Default: 1
     */
    val count: kotlin.Int? = builder.count
    /**
     * The type of elastic inference accelerator. The possible values are eia1.medium, eia1.large, and eia1.xlarge.
     */
    val type: kotlin.String? = builder.type

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.LaunchTemplateElasticInferenceAcceleratorResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("LaunchTemplateElasticInferenceAcceleratorResponse(")
        append("count=$count,")
        append("type=$type)")
    }

    override fun hashCode(): kotlin.Int {
        var result = count ?: 0
        result = 31 * result + (type?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as LaunchTemplateElasticInferenceAcceleratorResponse

        if (count != other.count) return false
        if (type != other.type) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.LaunchTemplateElasticInferenceAcceleratorResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The number of elastic inference accelerators to attach to the instance.
         *
         * Default: 1
         */
        var count: kotlin.Int? = null
        /**
         * The type of elastic inference accelerator. The possible values are eia1.medium, eia1.large, and eia1.xlarge.
         */
        var type: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.LaunchTemplateElasticInferenceAcceleratorResponse) : this() {
            this.count = x.count
            this.type = x.type
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.LaunchTemplateElasticInferenceAcceleratorResponse = LaunchTemplateElasticInferenceAcceleratorResponse(this)
    }
}
