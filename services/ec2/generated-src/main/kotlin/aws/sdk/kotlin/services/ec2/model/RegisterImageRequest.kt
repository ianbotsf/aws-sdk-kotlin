// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the parameters for RegisterImage.
 */
class RegisterImageRequest private constructor(builder: Builder) {
    /**
     * The architecture of the AMI.
     * Default: For Amazon EBS-backed AMIs, i386.
     * For instance store-backed AMIs, the architecture specified in the manifest file.
     */
    val architecture: aws.sdk.kotlin.services.ec2.model.ArchitectureValues? = builder.architecture
    /**
     * The billing product codes. Your account must be authorized to specify billing product codes. Otherwise,
     * you can use the Amazon Web Services Marketplace to bill for the use of an AMI.
     */
    val billingProducts: List<String>? = builder.billingProducts
    /**
     * The block device mapping entries.
     * If you specify an Amazon EBS volume using the ID of an Amazon EBS snapshot, you can't specify the encryption state of the volume.
     * If you create an AMI on an Outpost, then all backing snapshots must be on the same Outpost or in the Region
     * of that Outpost. AMIs on an Outpost that include local snapshots can be used to launch instances on the same Outpost
     * only. For more information, <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshots-outposts.html#ami">
     * Amazon EBS local snapshots on Outposts in the Amazon Elastic Compute Cloud User Guide.
     */
    val blockDeviceMappings: List<BlockDeviceMapping>? = builder.blockDeviceMappings
    /**
     * The boot mode of the AMI. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-boot.html">Boot modes in the
     * Amazon Elastic Compute Cloud User Guide.
     */
    val bootMode: aws.sdk.kotlin.services.ec2.model.BootModeValues? = builder.bootMode
    /**
     * A description for your AMI.
     */
    val description: kotlin.String? = builder.description
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is
     * DryRunOperation. Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * Set to true to enable enhanced networking with ENA for the AMI and any instances that you launch from the AMI.
     * This option is supported only for HVM AMIs. Specifying this option with a PV AMI can make instances launched from the AMI unreachable.
     */
    val enaSupport: kotlin.Boolean? = builder.enaSupport
    /**
     * The full path to your AMI manifest in Amazon S3 storage. The specified bucket must have the
     * aws-exec-read canned access control list (ACL) to ensure that it can be accessed
     * by Amazon EC2. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl">Canned ACLs in the
     * Amazon S3 Service Developer Guide.
     */
    val imageLocation: kotlin.String? = builder.imageLocation
    /**
     * The ID of the kernel.
     */
    val kernelId: kotlin.String? = builder.kernelId
    /**
     * A name for your AMI.
     * Constraints: 3-128 alphanumeric characters, parentheses (()), square brackets (&#91;&#93;), spaces ( ), periods (.), slashes (/), dashes (-), single quotes ('), at-signs (@), or underscores(_)
     */
    val name: kotlin.String? = builder.name
    /**
     * The ID of the RAM disk.
     */
    val ramdiskId: kotlin.String? = builder.ramdiskId
    /**
     * The device name of the root device volume (for example, /dev/sda1).
     */
    val rootDeviceName: kotlin.String? = builder.rootDeviceName
    /**
     * Set to simple to enable enhanced networking with the Intel 82599 Virtual Function interface for the AMI and any instances that you launch from the AMI.
     * There is no way to disable sriovNetSupport at this time.
     * This option is supported only for HVM AMIs. Specifying this option with a PV AMI can make instances launched from the AMI unreachable.
     */
    val sriovNetSupport: kotlin.String? = builder.sriovNetSupport
    /**
     * The type of virtualization (hvm | paravirtual).
     * Default: paravirtual
     */
    val virtualizationType: kotlin.String? = builder.virtualizationType

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.RegisterImageRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("RegisterImageRequest(")
        append("architecture=$architecture,")
        append("billingProducts=$billingProducts,")
        append("blockDeviceMappings=$blockDeviceMappings,")
        append("bootMode=$bootMode,")
        append("description=$description,")
        append("dryRun=$dryRun,")
        append("enaSupport=$enaSupport,")
        append("imageLocation=$imageLocation,")
        append("kernelId=$kernelId,")
        append("name=$name,")
        append("ramdiskId=$ramdiskId,")
        append("rootDeviceName=$rootDeviceName,")
        append("sriovNetSupport=$sriovNetSupport,")
        append("virtualizationType=$virtualizationType)")
    }

    override fun hashCode(): kotlin.Int {
        var result = architecture?.hashCode() ?: 0
        result = 31 * result + (billingProducts?.hashCode() ?: 0)
        result = 31 * result + (blockDeviceMappings?.hashCode() ?: 0)
        result = 31 * result + (bootMode?.hashCode() ?: 0)
        result = 31 * result + (description?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (enaSupport?.hashCode() ?: 0)
        result = 31 * result + (imageLocation?.hashCode() ?: 0)
        result = 31 * result + (kernelId?.hashCode() ?: 0)
        result = 31 * result + (name?.hashCode() ?: 0)
        result = 31 * result + (ramdiskId?.hashCode() ?: 0)
        result = 31 * result + (rootDeviceName?.hashCode() ?: 0)
        result = 31 * result + (sriovNetSupport?.hashCode() ?: 0)
        result = 31 * result + (virtualizationType?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as RegisterImageRequest

        if (architecture != other.architecture) return false
        if (billingProducts != other.billingProducts) return false
        if (blockDeviceMappings != other.blockDeviceMappings) return false
        if (bootMode != other.bootMode) return false
        if (description != other.description) return false
        if (dryRun != other.dryRun) return false
        if (enaSupport != other.enaSupport) return false
        if (imageLocation != other.imageLocation) return false
        if (kernelId != other.kernelId) return false
        if (name != other.name) return false
        if (ramdiskId != other.ramdiskId) return false
        if (rootDeviceName != other.rootDeviceName) return false
        if (sriovNetSupport != other.sriovNetSupport) return false
        if (virtualizationType != other.virtualizationType) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.RegisterImageRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The architecture of the AMI.
         * Default: For Amazon EBS-backed AMIs, i386.
         * For instance store-backed AMIs, the architecture specified in the manifest file.
         */
        var architecture: aws.sdk.kotlin.services.ec2.model.ArchitectureValues? = null
        /**
         * The billing product codes. Your account must be authorized to specify billing product codes. Otherwise,
         * you can use the Amazon Web Services Marketplace to bill for the use of an AMI.
         */
        var billingProducts: List<String>? = null
        /**
         * The block device mapping entries.
         * If you specify an Amazon EBS volume using the ID of an Amazon EBS snapshot, you can't specify the encryption state of the volume.
         * If you create an AMI on an Outpost, then all backing snapshots must be on the same Outpost or in the Region
         * of that Outpost. AMIs on an Outpost that include local snapshots can be used to launch instances on the same Outpost
         * only. For more information, <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshots-outposts.html#ami">
         * Amazon EBS local snapshots on Outposts in the Amazon Elastic Compute Cloud User Guide.
         */
        var blockDeviceMappings: List<BlockDeviceMapping>? = null
        /**
         * The boot mode of the AMI. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-boot.html">Boot modes in the
         * Amazon Elastic Compute Cloud User Guide.
         */
        var bootMode: aws.sdk.kotlin.services.ec2.model.BootModeValues? = null
        /**
         * A description for your AMI.
         */
        var description: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is
         * DryRunOperation. Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * Set to true to enable enhanced networking with ENA for the AMI and any instances that you launch from the AMI.
         * This option is supported only for HVM AMIs. Specifying this option with a PV AMI can make instances launched from the AMI unreachable.
         */
        var enaSupport: kotlin.Boolean? = null
        /**
         * The full path to your AMI manifest in Amazon S3 storage. The specified bucket must have the
         * aws-exec-read canned access control list (ACL) to ensure that it can be accessed
         * by Amazon EC2. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html#canned-acl">Canned ACLs in the
         * Amazon S3 Service Developer Guide.
         */
        var imageLocation: kotlin.String? = null
        /**
         * The ID of the kernel.
         */
        var kernelId: kotlin.String? = null
        /**
         * A name for your AMI.
         * Constraints: 3-128 alphanumeric characters, parentheses (()), square brackets (&#91;&#93;), spaces ( ), periods (.), slashes (/), dashes (-), single quotes ('), at-signs (@), or underscores(_)
         */
        var name: kotlin.String? = null
        /**
         * The ID of the RAM disk.
         */
        var ramdiskId: kotlin.String? = null
        /**
         * The device name of the root device volume (for example, /dev/sda1).
         */
        var rootDeviceName: kotlin.String? = null
        /**
         * Set to simple to enable enhanced networking with the Intel 82599 Virtual Function interface for the AMI and any instances that you launch from the AMI.
         * There is no way to disable sriovNetSupport at this time.
         * This option is supported only for HVM AMIs. Specifying this option with a PV AMI can make instances launched from the AMI unreachable.
         */
        var sriovNetSupport: kotlin.String? = null
        /**
         * The type of virtualization (hvm | paravirtual).
         * Default: paravirtual
         */
        var virtualizationType: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.RegisterImageRequest) : this() {
            this.architecture = x.architecture
            this.billingProducts = x.billingProducts
            this.blockDeviceMappings = x.blockDeviceMappings
            this.bootMode = x.bootMode
            this.description = x.description
            this.dryRun = x.dryRun
            this.enaSupport = x.enaSupport
            this.imageLocation = x.imageLocation
            this.kernelId = x.kernelId
            this.name = x.name
            this.ramdiskId = x.ramdiskId
            this.rootDeviceName = x.rootDeviceName
            this.sriovNetSupport = x.sriovNetSupport
            this.virtualizationType = x.virtualizationType
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.RegisterImageRequest = RegisterImageRequest(this)
    }
}
