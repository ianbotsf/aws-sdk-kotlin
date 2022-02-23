// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class CreateSubnetCidrReservationRequest private constructor(builder: Builder) {
    /**
     * The IPv4 or IPV6 CIDR range to reserve.
     */
    val cidr: kotlin.String? = builder.cidr
    /**
     * The
     * description
     * to assign to the subnet CIDR reservation.
     */
    val description: kotlin.String? = builder.description
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The type of reservation.
     * The following are valid values:
     *
     *
     *
     * prefix: The Amazon EC2
     * Prefix
     * Delegation feature assigns the IP addresses to network interfaces that are
     * associated with an instance. For information about Prefix
     * Delegation,
     * see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-prefix-delegation.html">Prefix Delegation
     * for Amazon EC2 network interfaces in the
     * Amazon Elastic Compute Cloud User Guide.
     *
     *
     * explicit: You manually assign the IP addresses to resources that
     * reside in your subnet.
     */
    val reservationType: aws.sdk.kotlin.services.ec2.model.SubnetCidrReservationType? = builder.reservationType
    /**
     * The ID of the subnet.
     */
    val subnetId: kotlin.String? = builder.subnetId
    /**
     * The tags to assign to the subnet CIDR reservation.
     */
    val tagSpecifications: List<TagSpecification>? = builder.tagSpecifications

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreateSubnetCidrReservationRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateSubnetCidrReservationRequest(")
        append("cidr=$cidr,")
        append("description=$description,")
        append("dryRun=$dryRun,")
        append("reservationType=$reservationType,")
        append("subnetId=$subnetId,")
        append("tagSpecifications=$tagSpecifications)")
    }

    override fun hashCode(): kotlin.Int {
        var result = cidr?.hashCode() ?: 0
        result = 31 * result + (description?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (reservationType?.hashCode() ?: 0)
        result = 31 * result + (subnetId?.hashCode() ?: 0)
        result = 31 * result + (tagSpecifications?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateSubnetCidrReservationRequest

        if (cidr != other.cidr) return false
        if (description != other.description) return false
        if (dryRun != other.dryRun) return false
        if (reservationType != other.reservationType) return false
        if (subnetId != other.subnetId) return false
        if (tagSpecifications != other.tagSpecifications) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreateSubnetCidrReservationRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The IPv4 or IPV6 CIDR range to reserve.
         */
        var cidr: kotlin.String? = null
        /**
         * The
         * description
         * to assign to the subnet CIDR reservation.
         */
        var description: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The type of reservation.
         * The following are valid values:
         *
         *
         *
         * prefix: The Amazon EC2
         * Prefix
         * Delegation feature assigns the IP addresses to network interfaces that are
         * associated with an instance. For information about Prefix
         * Delegation,
         * see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-prefix-delegation.html">Prefix Delegation
         * for Amazon EC2 network interfaces in the
         * Amazon Elastic Compute Cloud User Guide.
         *
         *
         * explicit: You manually assign the IP addresses to resources that
         * reside in your subnet.
         */
        var reservationType: aws.sdk.kotlin.services.ec2.model.SubnetCidrReservationType? = null
        /**
         * The ID of the subnet.
         */
        var subnetId: kotlin.String? = null
        /**
         * The tags to assign to the subnet CIDR reservation.
         */
        var tagSpecifications: List<TagSpecification>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreateSubnetCidrReservationRequest) : this() {
            this.cidr = x.cidr
            this.description = x.description
            this.dryRun = x.dryRun
            this.reservationType = x.reservationType
            this.subnetId = x.subnetId
            this.tagSpecifications = x.tagSpecifications
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreateSubnetCidrReservationRequest = CreateSubnetCidrReservationRequest(this)
    }
}
