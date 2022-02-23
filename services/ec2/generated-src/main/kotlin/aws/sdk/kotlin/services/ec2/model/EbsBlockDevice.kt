// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a block device for an EBS volume.
 */
class EbsBlockDevice private constructor(builder: Builder) {
    /**
     * Indicates whether the EBS volume is deleted on instance termination. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#preserving-volumes-on-termination">Preserving Amazon EBS volumes on instance termination in the
     * Amazon EC2 User Guide.
     */
    val deleteOnTermination: kotlin.Boolean? = builder.deleteOnTermination
    /**
     * Indicates whether the encryption state of an EBS volume is changed while being
     * restored from a backing snapshot.
     * The effect of setting the encryption state to true depends on
     * the volume origin (new or from a snapshot), starting encryption state, ownership, and whether encryption by default is enabled.
     * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-parameters">Amazon EBS encryption
     * in the Amazon EC2 User Guide.
     * In no case can you remove encryption from an encrypted volume.
     * Encrypted volumes can only be attached to instances that support Amazon EBS
     * encryption. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances">Supported instance types.
     * This parameter is not returned by <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeImageAttribute.html">DescribeImageAttribute.
     */
    val encrypted: kotlin.Boolean? = builder.encrypted
    /**
     * The number of I/O operations per second (IOPS). For gp3, io1, and io2 volumes, this
     * represents the number of IOPS that are provisioned for the volume. For gp2 volumes, this
     * represents the baseline performance of the volume and the rate at which the volume accumulates
     * I/O credits for bursting.
     * The following are the supported values for each volume type:
     *
     *
     *
     * gp3: 3,000-16,000 IOPS
     *
     *
     * io1: 100-64,000 IOPS
     *
     *
     * io2: 100-64,000 IOPS
     *
     *
     * For io1 and io2 volumes, we guarantee 64,000 IOPS only for
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Instances built on the Nitro System. Other instance families guarantee performance
     * up to 32,000 IOPS.
     * This parameter is required for io1 and io2 volumes.
     * The default for gp3 volumes is 3,000 IOPS.
     * This parameter is not supported for gp2, st1, sc1, or standard volumes.
     */
    val iops: kotlin.Int? = builder.iops
    /**
     * Identifier (key ID, key alias, ID ARN, or alias ARN) for a customer managed CMK under
     * which the EBS volume is encrypted.
     * This parameter is only supported on BlockDeviceMapping objects called by
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html">RunInstances, <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotFleet.html">RequestSpotFleet,
     * and <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotInstances.html">RequestSpotInstances.
     */
    val kmsKeyId: kotlin.String? = builder.kmsKeyId
    /**
     * The ARN of the Outpost on which the snapshot is stored.
     */
    val outpostArn: kotlin.String? = builder.outpostArn
    /**
     * The ID of the snapshot.
     */
    val snapshotId: kotlin.String? = builder.snapshotId
    /**
     * The throughput that the volume supports, in MiB/s.
     * This parameter is valid only for gp3 volumes.
     * Valid Range: Minimum value of 125. Maximum value of 1000.
     */
    val throughput: kotlin.Int? = builder.throughput
    /**
     * The size of the volume, in GiBs. You must specify either a snapshot ID or a volume size.
     * If you specify a snapshot, the default is the snapshot size. You can specify a volume
     * size that is equal to or larger than the snapshot size.
     * The following are the supported volumes sizes for each volume type:
     *
     *
     *
     * gp2 and gp3:1-16,384
     *
     *
     * io1 and io2: 4-16,384
     *
     *
     * st1 and sc1: 125-16,384
     *
     *
     * standard: 1-1,024
     */
    val volumeSize: kotlin.Int? = builder.volumeSize
    /**
     * The volume type. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume types in the
     * Amazon EC2 User Guide. If the volume type is io1 or io2,
     * you must specify the IOPS that the volume supports.
     */
    val volumeType: aws.sdk.kotlin.services.ec2.model.VolumeType? = builder.volumeType

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.EbsBlockDevice = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("EbsBlockDevice(")
        append("deleteOnTermination=$deleteOnTermination,")
        append("encrypted=$encrypted,")
        append("iops=$iops,")
        append("kmsKeyId=$kmsKeyId,")
        append("outpostArn=$outpostArn,")
        append("snapshotId=$snapshotId,")
        append("throughput=$throughput,")
        append("volumeSize=$volumeSize,")
        append("volumeType=$volumeType)")
    }

    override fun hashCode(): kotlin.Int {
        var result = deleteOnTermination?.hashCode() ?: 0
        result = 31 * result + (encrypted?.hashCode() ?: 0)
        result = 31 * result + (iops ?: 0)
        result = 31 * result + (kmsKeyId?.hashCode() ?: 0)
        result = 31 * result + (outpostArn?.hashCode() ?: 0)
        result = 31 * result + (snapshotId?.hashCode() ?: 0)
        result = 31 * result + (throughput ?: 0)
        result = 31 * result + (volumeSize ?: 0)
        result = 31 * result + (volumeType?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as EbsBlockDevice

        if (deleteOnTermination != other.deleteOnTermination) return false
        if (encrypted != other.encrypted) return false
        if (iops != other.iops) return false
        if (kmsKeyId != other.kmsKeyId) return false
        if (outpostArn != other.outpostArn) return false
        if (snapshotId != other.snapshotId) return false
        if (throughput != other.throughput) return false
        if (volumeSize != other.volumeSize) return false
        if (volumeType != other.volumeType) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.EbsBlockDevice = Builder(this).apply(block).build()

    class Builder {
        /**
         * Indicates whether the EBS volume is deleted on instance termination. For more
         * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#preserving-volumes-on-termination">Preserving Amazon EBS volumes on instance termination in the
         * Amazon EC2 User Guide.
         */
        var deleteOnTermination: kotlin.Boolean? = null
        /**
         * Indicates whether the encryption state of an EBS volume is changed while being
         * restored from a backing snapshot.
         * The effect of setting the encryption state to true depends on
         * the volume origin (new or from a snapshot), starting encryption state, ownership, and whether encryption by default is enabled.
         * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-parameters">Amazon EBS encryption
         * in the Amazon EC2 User Guide.
         * In no case can you remove encryption from an encrypted volume.
         * Encrypted volumes can only be attached to instances that support Amazon EBS
         * encryption. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances">Supported instance types.
         * This parameter is not returned by <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeImageAttribute.html">DescribeImageAttribute.
         */
        var encrypted: kotlin.Boolean? = null
        /**
         * The number of I/O operations per second (IOPS). For gp3, io1, and io2 volumes, this
         * represents the number of IOPS that are provisioned for the volume. For gp2 volumes, this
         * represents the baseline performance of the volume and the rate at which the volume accumulates
         * I/O credits for bursting.
         * The following are the supported values for each volume type:
         *
         *
         *
         * gp3: 3,000-16,000 IOPS
         *
         *
         * io1: 100-64,000 IOPS
         *
         *
         * io2: 100-64,000 IOPS
         *
         *
         * For io1 and io2 volumes, we guarantee 64,000 IOPS only for
         * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Instances built on the Nitro System. Other instance families guarantee performance
         * up to 32,000 IOPS.
         * This parameter is required for io1 and io2 volumes.
         * The default for gp3 volumes is 3,000 IOPS.
         * This parameter is not supported for gp2, st1, sc1, or standard volumes.
         */
        var iops: kotlin.Int? = null
        /**
         * Identifier (key ID, key alias, ID ARN, or alias ARN) for a customer managed CMK under
         * which the EBS volume is encrypted.
         * This parameter is only supported on BlockDeviceMapping objects called by
         * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html">RunInstances, <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotFleet.html">RequestSpotFleet,
         * and <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestSpotInstances.html">RequestSpotInstances.
         */
        var kmsKeyId: kotlin.String? = null
        /**
         * The ARN of the Outpost on which the snapshot is stored.
         */
        var outpostArn: kotlin.String? = null
        /**
         * The ID of the snapshot.
         */
        var snapshotId: kotlin.String? = null
        /**
         * The throughput that the volume supports, in MiB/s.
         * This parameter is valid only for gp3 volumes.
         * Valid Range: Minimum value of 125. Maximum value of 1000.
         */
        var throughput: kotlin.Int? = null
        /**
         * The size of the volume, in GiBs. You must specify either a snapshot ID or a volume size.
         * If you specify a snapshot, the default is the snapshot size. You can specify a volume
         * size that is equal to or larger than the snapshot size.
         * The following are the supported volumes sizes for each volume type:
         *
         *
         *
         * gp2 and gp3:1-16,384
         *
         *
         * io1 and io2: 4-16,384
         *
         *
         * st1 and sc1: 125-16,384
         *
         *
         * standard: 1-1,024
         */
        var volumeSize: kotlin.Int? = null
        /**
         * The volume type. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume types in the
         * Amazon EC2 User Guide. If the volume type is io1 or io2,
         * you must specify the IOPS that the volume supports.
         */
        var volumeType: aws.sdk.kotlin.services.ec2.model.VolumeType? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.EbsBlockDevice) : this() {
            this.deleteOnTermination = x.deleteOnTermination
            this.encrypted = x.encrypted
            this.iops = x.iops
            this.kmsKeyId = x.kmsKeyId
            this.outpostArn = x.outpostArn
            this.snapshotId = x.snapshotId
            this.throughput = x.throughput
            this.volumeSize = x.volumeSize
            this.volumeType = x.volumeType
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.EbsBlockDevice = EbsBlockDevice(this)
    }
}
