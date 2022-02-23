// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * Information about a Capacity Reservation Fleet.
 */
class CapacityReservationFleet private constructor(builder: Builder) {
    /**
     * The strategy used by the Capacity Reservation Fleet to determine which of the specified
     * instance types to use. For more information, see For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#allocation-strategy">
     * Allocation strategy in the Amazon EC2 User Guide.
     */
    val allocationStrategy: kotlin.String? = builder.allocationStrategy
    /**
     * The ARN of the Capacity Reservation Fleet.
     */
    val capacityReservationFleetArn: kotlin.String? = builder.capacityReservationFleetArn
    /**
     * The ID of the Capacity Reservation Fleet.
     */
    val capacityReservationFleetId: kotlin.String? = builder.capacityReservationFleetId
    /**
     * The date and time at which the Capacity Reservation Fleet was created.
     */
    val createTime: aws.smithy.kotlin.runtime.time.Instant? = builder.createTime
    /**
     * The date and time at which the Capacity Reservation Fleet expires.
     */
    val endDate: aws.smithy.kotlin.runtime.time.Instant? = builder.endDate
    /**
     * Indicates the type of instance launches that the Capacity Reservation Fleet accepts. All
     * Capacity Reservations in the Fleet inherit this instance matching criteria.
     * Currently, Capacity Reservation Fleets support open instance matching criteria
     * only. This means that instances that have matching attributes (instance type, platform, and
     * Availability Zone) run in the Capacity Reservations automatically. Instances do not need to
     * explicitly target a Capacity Reservation Fleet to use its reserved capacity.
     */
    val instanceMatchCriteria: aws.sdk.kotlin.services.ec2.model.FleetInstanceMatchCriteria? = builder.instanceMatchCriteria
    /**
     * Information about the instance types for which to reserve the capacity.
     */
    val instanceTypeSpecifications: List<FleetCapacityReservation>? = builder.instanceTypeSpecifications
    /**
     * The state of the Capacity Reservation Fleet. Possible states include:
     *
     *
     *
     * submitted - The Capacity Reservation Fleet request has been submitted
     * and Amazon Elastic Compute Cloud is preparing to create the Capacity Reservations.
     *
     *
     *
     * modifying - The Capacity Reservation Fleet is being modified. The Fleet
     * remains in this state until the modification is complete.
     *
     *
     *
     * active - The Capacity Reservation Fleet has fulfilled its total target
     * capacity and it is attempting to maintain this capacity. The Fleet remains in this
     * state until it is modified or deleted.
     *
     *
     *
     * partially_fulfilled - The Capacity Reservation Fleet has partially
     * fulfilled its total target capacity. There is insufficient Amazon EC2 to
     * fulfill the total target capacity. The Fleet is attempting to asynchronously fulfill
     * its total target capacity.
     *
     *
     *
     * expiring - The Capacity Reservation Fleet has reach its end date and it
     * is in the process of expiring. One or more of its Capacity reservations might still
     * be active.
     *
     *
     *
     * expired - The Capacity Reservation Fleet has reach its end date. The Fleet
     * and its Capacity Reservations are expired. The Fleet can't create new Capacity
     * Reservations.
     *
     *
     *
     * cancelling - The Capacity Reservation Fleet is in the process of being
     * cancelled. One or more of its Capacity reservations might still be active.
     *
     *
     *
     * cancelled - The Capacity Reservation Fleet has been manually cancelled.
     * The Fleet and its Capacity Reservations are cancelled and the Fleet can't create new
     * Capacity Reservations.
     *
     *
     *
     * failed - The Capacity Reservation Fleet failed to reserve capacity for
     * the specified instance types.
     */
    val state: aws.sdk.kotlin.services.ec2.model.CapacityReservationFleetState? = builder.state
    /**
     * The tags assigned to the Capacity Reservation Fleet.
     */
    val tags: List<Tag>? = builder.tags
    /**
     * The tenancy of the Capacity Reservation Fleet. Tenancies include:
     *
     *
     *
     * default - The Capacity Reservation Fleet is created on hardware that is
     * shared with other Amazon Web Services accounts.
     *
     *
     *
     * dedicated - The Capacity Reservation Fleet is created on single-tenant
     * hardware that is dedicated to a single Amazon Web Services account.
     */
    val tenancy: aws.sdk.kotlin.services.ec2.model.FleetCapacityReservationTenancy? = builder.tenancy
    /**
     * The capacity units that have been fulfilled.
     */
    val totalFulfilledCapacity: kotlin.Double? = builder.totalFulfilledCapacity
    /**
     * The total number of capacity units for which the Capacity Reservation Fleet reserves capacity.
     * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity">Total target capacity
     * in the Amazon EC2 User Guide.
     */
    val totalTargetCapacity: kotlin.Int? = builder.totalTargetCapacity

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CapacityReservationFleet = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CapacityReservationFleet(")
        append("allocationStrategy=$allocationStrategy,")
        append("capacityReservationFleetArn=$capacityReservationFleetArn,")
        append("capacityReservationFleetId=$capacityReservationFleetId,")
        append("createTime=$createTime,")
        append("endDate=$endDate,")
        append("instanceMatchCriteria=$instanceMatchCriteria,")
        append("instanceTypeSpecifications=$instanceTypeSpecifications,")
        append("state=$state,")
        append("tags=$tags,")
        append("tenancy=$tenancy,")
        append("totalFulfilledCapacity=$totalFulfilledCapacity,")
        append("totalTargetCapacity=$totalTargetCapacity)")
    }

    override fun hashCode(): kotlin.Int {
        var result = allocationStrategy?.hashCode() ?: 0
        result = 31 * result + (capacityReservationFleetArn?.hashCode() ?: 0)
        result = 31 * result + (capacityReservationFleetId?.hashCode() ?: 0)
        result = 31 * result + (createTime?.hashCode() ?: 0)
        result = 31 * result + (endDate?.hashCode() ?: 0)
        result = 31 * result + (instanceMatchCriteria?.hashCode() ?: 0)
        result = 31 * result + (instanceTypeSpecifications?.hashCode() ?: 0)
        result = 31 * result + (state?.hashCode() ?: 0)
        result = 31 * result + (tags?.hashCode() ?: 0)
        result = 31 * result + (tenancy?.hashCode() ?: 0)
        result = 31 * result + (totalFulfilledCapacity?.hashCode() ?: 0)
        result = 31 * result + (totalTargetCapacity ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CapacityReservationFleet

        if (allocationStrategy != other.allocationStrategy) return false
        if (capacityReservationFleetArn != other.capacityReservationFleetArn) return false
        if (capacityReservationFleetId != other.capacityReservationFleetId) return false
        if (createTime != other.createTime) return false
        if (endDate != other.endDate) return false
        if (instanceMatchCriteria != other.instanceMatchCriteria) return false
        if (instanceTypeSpecifications != other.instanceTypeSpecifications) return false
        if (state != other.state) return false
        if (tags != other.tags) return false
        if (tenancy != other.tenancy) return false
        if (totalFulfilledCapacity != other.totalFulfilledCapacity) return false
        if (totalTargetCapacity != other.totalTargetCapacity) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CapacityReservationFleet = Builder(this).apply(block).build()

    class Builder {
        /**
         * The strategy used by the Capacity Reservation Fleet to determine which of the specified
         * instance types to use. For more information, see For more information, see
         * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#allocation-strategy">
         * Allocation strategy in the Amazon EC2 User Guide.
         */
        var allocationStrategy: kotlin.String? = null
        /**
         * The ARN of the Capacity Reservation Fleet.
         */
        var capacityReservationFleetArn: kotlin.String? = null
        /**
         * The ID of the Capacity Reservation Fleet.
         */
        var capacityReservationFleetId: kotlin.String? = null
        /**
         * The date and time at which the Capacity Reservation Fleet was created.
         */
        var createTime: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The date and time at which the Capacity Reservation Fleet expires.
         */
        var endDate: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * Indicates the type of instance launches that the Capacity Reservation Fleet accepts. All
         * Capacity Reservations in the Fleet inherit this instance matching criteria.
         * Currently, Capacity Reservation Fleets support open instance matching criteria
         * only. This means that instances that have matching attributes (instance type, platform, and
         * Availability Zone) run in the Capacity Reservations automatically. Instances do not need to
         * explicitly target a Capacity Reservation Fleet to use its reserved capacity.
         */
        var instanceMatchCriteria: aws.sdk.kotlin.services.ec2.model.FleetInstanceMatchCriteria? = null
        /**
         * Information about the instance types for which to reserve the capacity.
         */
        var instanceTypeSpecifications: List<FleetCapacityReservation>? = null
        /**
         * The state of the Capacity Reservation Fleet. Possible states include:
         *
         *
         *
         * submitted - The Capacity Reservation Fleet request has been submitted
         * and Amazon Elastic Compute Cloud is preparing to create the Capacity Reservations.
         *
         *
         *
         * modifying - The Capacity Reservation Fleet is being modified. The Fleet
         * remains in this state until the modification is complete.
         *
         *
         *
         * active - The Capacity Reservation Fleet has fulfilled its total target
         * capacity and it is attempting to maintain this capacity. The Fleet remains in this
         * state until it is modified or deleted.
         *
         *
         *
         * partially_fulfilled - The Capacity Reservation Fleet has partially
         * fulfilled its total target capacity. There is insufficient Amazon EC2 to
         * fulfill the total target capacity. The Fleet is attempting to asynchronously fulfill
         * its total target capacity.
         *
         *
         *
         * expiring - The Capacity Reservation Fleet has reach its end date and it
         * is in the process of expiring. One or more of its Capacity reservations might still
         * be active.
         *
         *
         *
         * expired - The Capacity Reservation Fleet has reach its end date. The Fleet
         * and its Capacity Reservations are expired. The Fleet can't create new Capacity
         * Reservations.
         *
         *
         *
         * cancelling - The Capacity Reservation Fleet is in the process of being
         * cancelled. One or more of its Capacity reservations might still be active.
         *
         *
         *
         * cancelled - The Capacity Reservation Fleet has been manually cancelled.
         * The Fleet and its Capacity Reservations are cancelled and the Fleet can't create new
         * Capacity Reservations.
         *
         *
         *
         * failed - The Capacity Reservation Fleet failed to reserve capacity for
         * the specified instance types.
         */
        var state: aws.sdk.kotlin.services.ec2.model.CapacityReservationFleetState? = null
        /**
         * The tags assigned to the Capacity Reservation Fleet.
         */
        var tags: List<Tag>? = null
        /**
         * The tenancy of the Capacity Reservation Fleet. Tenancies include:
         *
         *
         *
         * default - The Capacity Reservation Fleet is created on hardware that is
         * shared with other Amazon Web Services accounts.
         *
         *
         *
         * dedicated - The Capacity Reservation Fleet is created on single-tenant
         * hardware that is dedicated to a single Amazon Web Services account.
         */
        var tenancy: aws.sdk.kotlin.services.ec2.model.FleetCapacityReservationTenancy? = null
        /**
         * The capacity units that have been fulfilled.
         */
        var totalFulfilledCapacity: kotlin.Double? = null
        /**
         * The total number of capacity units for which the Capacity Reservation Fleet reserves capacity.
         * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity">Total target capacity
         * in the Amazon EC2 User Guide.
         */
        var totalTargetCapacity: kotlin.Int? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CapacityReservationFleet) : this() {
            this.allocationStrategy = x.allocationStrategy
            this.capacityReservationFleetArn = x.capacityReservationFleetArn
            this.capacityReservationFleetId = x.capacityReservationFleetId
            this.createTime = x.createTime
            this.endDate = x.endDate
            this.instanceMatchCriteria = x.instanceMatchCriteria
            this.instanceTypeSpecifications = x.instanceTypeSpecifications
            this.state = x.state
            this.tags = x.tags
            this.tenancy = x.tenancy
            this.totalFulfilledCapacity = x.totalFulfilledCapacity
            this.totalTargetCapacity = x.totalTargetCapacity
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CapacityReservationFleet = CapacityReservationFleet(this)
    }
}
