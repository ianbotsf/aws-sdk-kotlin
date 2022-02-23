// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes overrides for a launch template.
 */
class FleetLaunchTemplateOverrides private constructor(builder: Builder) {
    /**
     * The Availability Zone in which to launch the instances.
     */
    val availabilityZone: kotlin.String? = builder.availabilityZone
    /**
     * The attributes for the instance types. When you specify instance attributes, Amazon EC2 will
     * identify instance types with those attributes.
     *
     * If you specify InstanceRequirements, you can't specify
     * InstanceTypes.
     */
    val instanceRequirements: aws.sdk.kotlin.services.ec2.model.InstanceRequirements? = builder.instanceRequirements
    /**
     * The instance type.
     *
     * If you specify InstanceTypes, you can't specify
     * InstanceRequirements.
     */
    val instanceType: aws.sdk.kotlin.services.ec2.model.InstanceType? = builder.instanceType
    /**
     * The maximum price per unit hour that you are willing to pay for a Spot Instance.
     */
    val maxPrice: kotlin.String? = builder.maxPrice
    /**
     * The location where the instance launched, if applicable.
     */
    val placement: aws.sdk.kotlin.services.ec2.model.PlacementResponse? = builder.placement
    /**
     * The priority for the launch template override. The highest priority is launched
     * first.
     * If the On-Demand AllocationStrategy is set to prioritized,
     * EC2 Fleet uses priority to determine which launch template override to use first in fulfilling
     * On-Demand capacity.
     * If the Spot AllocationStrategy is set to
     * capacity-optimized-prioritized, EC2 Fleet uses priority on a best-effort basis
     * to determine which launch template override to use in fulfilling Spot capacity, but
     * optimizes for capacity first.
     * Valid values are whole numbers starting at 0. The lower the number, the
     * higher the priority. If no number is set, the override has the lowest priority. You can set
     * the same priority for different launch template overrides.
     */
    val priority: kotlin.Double? = builder.priority
    /**
     * The ID of the subnet in which to launch the instances.
     */
    val subnetId: kotlin.String? = builder.subnetId
    /**
     * The number of units provided by the specified instance type.
     */
    val weightedCapacity: kotlin.Double? = builder.weightedCapacity

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.FleetLaunchTemplateOverrides = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("FleetLaunchTemplateOverrides(")
        append("availabilityZone=$availabilityZone,")
        append("instanceRequirements=$instanceRequirements,")
        append("instanceType=$instanceType,")
        append("maxPrice=$maxPrice,")
        append("placement=$placement,")
        append("priority=$priority,")
        append("subnetId=$subnetId,")
        append("weightedCapacity=$weightedCapacity)")
    }

    override fun hashCode(): kotlin.Int {
        var result = availabilityZone?.hashCode() ?: 0
        result = 31 * result + (instanceRequirements?.hashCode() ?: 0)
        result = 31 * result + (instanceType?.hashCode() ?: 0)
        result = 31 * result + (maxPrice?.hashCode() ?: 0)
        result = 31 * result + (placement?.hashCode() ?: 0)
        result = 31 * result + (priority?.hashCode() ?: 0)
        result = 31 * result + (subnetId?.hashCode() ?: 0)
        result = 31 * result + (weightedCapacity?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as FleetLaunchTemplateOverrides

        if (availabilityZone != other.availabilityZone) return false
        if (instanceRequirements != other.instanceRequirements) return false
        if (instanceType != other.instanceType) return false
        if (maxPrice != other.maxPrice) return false
        if (placement != other.placement) return false
        if (priority != other.priority) return false
        if (subnetId != other.subnetId) return false
        if (weightedCapacity != other.weightedCapacity) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.FleetLaunchTemplateOverrides = Builder(this).apply(block).build()

    class Builder {
        /**
         * The Availability Zone in which to launch the instances.
         */
        var availabilityZone: kotlin.String? = null
        /**
         * The attributes for the instance types. When you specify instance attributes, Amazon EC2 will
         * identify instance types with those attributes.
         *
         * If you specify InstanceRequirements, you can't specify
         * InstanceTypes.
         */
        var instanceRequirements: aws.sdk.kotlin.services.ec2.model.InstanceRequirements? = null
        /**
         * The instance type.
         *
         * If you specify InstanceTypes, you can't specify
         * InstanceRequirements.
         */
        var instanceType: aws.sdk.kotlin.services.ec2.model.InstanceType? = null
        /**
         * The maximum price per unit hour that you are willing to pay for a Spot Instance.
         */
        var maxPrice: kotlin.String? = null
        /**
         * The location where the instance launched, if applicable.
         */
        var placement: aws.sdk.kotlin.services.ec2.model.PlacementResponse? = null
        /**
         * The priority for the launch template override. The highest priority is launched
         * first.
         * If the On-Demand AllocationStrategy is set to prioritized,
         * EC2 Fleet uses priority to determine which launch template override to use first in fulfilling
         * On-Demand capacity.
         * If the Spot AllocationStrategy is set to
         * capacity-optimized-prioritized, EC2 Fleet uses priority on a best-effort basis
         * to determine which launch template override to use in fulfilling Spot capacity, but
         * optimizes for capacity first.
         * Valid values are whole numbers starting at 0. The lower the number, the
         * higher the priority. If no number is set, the override has the lowest priority. You can set
         * the same priority for different launch template overrides.
         */
        var priority: kotlin.Double? = null
        /**
         * The ID of the subnet in which to launch the instances.
         */
        var subnetId: kotlin.String? = null
        /**
         * The number of units provided by the specified instance type.
         */
        var weightedCapacity: kotlin.Double? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.FleetLaunchTemplateOverrides) : this() {
            this.availabilityZone = x.availabilityZone
            this.instanceRequirements = x.instanceRequirements
            this.instanceType = x.instanceType
            this.maxPrice = x.maxPrice
            this.placement = x.placement
            this.priority = x.priority
            this.subnetId = x.subnetId
            this.weightedCapacity = x.weightedCapacity
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.FleetLaunchTemplateOverrides = FleetLaunchTemplateOverrides(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.InstanceRequirements] inside the given [block]
         */
        fun instanceRequirements(block: aws.sdk.kotlin.services.ec2.model.InstanceRequirements.Builder.() -> kotlin.Unit) {
            this.instanceRequirements = aws.sdk.kotlin.services.ec2.model.InstanceRequirements.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.PlacementResponse] inside the given [block]
         */
        fun placement(block: aws.sdk.kotlin.services.ec2.model.PlacementResponse.Builder.() -> kotlin.Unit) {
            this.placement = aws.sdk.kotlin.services.ec2.model.PlacementResponse.invoke(block)
        }
    }
}
