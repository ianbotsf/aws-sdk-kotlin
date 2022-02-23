// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes an explanation code for an unreachable path. For more information, see <a href="https://docs.aws.amazon.com/vpc/latest/reachability/explanation-codes.html">Reachability Analyzer explanation codes.
 */
class Explanation private constructor(builder: Builder) {
    /**
     * The network ACL.
     */
    val acl: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = builder.acl
    /**
     * The network ACL rule.
     */
    val aclRule: aws.sdk.kotlin.services.ec2.model.AnalysisAclRule? = builder.aclRule
    /**
     * The IPv4 address, in CIDR notation.
     */
    val address: kotlin.String? = builder.address
    /**
     * The IPv4 addresses, in CIDR notation.
     */
    val addresses: List<String>? = builder.addresses
    /**
     * The resource to which the component is attached.
     */
    val attachedTo: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = builder.attachedTo
    /**
     * The Availability Zones.
     */
    val availabilityZones: List<String>? = builder.availabilityZones
    /**
     * The CIDR ranges.
     */
    val cidrs: List<String>? = builder.cidrs
    /**
     * The listener for a Classic Load Balancer.
     */
    val classicLoadBalancerListener: aws.sdk.kotlin.services.ec2.model.AnalysisLoadBalancerListener? = builder.classicLoadBalancerListener
    /**
     * The component.
     */
    val component: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = builder.component
    /**
     * The customer gateway.
     */
    val customerGateway: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = builder.customerGateway
    /**
     * The destination.
     */
    val destination: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = builder.destination
    /**
     * The destination VPC.
     */
    val destinationVpc: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = builder.destinationVpc
    /**
     * The direction. The following are possible values:
     *
     *
     * egress
     *
     * ingress
     */
    val direction: kotlin.String? = builder.direction
    /**
     * The load balancer listener.
     */
    val elasticLoadBalancerListener: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = builder.elasticLoadBalancerListener
    /**
     * The explanation code.
     */
    val explanationCode: kotlin.String? = builder.explanationCode
    /**
     * The route table.
     */
    val ingressRouteTable: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = builder.ingressRouteTable
    /**
     * The internet gateway.
     */
    val internetGateway: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = builder.internetGateway
    /**
     * The Amazon Resource Name (ARN) of the load balancer.
     */
    val loadBalancerArn: kotlin.String? = builder.loadBalancerArn
    /**
     * The listener port of the load balancer.
     */
    val loadBalancerListenerPort: kotlin.Int? = builder.loadBalancerListenerPort
    /**
     * The target.
     */
    val loadBalancerTarget: aws.sdk.kotlin.services.ec2.model.AnalysisLoadBalancerTarget? = builder.loadBalancerTarget
    /**
     * The target group.
     */
    val loadBalancerTargetGroup: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = builder.loadBalancerTargetGroup
    /**
     * The target groups.
     */
    val loadBalancerTargetGroups: List<AnalysisComponent>? = builder.loadBalancerTargetGroups
    /**
     * The target port.
     */
    val loadBalancerTargetPort: kotlin.Int? = builder.loadBalancerTargetPort
    /**
     * The missing component.
     */
    val missingComponent: kotlin.String? = builder.missingComponent
    /**
     * The NAT gateway.
     */
    val natGateway: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = builder.natGateway
    /**
     * The network interface.
     */
    val networkInterface: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = builder.networkInterface
    /**
     * The packet field.
     */
    val packetField: kotlin.String? = builder.packetField
    /**
     * The port.
     */
    val port: kotlin.Int? = builder.port
    /**
     * The port ranges.
     */
    val portRanges: List<PortRange>? = builder.portRanges
    /**
     * The prefix list.
     */
    val prefixList: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = builder.prefixList
    /**
     * The protocols.
     */
    val protocols: List<String>? = builder.protocols
    /**
     * The route table.
     */
    val routeTable: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = builder.routeTable
    /**
     * The route table route.
     */
    val routeTableRoute: aws.sdk.kotlin.services.ec2.model.AnalysisRouteTableRoute? = builder.routeTableRoute
    /**
     * The security group.
     */
    val securityGroup: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = builder.securityGroup
    /**
     * The security group rule.
     */
    val securityGroupRule: aws.sdk.kotlin.services.ec2.model.AnalysisSecurityGroupRule? = builder.securityGroupRule
    /**
     * The security groups.
     */
    val securityGroups: List<AnalysisComponent>? = builder.securityGroups
    /**
     * The source VPC.
     */
    val sourceVpc: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = builder.sourceVpc
    /**
     * The state.
     */
    val state: kotlin.String? = builder.state
    /**
     * The subnet.
     */
    val subnet: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = builder.subnet
    /**
     * The route table for the subnet.
     */
    val subnetRouteTable: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = builder.subnetRouteTable
    /**
     * The component VPC.
     */
    val vpc: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = builder.vpc
    /**
     * The VPC endpoint.
     */
    val vpcEndpoint: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = builder.vpcEndpoint
    /**
     * The VPC peering connection.
     */
    val vpcPeeringConnection: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = builder.vpcPeeringConnection
    /**
     * The VPN connection.
     */
    val vpnConnection: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = builder.vpnConnection
    /**
     * The VPN gateway.
     */
    val vpnGateway: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = builder.vpnGateway

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.Explanation = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("Explanation(")
        append("acl=$acl,")
        append("aclRule=$aclRule,")
        append("address=$address,")
        append("addresses=$addresses,")
        append("attachedTo=$attachedTo,")
        append("availabilityZones=$availabilityZones,")
        append("cidrs=$cidrs,")
        append("classicLoadBalancerListener=$classicLoadBalancerListener,")
        append("component=$component,")
        append("customerGateway=$customerGateway,")
        append("destination=$destination,")
        append("destinationVpc=$destinationVpc,")
        append("direction=$direction,")
        append("elasticLoadBalancerListener=$elasticLoadBalancerListener,")
        append("explanationCode=$explanationCode,")
        append("ingressRouteTable=$ingressRouteTable,")
        append("internetGateway=$internetGateway,")
        append("loadBalancerArn=$loadBalancerArn,")
        append("loadBalancerListenerPort=$loadBalancerListenerPort,")
        append("loadBalancerTarget=$loadBalancerTarget,")
        append("loadBalancerTargetGroup=$loadBalancerTargetGroup,")
        append("loadBalancerTargetGroups=$loadBalancerTargetGroups,")
        append("loadBalancerTargetPort=$loadBalancerTargetPort,")
        append("missingComponent=$missingComponent,")
        append("natGateway=$natGateway,")
        append("networkInterface=$networkInterface,")
        append("packetField=$packetField,")
        append("port=$port,")
        append("portRanges=$portRanges,")
        append("prefixList=$prefixList,")
        append("protocols=$protocols,")
        append("routeTable=$routeTable,")
        append("routeTableRoute=$routeTableRoute,")
        append("securityGroup=$securityGroup,")
        append("securityGroupRule=$securityGroupRule,")
        append("securityGroups=$securityGroups,")
        append("sourceVpc=$sourceVpc,")
        append("state=$state,")
        append("subnet=$subnet,")
        append("subnetRouteTable=$subnetRouteTable,")
        append("vpc=$vpc,")
        append("vpcEndpoint=$vpcEndpoint,")
        append("vpcPeeringConnection=$vpcPeeringConnection,")
        append("vpnConnection=$vpnConnection,")
        append("vpnGateway=$vpnGateway)")
    }

    override fun hashCode(): kotlin.Int {
        var result = acl?.hashCode() ?: 0
        result = 31 * result + (aclRule?.hashCode() ?: 0)
        result = 31 * result + (address?.hashCode() ?: 0)
        result = 31 * result + (addresses?.hashCode() ?: 0)
        result = 31 * result + (attachedTo?.hashCode() ?: 0)
        result = 31 * result + (availabilityZones?.hashCode() ?: 0)
        result = 31 * result + (cidrs?.hashCode() ?: 0)
        result = 31 * result + (classicLoadBalancerListener?.hashCode() ?: 0)
        result = 31 * result + (component?.hashCode() ?: 0)
        result = 31 * result + (customerGateway?.hashCode() ?: 0)
        result = 31 * result + (destination?.hashCode() ?: 0)
        result = 31 * result + (destinationVpc?.hashCode() ?: 0)
        result = 31 * result + (direction?.hashCode() ?: 0)
        result = 31 * result + (elasticLoadBalancerListener?.hashCode() ?: 0)
        result = 31 * result + (explanationCode?.hashCode() ?: 0)
        result = 31 * result + (ingressRouteTable?.hashCode() ?: 0)
        result = 31 * result + (internetGateway?.hashCode() ?: 0)
        result = 31 * result + (loadBalancerArn?.hashCode() ?: 0)
        result = 31 * result + (loadBalancerListenerPort ?: 0)
        result = 31 * result + (loadBalancerTarget?.hashCode() ?: 0)
        result = 31 * result + (loadBalancerTargetGroup?.hashCode() ?: 0)
        result = 31 * result + (loadBalancerTargetGroups?.hashCode() ?: 0)
        result = 31 * result + (loadBalancerTargetPort ?: 0)
        result = 31 * result + (missingComponent?.hashCode() ?: 0)
        result = 31 * result + (natGateway?.hashCode() ?: 0)
        result = 31 * result + (networkInterface?.hashCode() ?: 0)
        result = 31 * result + (packetField?.hashCode() ?: 0)
        result = 31 * result + (port ?: 0)
        result = 31 * result + (portRanges?.hashCode() ?: 0)
        result = 31 * result + (prefixList?.hashCode() ?: 0)
        result = 31 * result + (protocols?.hashCode() ?: 0)
        result = 31 * result + (routeTable?.hashCode() ?: 0)
        result = 31 * result + (routeTableRoute?.hashCode() ?: 0)
        result = 31 * result + (securityGroup?.hashCode() ?: 0)
        result = 31 * result + (securityGroupRule?.hashCode() ?: 0)
        result = 31 * result + (securityGroups?.hashCode() ?: 0)
        result = 31 * result + (sourceVpc?.hashCode() ?: 0)
        result = 31 * result + (state?.hashCode() ?: 0)
        result = 31 * result + (subnet?.hashCode() ?: 0)
        result = 31 * result + (subnetRouteTable?.hashCode() ?: 0)
        result = 31 * result + (vpc?.hashCode() ?: 0)
        result = 31 * result + (vpcEndpoint?.hashCode() ?: 0)
        result = 31 * result + (vpcPeeringConnection?.hashCode() ?: 0)
        result = 31 * result + (vpnConnection?.hashCode() ?: 0)
        result = 31 * result + (vpnGateway?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as Explanation

        if (acl != other.acl) return false
        if (aclRule != other.aclRule) return false
        if (address != other.address) return false
        if (addresses != other.addresses) return false
        if (attachedTo != other.attachedTo) return false
        if (availabilityZones != other.availabilityZones) return false
        if (cidrs != other.cidrs) return false
        if (classicLoadBalancerListener != other.classicLoadBalancerListener) return false
        if (component != other.component) return false
        if (customerGateway != other.customerGateway) return false
        if (destination != other.destination) return false
        if (destinationVpc != other.destinationVpc) return false
        if (direction != other.direction) return false
        if (elasticLoadBalancerListener != other.elasticLoadBalancerListener) return false
        if (explanationCode != other.explanationCode) return false
        if (ingressRouteTable != other.ingressRouteTable) return false
        if (internetGateway != other.internetGateway) return false
        if (loadBalancerArn != other.loadBalancerArn) return false
        if (loadBalancerListenerPort != other.loadBalancerListenerPort) return false
        if (loadBalancerTarget != other.loadBalancerTarget) return false
        if (loadBalancerTargetGroup != other.loadBalancerTargetGroup) return false
        if (loadBalancerTargetGroups != other.loadBalancerTargetGroups) return false
        if (loadBalancerTargetPort != other.loadBalancerTargetPort) return false
        if (missingComponent != other.missingComponent) return false
        if (natGateway != other.natGateway) return false
        if (networkInterface != other.networkInterface) return false
        if (packetField != other.packetField) return false
        if (port != other.port) return false
        if (portRanges != other.portRanges) return false
        if (prefixList != other.prefixList) return false
        if (protocols != other.protocols) return false
        if (routeTable != other.routeTable) return false
        if (routeTableRoute != other.routeTableRoute) return false
        if (securityGroup != other.securityGroup) return false
        if (securityGroupRule != other.securityGroupRule) return false
        if (securityGroups != other.securityGroups) return false
        if (sourceVpc != other.sourceVpc) return false
        if (state != other.state) return false
        if (subnet != other.subnet) return false
        if (subnetRouteTable != other.subnetRouteTable) return false
        if (vpc != other.vpc) return false
        if (vpcEndpoint != other.vpcEndpoint) return false
        if (vpcPeeringConnection != other.vpcPeeringConnection) return false
        if (vpnConnection != other.vpnConnection) return false
        if (vpnGateway != other.vpnGateway) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.Explanation = Builder(this).apply(block).build()

    class Builder {
        /**
         * The network ACL.
         */
        var acl: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = null
        /**
         * The network ACL rule.
         */
        var aclRule: aws.sdk.kotlin.services.ec2.model.AnalysisAclRule? = null
        /**
         * The IPv4 address, in CIDR notation.
         */
        var address: kotlin.String? = null
        /**
         * The IPv4 addresses, in CIDR notation.
         */
        var addresses: List<String>? = null
        /**
         * The resource to which the component is attached.
         */
        var attachedTo: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = null
        /**
         * The Availability Zones.
         */
        var availabilityZones: List<String>? = null
        /**
         * The CIDR ranges.
         */
        var cidrs: List<String>? = null
        /**
         * The listener for a Classic Load Balancer.
         */
        var classicLoadBalancerListener: aws.sdk.kotlin.services.ec2.model.AnalysisLoadBalancerListener? = null
        /**
         * The component.
         */
        var component: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = null
        /**
         * The customer gateway.
         */
        var customerGateway: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = null
        /**
         * The destination.
         */
        var destination: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = null
        /**
         * The destination VPC.
         */
        var destinationVpc: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = null
        /**
         * The direction. The following are possible values:
         *
         *
         * egress
         *
         * ingress
         */
        var direction: kotlin.String? = null
        /**
         * The load balancer listener.
         */
        var elasticLoadBalancerListener: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = null
        /**
         * The explanation code.
         */
        var explanationCode: kotlin.String? = null
        /**
         * The route table.
         */
        var ingressRouteTable: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = null
        /**
         * The internet gateway.
         */
        var internetGateway: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = null
        /**
         * The Amazon Resource Name (ARN) of the load balancer.
         */
        var loadBalancerArn: kotlin.String? = null
        /**
         * The listener port of the load balancer.
         */
        var loadBalancerListenerPort: kotlin.Int? = null
        /**
         * The target.
         */
        var loadBalancerTarget: aws.sdk.kotlin.services.ec2.model.AnalysisLoadBalancerTarget? = null
        /**
         * The target group.
         */
        var loadBalancerTargetGroup: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = null
        /**
         * The target groups.
         */
        var loadBalancerTargetGroups: List<AnalysisComponent>? = null
        /**
         * The target port.
         */
        var loadBalancerTargetPort: kotlin.Int? = null
        /**
         * The missing component.
         */
        var missingComponent: kotlin.String? = null
        /**
         * The NAT gateway.
         */
        var natGateway: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = null
        /**
         * The network interface.
         */
        var networkInterface: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = null
        /**
         * The packet field.
         */
        var packetField: kotlin.String? = null
        /**
         * The port.
         */
        var port: kotlin.Int? = null
        /**
         * The port ranges.
         */
        var portRanges: List<PortRange>? = null
        /**
         * The prefix list.
         */
        var prefixList: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = null
        /**
         * The protocols.
         */
        var protocols: List<String>? = null
        /**
         * The route table.
         */
        var routeTable: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = null
        /**
         * The route table route.
         */
        var routeTableRoute: aws.sdk.kotlin.services.ec2.model.AnalysisRouteTableRoute? = null
        /**
         * The security group.
         */
        var securityGroup: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = null
        /**
         * The security group rule.
         */
        var securityGroupRule: aws.sdk.kotlin.services.ec2.model.AnalysisSecurityGroupRule? = null
        /**
         * The security groups.
         */
        var securityGroups: List<AnalysisComponent>? = null
        /**
         * The source VPC.
         */
        var sourceVpc: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = null
        /**
         * The state.
         */
        var state: kotlin.String? = null
        /**
         * The subnet.
         */
        var subnet: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = null
        /**
         * The route table for the subnet.
         */
        var subnetRouteTable: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = null
        /**
         * The component VPC.
         */
        var vpc: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = null
        /**
         * The VPC endpoint.
         */
        var vpcEndpoint: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = null
        /**
         * The VPC peering connection.
         */
        var vpcPeeringConnection: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = null
        /**
         * The VPN connection.
         */
        var vpnConnection: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = null
        /**
         * The VPN gateway.
         */
        var vpnGateway: aws.sdk.kotlin.services.ec2.model.AnalysisComponent? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.Explanation) : this() {
            this.acl = x.acl
            this.aclRule = x.aclRule
            this.address = x.address
            this.addresses = x.addresses
            this.attachedTo = x.attachedTo
            this.availabilityZones = x.availabilityZones
            this.cidrs = x.cidrs
            this.classicLoadBalancerListener = x.classicLoadBalancerListener
            this.component = x.component
            this.customerGateway = x.customerGateway
            this.destination = x.destination
            this.destinationVpc = x.destinationVpc
            this.direction = x.direction
            this.elasticLoadBalancerListener = x.elasticLoadBalancerListener
            this.explanationCode = x.explanationCode
            this.ingressRouteTable = x.ingressRouteTable
            this.internetGateway = x.internetGateway
            this.loadBalancerArn = x.loadBalancerArn
            this.loadBalancerListenerPort = x.loadBalancerListenerPort
            this.loadBalancerTarget = x.loadBalancerTarget
            this.loadBalancerTargetGroup = x.loadBalancerTargetGroup
            this.loadBalancerTargetGroups = x.loadBalancerTargetGroups
            this.loadBalancerTargetPort = x.loadBalancerTargetPort
            this.missingComponent = x.missingComponent
            this.natGateway = x.natGateway
            this.networkInterface = x.networkInterface
            this.packetField = x.packetField
            this.port = x.port
            this.portRanges = x.portRanges
            this.prefixList = x.prefixList
            this.protocols = x.protocols
            this.routeTable = x.routeTable
            this.routeTableRoute = x.routeTableRoute
            this.securityGroup = x.securityGroup
            this.securityGroupRule = x.securityGroupRule
            this.securityGroups = x.securityGroups
            this.sourceVpc = x.sourceVpc
            this.state = x.state
            this.subnet = x.subnet
            this.subnetRouteTable = x.subnetRouteTable
            this.vpc = x.vpc
            this.vpcEndpoint = x.vpcEndpoint
            this.vpcPeeringConnection = x.vpcPeeringConnection
            this.vpnConnection = x.vpnConnection
            this.vpnGateway = x.vpnGateway
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.Explanation = Explanation(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisComponent] inside the given [block]
         */
        fun acl(block: aws.sdk.kotlin.services.ec2.model.AnalysisComponent.Builder.() -> kotlin.Unit) {
            this.acl = aws.sdk.kotlin.services.ec2.model.AnalysisComponent.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisAclRule] inside the given [block]
         */
        fun aclRule(block: aws.sdk.kotlin.services.ec2.model.AnalysisAclRule.Builder.() -> kotlin.Unit) {
            this.aclRule = aws.sdk.kotlin.services.ec2.model.AnalysisAclRule.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisComponent] inside the given [block]
         */
        fun attachedTo(block: aws.sdk.kotlin.services.ec2.model.AnalysisComponent.Builder.() -> kotlin.Unit) {
            this.attachedTo = aws.sdk.kotlin.services.ec2.model.AnalysisComponent.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisLoadBalancerListener] inside the given [block]
         */
        fun classicLoadBalancerListener(block: aws.sdk.kotlin.services.ec2.model.AnalysisLoadBalancerListener.Builder.() -> kotlin.Unit) {
            this.classicLoadBalancerListener = aws.sdk.kotlin.services.ec2.model.AnalysisLoadBalancerListener.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisComponent] inside the given [block]
         */
        fun component(block: aws.sdk.kotlin.services.ec2.model.AnalysisComponent.Builder.() -> kotlin.Unit) {
            this.component = aws.sdk.kotlin.services.ec2.model.AnalysisComponent.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisComponent] inside the given [block]
         */
        fun customerGateway(block: aws.sdk.kotlin.services.ec2.model.AnalysisComponent.Builder.() -> kotlin.Unit) {
            this.customerGateway = aws.sdk.kotlin.services.ec2.model.AnalysisComponent.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisComponent] inside the given [block]
         */
        fun destination(block: aws.sdk.kotlin.services.ec2.model.AnalysisComponent.Builder.() -> kotlin.Unit) {
            this.destination = aws.sdk.kotlin.services.ec2.model.AnalysisComponent.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisComponent] inside the given [block]
         */
        fun destinationVpc(block: aws.sdk.kotlin.services.ec2.model.AnalysisComponent.Builder.() -> kotlin.Unit) {
            this.destinationVpc = aws.sdk.kotlin.services.ec2.model.AnalysisComponent.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisComponent] inside the given [block]
         */
        fun elasticLoadBalancerListener(block: aws.sdk.kotlin.services.ec2.model.AnalysisComponent.Builder.() -> kotlin.Unit) {
            this.elasticLoadBalancerListener = aws.sdk.kotlin.services.ec2.model.AnalysisComponent.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisComponent] inside the given [block]
         */
        fun ingressRouteTable(block: aws.sdk.kotlin.services.ec2.model.AnalysisComponent.Builder.() -> kotlin.Unit) {
            this.ingressRouteTable = aws.sdk.kotlin.services.ec2.model.AnalysisComponent.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisComponent] inside the given [block]
         */
        fun internetGateway(block: aws.sdk.kotlin.services.ec2.model.AnalysisComponent.Builder.() -> kotlin.Unit) {
            this.internetGateway = aws.sdk.kotlin.services.ec2.model.AnalysisComponent.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisLoadBalancerTarget] inside the given [block]
         */
        fun loadBalancerTarget(block: aws.sdk.kotlin.services.ec2.model.AnalysisLoadBalancerTarget.Builder.() -> kotlin.Unit) {
            this.loadBalancerTarget = aws.sdk.kotlin.services.ec2.model.AnalysisLoadBalancerTarget.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisComponent] inside the given [block]
         */
        fun loadBalancerTargetGroup(block: aws.sdk.kotlin.services.ec2.model.AnalysisComponent.Builder.() -> kotlin.Unit) {
            this.loadBalancerTargetGroup = aws.sdk.kotlin.services.ec2.model.AnalysisComponent.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisComponent] inside the given [block]
         */
        fun natGateway(block: aws.sdk.kotlin.services.ec2.model.AnalysisComponent.Builder.() -> kotlin.Unit) {
            this.natGateway = aws.sdk.kotlin.services.ec2.model.AnalysisComponent.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisComponent] inside the given [block]
         */
        fun networkInterface(block: aws.sdk.kotlin.services.ec2.model.AnalysisComponent.Builder.() -> kotlin.Unit) {
            this.networkInterface = aws.sdk.kotlin.services.ec2.model.AnalysisComponent.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisComponent] inside the given [block]
         */
        fun prefixList(block: aws.sdk.kotlin.services.ec2.model.AnalysisComponent.Builder.() -> kotlin.Unit) {
            this.prefixList = aws.sdk.kotlin.services.ec2.model.AnalysisComponent.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisComponent] inside the given [block]
         */
        fun routeTable(block: aws.sdk.kotlin.services.ec2.model.AnalysisComponent.Builder.() -> kotlin.Unit) {
            this.routeTable = aws.sdk.kotlin.services.ec2.model.AnalysisComponent.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisRouteTableRoute] inside the given [block]
         */
        fun routeTableRoute(block: aws.sdk.kotlin.services.ec2.model.AnalysisRouteTableRoute.Builder.() -> kotlin.Unit) {
            this.routeTableRoute = aws.sdk.kotlin.services.ec2.model.AnalysisRouteTableRoute.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisComponent] inside the given [block]
         */
        fun securityGroup(block: aws.sdk.kotlin.services.ec2.model.AnalysisComponent.Builder.() -> kotlin.Unit) {
            this.securityGroup = aws.sdk.kotlin.services.ec2.model.AnalysisComponent.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisSecurityGroupRule] inside the given [block]
         */
        fun securityGroupRule(block: aws.sdk.kotlin.services.ec2.model.AnalysisSecurityGroupRule.Builder.() -> kotlin.Unit) {
            this.securityGroupRule = aws.sdk.kotlin.services.ec2.model.AnalysisSecurityGroupRule.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisComponent] inside the given [block]
         */
        fun sourceVpc(block: aws.sdk.kotlin.services.ec2.model.AnalysisComponent.Builder.() -> kotlin.Unit) {
            this.sourceVpc = aws.sdk.kotlin.services.ec2.model.AnalysisComponent.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisComponent] inside the given [block]
         */
        fun subnet(block: aws.sdk.kotlin.services.ec2.model.AnalysisComponent.Builder.() -> kotlin.Unit) {
            this.subnet = aws.sdk.kotlin.services.ec2.model.AnalysisComponent.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisComponent] inside the given [block]
         */
        fun subnetRouteTable(block: aws.sdk.kotlin.services.ec2.model.AnalysisComponent.Builder.() -> kotlin.Unit) {
            this.subnetRouteTable = aws.sdk.kotlin.services.ec2.model.AnalysisComponent.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisComponent] inside the given [block]
         */
        fun vpc(block: aws.sdk.kotlin.services.ec2.model.AnalysisComponent.Builder.() -> kotlin.Unit) {
            this.vpc = aws.sdk.kotlin.services.ec2.model.AnalysisComponent.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisComponent] inside the given [block]
         */
        fun vpcEndpoint(block: aws.sdk.kotlin.services.ec2.model.AnalysisComponent.Builder.() -> kotlin.Unit) {
            this.vpcEndpoint = aws.sdk.kotlin.services.ec2.model.AnalysisComponent.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisComponent] inside the given [block]
         */
        fun vpcPeeringConnection(block: aws.sdk.kotlin.services.ec2.model.AnalysisComponent.Builder.() -> kotlin.Unit) {
            this.vpcPeeringConnection = aws.sdk.kotlin.services.ec2.model.AnalysisComponent.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisComponent] inside the given [block]
         */
        fun vpnConnection(block: aws.sdk.kotlin.services.ec2.model.AnalysisComponent.Builder.() -> kotlin.Unit) {
            this.vpnConnection = aws.sdk.kotlin.services.ec2.model.AnalysisComponent.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AnalysisComponent] inside the given [block]
         */
        fun vpnGateway(block: aws.sdk.kotlin.services.ec2.model.AnalysisComponent.Builder.() -> kotlin.Unit) {
            this.vpnGateway = aws.sdk.kotlin.services.ec2.model.AnalysisComponent.invoke(block)
        }
    }
}
