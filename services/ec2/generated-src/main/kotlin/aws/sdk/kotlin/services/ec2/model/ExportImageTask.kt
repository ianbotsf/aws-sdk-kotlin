// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes an export image task.
 */
class ExportImageTask private constructor(builder: Builder) {
    /**
     * A description of the image being exported.
     */
    val description: kotlin.String? = builder.description
    /**
     * The ID of the export image task.
     */
    val exportImageTaskId: kotlin.String? = builder.exportImageTaskId
    /**
     * The ID of the image.
     */
    val imageId: kotlin.String? = builder.imageId
    /**
     * The percent complete of the export image task.
     */
    val progress: kotlin.String? = builder.progress
    /**
     * Information about the destination Amazon S3 bucket.
     */
    val s3ExportLocation: aws.sdk.kotlin.services.ec2.model.ExportTaskS3Location? = builder.s3ExportLocation
    /**
     * The status of the export image task. The possible values are active, completed,
     * deleting, and deleted.
     */
    val status: kotlin.String? = builder.status
    /**
     * The status message for the export image task.
     */
    val statusMessage: kotlin.String? = builder.statusMessage
    /**
     * Any tags assigned to the export image task.
     */
    val tags: List<Tag>? = builder.tags

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ExportImageTask = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ExportImageTask(")
        append("description=$description,")
        append("exportImageTaskId=$exportImageTaskId,")
        append("imageId=$imageId,")
        append("progress=$progress,")
        append("s3ExportLocation=$s3ExportLocation,")
        append("status=$status,")
        append("statusMessage=$statusMessage,")
        append("tags=$tags)")
    }

    override fun hashCode(): kotlin.Int {
        var result = description?.hashCode() ?: 0
        result = 31 * result + (exportImageTaskId?.hashCode() ?: 0)
        result = 31 * result + (imageId?.hashCode() ?: 0)
        result = 31 * result + (progress?.hashCode() ?: 0)
        result = 31 * result + (s3ExportLocation?.hashCode() ?: 0)
        result = 31 * result + (status?.hashCode() ?: 0)
        result = 31 * result + (statusMessage?.hashCode() ?: 0)
        result = 31 * result + (tags?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ExportImageTask

        if (description != other.description) return false
        if (exportImageTaskId != other.exportImageTaskId) return false
        if (imageId != other.imageId) return false
        if (progress != other.progress) return false
        if (s3ExportLocation != other.s3ExportLocation) return false
        if (status != other.status) return false
        if (statusMessage != other.statusMessage) return false
        if (tags != other.tags) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ExportImageTask = Builder(this).apply(block).build()

    class Builder {
        /**
         * A description of the image being exported.
         */
        var description: kotlin.String? = null
        /**
         * The ID of the export image task.
         */
        var exportImageTaskId: kotlin.String? = null
        /**
         * The ID of the image.
         */
        var imageId: kotlin.String? = null
        /**
         * The percent complete of the export image task.
         */
        var progress: kotlin.String? = null
        /**
         * Information about the destination Amazon S3 bucket.
         */
        var s3ExportLocation: aws.sdk.kotlin.services.ec2.model.ExportTaskS3Location? = null
        /**
         * The status of the export image task. The possible values are active, completed,
         * deleting, and deleted.
         */
        var status: kotlin.String? = null
        /**
         * The status message for the export image task.
         */
        var statusMessage: kotlin.String? = null
        /**
         * Any tags assigned to the export image task.
         */
        var tags: List<Tag>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ExportImageTask) : this() {
            this.description = x.description
            this.exportImageTaskId = x.exportImageTaskId
            this.imageId = x.imageId
            this.progress = x.progress
            this.s3ExportLocation = x.s3ExportLocation
            this.status = x.status
            this.statusMessage = x.statusMessage
            this.tags = x.tags
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ExportImageTask = ExportImageTask(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.ExportTaskS3Location] inside the given [block]
         */
        fun s3ExportLocation(block: aws.sdk.kotlin.services.ec2.model.ExportTaskS3Location.Builder.() -> kotlin.Unit) {
            this.s3ExportLocation = aws.sdk.kotlin.services.ec2.model.ExportTaskS3Location.invoke(block)
        }
    }
}
