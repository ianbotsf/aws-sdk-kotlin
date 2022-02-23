// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * The parameters for a block device for an EBS volume.
 */
class LaunchTemplateEbsBlockDeviceRequest private constructor(builder: Builder) {
    /**
     * Indicates whether the EBS volume is deleted on instance termination.
     */
    val deleteOnTermination: kotlin.Boolean? = builder.deleteOnTermination
    /**
     * Indicates whether the EBS volume is encrypted. Encrypted volumes can only be attached to instances that support Amazon EBS encryption.
     * If you are creating a volume from a snapshot, you can't specify an encryption value.
     */
    val encrypted: kotlin.Boolean? = builder.encrypted
    /**
     * The number of I/O operations per second (IOPS). For gp3, io1, and io2
     * volumes, this represents the number of IOPS that are provisioned for the volume. For gp2 volumes,
     * this represents the baseline performance of the volume and the rate at which the volume accumulates I/O credits
     * for bursting.
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
     * For io1 and io2 volumes, we guarantee 64,000 IOPS
     * only for <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Instances built on the Nitro System. Other instance families guarantee performance up
     * to 32,000 IOPS.
     * This parameter is supported for io1, io2, and gp3 volumes only. This parameter is not supported for
     * gp2, st1, sc1, or standard volumes.
     */
    val iops: kotlin.Int? = builder.iops
    /**
     * The ARN of the symmetric Key Management Service (KMS) CMK used for
     * encryption.
     */
    val kmsKeyId: kotlin.String? = builder.kmsKeyId
    /**
     * The ID of the snapshot.
     */
    val snapshotId: kotlin.String? = builder.snapshotId
    /**
     * The throughput to provision for a gp3 volume, with a maximum of 1,000 MiB/s.
     * Valid Range: Minimum value of 125. Maximum value of 1000.
     */
    val throughput: kotlin.Int? = builder.throughput
    /**
     * The size of the volume, in GiBs. You must specify either a snapshot ID or a volume size. The following
     * are the supported volumes sizes for each volume type:
     *
     *
     *
     * gp2 and gp3: 1-16,384
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
     * Amazon Elastic Compute Cloud User Guide.
     */
    val volumeType: aws.sdk.kotlin.services.ec2.model.VolumeType? = builder.volumeType

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.LaunchTemplateEbsBlockDeviceRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("LaunchTemplateEbsBlockDeviceRequest(")
        append("deleteOnTermination=$deleteOnTermination,")
        append("encrypted=$encrypted,")
        append("iops=$iops,")
        append("kmsKeyId=$kmsKeyId,")
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
        result = 31 * result + (snapshotId?.hashCode() ?: 0)
        result = 31 * result + (throughput ?: 0)
        result = 31 * result + (volumeSize ?: 0)
        result = 31 * result + (volumeType?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as LaunchTemplateEbsBlockDeviceRequest

        if (deleteOnTermination != other.deleteOnTermination) return false
        if (encrypted != other.encrypted) return false
        if (iops != other.iops) return false
        if (kmsKeyId != other.kmsKeyId) return false
        if (snapshotId != other.snapshotId) return false
        if (throughput != other.throughput) return false
        if (volumeSize != other.volumeSize) return false
        if (volumeType != other.volumeType) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.LaunchTemplateEbsBlockDeviceRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Indicates whether the EBS volume is deleted on instance termination.
         */
        var deleteOnTermination: kotlin.Boolean? = null
        /**
         * Indicates whether the EBS volume is encrypted. Encrypted volumes can only be attached to instances that support Amazon EBS encryption.
         * If you are creating a volume from a snapshot, you can't specify an encryption value.
         */
        var encrypted: kotlin.Boolean? = null
        /**
         * The number of I/O operations per second (IOPS). For gp3, io1, and io2
         * volumes, this represents the number of IOPS that are provisioned for the volume. For gp2 volumes,
         * this represents the baseline performance of the volume and the rate at which the volume accumulates I/O credits
         * for bursting.
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
         * For io1 and io2 volumes, we guarantee 64,000 IOPS
         * only for <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">Instances built on the Nitro System. Other instance families guarantee performance up
         * to 32,000 IOPS.
         * This parameter is supported for io1, io2, and gp3 volumes only. This parameter is not supported for
         * gp2, st1, sc1, or standard volumes.
         */
        var iops: kotlin.Int? = null
        /**
         * The ARN of the symmetric Key Management Service (KMS) CMK used for
         * encryption.
         */
        var kmsKeyId: kotlin.String? = null
        /**
         * The ID of the snapshot.
         */
        var snapshotId: kotlin.String? = null
        /**
         * The throughput to provision for a gp3 volume, with a maximum of 1,000 MiB/s.
         * Valid Range: Minimum value of 125. Maximum value of 1000.
         */
        var throughput: kotlin.Int? = null
        /**
         * The size of the volume, in GiBs. You must specify either a snapshot ID or a volume size. The following
         * are the supported volumes sizes for each volume type:
         *
         *
         *
         * gp2 and gp3: 1-16,384
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
         * Amazon Elastic Compute Cloud User Guide.
         */
        var volumeType: aws.sdk.kotlin.services.ec2.model.VolumeType? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.LaunchTemplateEbsBlockDeviceRequest) : this() {
            this.deleteOnTermination = x.deleteOnTermination
            this.encrypted = x.encrypted
            this.iops = x.iops
            this.kmsKeyId = x.kmsKeyId
            this.snapshotId = x.snapshotId
            this.throughput = x.throughput
            this.volumeSize = x.volumeSize
            this.volumeType = x.volumeType
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.LaunchTemplateEbsBlockDeviceRequest = LaunchTemplateEbsBlockDeviceRequest(this)
    }
}
