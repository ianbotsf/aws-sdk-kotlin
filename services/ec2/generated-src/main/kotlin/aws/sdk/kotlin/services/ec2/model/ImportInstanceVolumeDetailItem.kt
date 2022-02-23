// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes an import volume task.
 */
class ImportInstanceVolumeDetailItem private constructor(builder: Builder) {
    /**
     * The Availability Zone where the resulting instance will reside.
     */
    val availabilityZone: kotlin.String? = builder.availabilityZone
    /**
     * The number of bytes converted so far.
     */
    val bytesConverted: kotlin.Long? = builder.bytesConverted
    /**
     * A description of the task.
     */
    val description: kotlin.String? = builder.description
    /**
     * The image.
     */
    val image: aws.sdk.kotlin.services.ec2.model.DiskImageDescription? = builder.image
    /**
     * The status of the import of this particular disk image.
     */
    val status: kotlin.String? = builder.status
    /**
     * The status information or errors related to the disk image.
     */
    val statusMessage: kotlin.String? = builder.statusMessage
    /**
     * The volume.
     */
    val volume: aws.sdk.kotlin.services.ec2.model.DiskImageVolumeDescription? = builder.volume

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ImportInstanceVolumeDetailItem = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ImportInstanceVolumeDetailItem(")
        append("availabilityZone=$availabilityZone,")
        append("bytesConverted=$bytesConverted,")
        append("description=$description,")
        append("image=$image,")
        append("status=$status,")
        append("statusMessage=$statusMessage,")
        append("volume=$volume)")
    }

    override fun hashCode(): kotlin.Int {
        var result = availabilityZone?.hashCode() ?: 0
        result = 31 * result + (bytesConverted?.hashCode() ?: 0)
        result = 31 * result + (description?.hashCode() ?: 0)
        result = 31 * result + (image?.hashCode() ?: 0)
        result = 31 * result + (status?.hashCode() ?: 0)
        result = 31 * result + (statusMessage?.hashCode() ?: 0)
        result = 31 * result + (volume?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ImportInstanceVolumeDetailItem

        if (availabilityZone != other.availabilityZone) return false
        if (bytesConverted != other.bytesConverted) return false
        if (description != other.description) return false
        if (image != other.image) return false
        if (status != other.status) return false
        if (statusMessage != other.statusMessage) return false
        if (volume != other.volume) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ImportInstanceVolumeDetailItem = Builder(this).apply(block).build()

    class Builder {
        /**
         * The Availability Zone where the resulting instance will reside.
         */
        var availabilityZone: kotlin.String? = null
        /**
         * The number of bytes converted so far.
         */
        var bytesConverted: kotlin.Long? = null
        /**
         * A description of the task.
         */
        var description: kotlin.String? = null
        /**
         * The image.
         */
        var image: aws.sdk.kotlin.services.ec2.model.DiskImageDescription? = null
        /**
         * The status of the import of this particular disk image.
         */
        var status: kotlin.String? = null
        /**
         * The status information or errors related to the disk image.
         */
        var statusMessage: kotlin.String? = null
        /**
         * The volume.
         */
        var volume: aws.sdk.kotlin.services.ec2.model.DiskImageVolumeDescription? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ImportInstanceVolumeDetailItem) : this() {
            this.availabilityZone = x.availabilityZone
            this.bytesConverted = x.bytesConverted
            this.description = x.description
            this.image = x.image
            this.status = x.status
            this.statusMessage = x.statusMessage
            this.volume = x.volume
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ImportInstanceVolumeDetailItem = ImportInstanceVolumeDetailItem(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.DiskImageDescription] inside the given [block]
         */
        fun image(block: aws.sdk.kotlin.services.ec2.model.DiskImageDescription.Builder.() -> kotlin.Unit) {
            this.image = aws.sdk.kotlin.services.ec2.model.DiskImageDescription.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.DiskImageVolumeDescription] inside the given [block]
         */
        fun volume(block: aws.sdk.kotlin.services.ec2.model.DiskImageVolumeDescription.Builder.() -> kotlin.Unit) {
            this.volume = aws.sdk.kotlin.services.ec2.model.DiskImageVolumeDescription.invoke(block)
        }
    }
}
