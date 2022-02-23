// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * A container that describes additional filters for identifying the source objects that
 * you want to replicate. You can choose to enable or disable the replication of these
 * objects. Currently, Amazon S3 supports only the filter that you can specify for objects created
 * with server-side encryption using a customer managed key stored in Amazon Web Services Key Management
 * Service (SSE-KMS).
 */
class SourceSelectionCriteria private constructor(builder: Builder) {
    /**
     * A filter that you can specify for selections for modifications on replicas. Amazon S3 doesn't
     * replicate replica modifications by default. In the latest version of replication
     * configuration (when Filter is specified), you can specify this element and set
     * the status to Enabled to replicate modifications on replicas.
     *
     * If you don't specify the Filter element, Amazon S3 assumes that the
     * replication configuration is the earlier version, V1. In the earlier version, this
     * element is not allowed
     */
    val replicaModifications: aws.sdk.kotlin.services.s3.model.ReplicaModifications? = builder.replicaModifications
    /**
     * A container for filter information for the selection of Amazon S3 objects encrypted with Amazon Web Services
     * KMS. If you include SourceSelectionCriteria in the replication configuration,
     * this element is required.
     */
    val sseKmsEncryptedObjects: aws.sdk.kotlin.services.s3.model.SseKmsEncryptedObjects? = builder.sseKmsEncryptedObjects

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.SourceSelectionCriteria = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("SourceSelectionCriteria(")
        append("replicaModifications=$replicaModifications,")
        append("sseKmsEncryptedObjects=$sseKmsEncryptedObjects)")
    }

    override fun hashCode(): kotlin.Int {
        var result = replicaModifications?.hashCode() ?: 0
        result = 31 * result + (sseKmsEncryptedObjects?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as SourceSelectionCriteria

        if (replicaModifications != other.replicaModifications) return false
        if (sseKmsEncryptedObjects != other.sseKmsEncryptedObjects) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.SourceSelectionCriteria = Builder(this).apply(block).build()

    class Builder {
        /**
         * A filter that you can specify for selections for modifications on replicas. Amazon S3 doesn't
         * replicate replica modifications by default. In the latest version of replication
         * configuration (when Filter is specified), you can specify this element and set
         * the status to Enabled to replicate modifications on replicas.
         *
         * If you don't specify the Filter element, Amazon S3 assumes that the
         * replication configuration is the earlier version, V1. In the earlier version, this
         * element is not allowed
         */
        var replicaModifications: aws.sdk.kotlin.services.s3.model.ReplicaModifications? = null
        /**
         * A container for filter information for the selection of Amazon S3 objects encrypted with Amazon Web Services
         * KMS. If you include SourceSelectionCriteria in the replication configuration,
         * this element is required.
         */
        var sseKmsEncryptedObjects: aws.sdk.kotlin.services.s3.model.SseKmsEncryptedObjects? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.SourceSelectionCriteria) : this() {
            this.replicaModifications = x.replicaModifications
            this.sseKmsEncryptedObjects = x.sseKmsEncryptedObjects
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.SourceSelectionCriteria = SourceSelectionCriteria(this)

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.ReplicaModifications] inside the given [block]
         */
        fun replicaModifications(block: aws.sdk.kotlin.services.s3.model.ReplicaModifications.Builder.() -> kotlin.Unit) {
            this.replicaModifications = aws.sdk.kotlin.services.s3.model.ReplicaModifications.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.SseKmsEncryptedObjects] inside the given [block]
         */
        fun sseKmsEncryptedObjects(block: aws.sdk.kotlin.services.s3.model.SseKmsEncryptedObjects.Builder.() -> kotlin.Unit) {
            this.sseKmsEncryptedObjects = aws.sdk.kotlin.services.s3.model.SseKmsEncryptedObjects.invoke(block)
        }
    }
}
