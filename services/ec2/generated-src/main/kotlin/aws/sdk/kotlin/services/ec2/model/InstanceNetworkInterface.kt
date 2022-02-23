// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a network interface.
 */
class InstanceNetworkInterface private constructor(builder: Builder) {
    /**
     * The association information for an Elastic IPv4 associated with the network
     * interface.
     */
    val association: aws.sdk.kotlin.services.ec2.model.InstanceNetworkInterfaceAssociation? = builder.association
    /**
     * The network interface attachment.
     */
    val attachment: aws.sdk.kotlin.services.ec2.model.InstanceNetworkInterfaceAttachment? = builder.attachment
    /**
     * The description.
     */
    val description: kotlin.String? = builder.description
    /**
     * One or more security groups.
     */
    val groups: List<GroupIdentifier>? = builder.groups
    /**
     * The type of network interface.
     * Valid values: interface | efa | trunk
     */
    val interfaceType: kotlin.String? = builder.interfaceType
    /**
     * The IPv4 delegated prefixes that are assigned to the network interface.
     */
    val ipv4Prefixes: List<InstanceIpv4Prefix>? = builder.ipv4Prefixes
    /**
     * One or more IPv6 addresses associated with the network interface.
     */
    val ipv6Addresses: List<InstanceIpv6Address>? = builder.ipv6Addresses
    /**
     * The IPv6 delegated prefixes that are assigned to the network interface.
     */
    val ipv6Prefixes: List<InstanceIpv6Prefix>? = builder.ipv6Prefixes
    /**
     * The MAC address.
     */
    val macAddress: kotlin.String? = builder.macAddress
    /**
     * The ID of the network interface.
     */
    val networkInterfaceId: kotlin.String? = builder.networkInterfaceId
    /**
     * The ID of the Amazon Web Services account that created the network interface.
     */
    val ownerId: kotlin.String? = builder.ownerId
    /**
     * The private DNS name.
     */
    val privateDnsName: kotlin.String? = builder.privateDnsName
    /**
     * The IPv4 address of the network interface within the subnet.
     */
    val privateIpAddress: kotlin.String? = builder.privateIpAddress
    /**
     * One or more private IPv4 addresses associated with the network interface.
     */
    val privateIpAddresses: List<InstancePrivateIpAddress>? = builder.privateIpAddresses
    /**
     * Indicates whether source/destination checking is enabled.
     */
    val sourceDestCheck: kotlin.Boolean? = builder.sourceDestCheck
    /**
     * The status of the network interface.
     */
    val status: aws.sdk.kotlin.services.ec2.model.NetworkInterfaceStatus? = builder.status
    /**
     * The ID of the subnet.
     */
    val subnetId: kotlin.String? = builder.subnetId
    /**
     * The ID of the VPC.
     */
    val vpcId: kotlin.String? = builder.vpcId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.InstanceNetworkInterface = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("InstanceNetworkInterface(")
        append("association=$association,")
        append("attachment=$attachment,")
        append("description=$description,")
        append("groups=$groups,")
        append("interfaceType=$interfaceType,")
        append("ipv4Prefixes=$ipv4Prefixes,")
        append("ipv6Addresses=$ipv6Addresses,")
        append("ipv6Prefixes=$ipv6Prefixes,")
        append("macAddress=$macAddress,")
        append("networkInterfaceId=$networkInterfaceId,")
        append("ownerId=$ownerId,")
        append("privateDnsName=$privateDnsName,")
        append("privateIpAddress=$privateIpAddress,")
        append("privateIpAddresses=$privateIpAddresses,")
        append("sourceDestCheck=$sourceDestCheck,")
        append("status=$status,")
        append("subnetId=$subnetId,")
        append("vpcId=$vpcId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = association?.hashCode() ?: 0
        result = 31 * result + (attachment?.hashCode() ?: 0)
        result = 31 * result + (description?.hashCode() ?: 0)
        result = 31 * result + (groups?.hashCode() ?: 0)
        result = 31 * result + (interfaceType?.hashCode() ?: 0)
        result = 31 * result + (ipv4Prefixes?.hashCode() ?: 0)
        result = 31 * result + (ipv6Addresses?.hashCode() ?: 0)
        result = 31 * result + (ipv6Prefixes?.hashCode() ?: 0)
        result = 31 * result + (macAddress?.hashCode() ?: 0)
        result = 31 * result + (networkInterfaceId?.hashCode() ?: 0)
        result = 31 * result + (ownerId?.hashCode() ?: 0)
        result = 31 * result + (privateDnsName?.hashCode() ?: 0)
        result = 31 * result + (privateIpAddress?.hashCode() ?: 0)
        result = 31 * result + (privateIpAddresses?.hashCode() ?: 0)
        result = 31 * result + (sourceDestCheck?.hashCode() ?: 0)
        result = 31 * result + (status?.hashCode() ?: 0)
        result = 31 * result + (subnetId?.hashCode() ?: 0)
        result = 31 * result + (vpcId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as InstanceNetworkInterface

        if (association != other.association) return false
        if (attachment != other.attachment) return false
        if (description != other.description) return false
        if (groups != other.groups) return false
        if (interfaceType != other.interfaceType) return false
        if (ipv4Prefixes != other.ipv4Prefixes) return false
        if (ipv6Addresses != other.ipv6Addresses) return false
        if (ipv6Prefixes != other.ipv6Prefixes) return false
        if (macAddress != other.macAddress) return false
        if (networkInterfaceId != other.networkInterfaceId) return false
        if (ownerId != other.ownerId) return false
        if (privateDnsName != other.privateDnsName) return false
        if (privateIpAddress != other.privateIpAddress) return false
        if (privateIpAddresses != other.privateIpAddresses) return false
        if (sourceDestCheck != other.sourceDestCheck) return false
        if (status != other.status) return false
        if (subnetId != other.subnetId) return false
        if (vpcId != other.vpcId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.InstanceNetworkInterface = Builder(this).apply(block).build()

    class Builder {
        /**
         * The association information for an Elastic IPv4 associated with the network
         * interface.
         */
        var association: aws.sdk.kotlin.services.ec2.model.InstanceNetworkInterfaceAssociation? = null
        /**
         * The network interface attachment.
         */
        var attachment: aws.sdk.kotlin.services.ec2.model.InstanceNetworkInterfaceAttachment? = null
        /**
         * The description.
         */
        var description: kotlin.String? = null
        /**
         * One or more security groups.
         */
        var groups: List<GroupIdentifier>? = null
        /**
         * The type of network interface.
         * Valid values: interface | efa | trunk
         */
        var interfaceType: kotlin.String? = null
        /**
         * The IPv4 delegated prefixes that are assigned to the network interface.
         */
        var ipv4Prefixes: List<InstanceIpv4Prefix>? = null
        /**
         * One or more IPv6 addresses associated with the network interface.
         */
        var ipv6Addresses: List<InstanceIpv6Address>? = null
        /**
         * The IPv6 delegated prefixes that are assigned to the network interface.
         */
        var ipv6Prefixes: List<InstanceIpv6Prefix>? = null
        /**
         * The MAC address.
         */
        var macAddress: kotlin.String? = null
        /**
         * The ID of the network interface.
         */
        var networkInterfaceId: kotlin.String? = null
        /**
         * The ID of the Amazon Web Services account that created the network interface.
         */
        var ownerId: kotlin.String? = null
        /**
         * The private DNS name.
         */
        var privateDnsName: kotlin.String? = null
        /**
         * The IPv4 address of the network interface within the subnet.
         */
        var privateIpAddress: kotlin.String? = null
        /**
         * One or more private IPv4 addresses associated with the network interface.
         */
        var privateIpAddresses: List<InstancePrivateIpAddress>? = null
        /**
         * Indicates whether source/destination checking is enabled.
         */
        var sourceDestCheck: kotlin.Boolean? = null
        /**
         * The status of the network interface.
         */
        var status: aws.sdk.kotlin.services.ec2.model.NetworkInterfaceStatus? = null
        /**
         * The ID of the subnet.
         */
        var subnetId: kotlin.String? = null
        /**
         * The ID of the VPC.
         */
        var vpcId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.InstanceNetworkInterface) : this() {
            this.association = x.association
            this.attachment = x.attachment
            this.description = x.description
            this.groups = x.groups
            this.interfaceType = x.interfaceType
            this.ipv4Prefixes = x.ipv4Prefixes
            this.ipv6Addresses = x.ipv6Addresses
            this.ipv6Prefixes = x.ipv6Prefixes
            this.macAddress = x.macAddress
            this.networkInterfaceId = x.networkInterfaceId
            this.ownerId = x.ownerId
            this.privateDnsName = x.privateDnsName
            this.privateIpAddress = x.privateIpAddress
            this.privateIpAddresses = x.privateIpAddresses
            this.sourceDestCheck = x.sourceDestCheck
            this.status = x.status
            this.subnetId = x.subnetId
            this.vpcId = x.vpcId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.InstanceNetworkInterface = InstanceNetworkInterface(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.InstanceNetworkInterfaceAssociation] inside the given [block]
         */
        fun association(block: aws.sdk.kotlin.services.ec2.model.InstanceNetworkInterfaceAssociation.Builder.() -> kotlin.Unit) {
            this.association = aws.sdk.kotlin.services.ec2.model.InstanceNetworkInterfaceAssociation.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.InstanceNetworkInterfaceAttachment] inside the given [block]
         */
        fun attachment(block: aws.sdk.kotlin.services.ec2.model.InstanceNetworkInterfaceAttachment.Builder.() -> kotlin.Unit) {
            this.attachment = aws.sdk.kotlin.services.ec2.model.InstanceNetworkInterfaceAttachment.invoke(block)
        }
    }
}
