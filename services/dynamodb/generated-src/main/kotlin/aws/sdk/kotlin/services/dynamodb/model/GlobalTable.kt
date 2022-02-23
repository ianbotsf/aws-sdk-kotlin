// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents the properties of a global table.
 */
class GlobalTable private constructor(builder: Builder) {
    /**
     * The global table name.
     */
    val globalTableName: kotlin.String? = builder.globalTableName
    /**
     * The Regions where the global table has replicas.
     */
    val replicationGroup: List<Replica>? = builder.replicationGroup

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.GlobalTable = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("GlobalTable(")
        append("globalTableName=$globalTableName,")
        append("replicationGroup=$replicationGroup)")
    }

    override fun hashCode(): kotlin.Int {
        var result = globalTableName?.hashCode() ?: 0
        result = 31 * result + (replicationGroup?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as GlobalTable

        if (globalTableName != other.globalTableName) return false
        if (replicationGroup != other.replicationGroup) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.GlobalTable = Builder(this).apply(block).build()

    class Builder {
        /**
         * The global table name.
         */
        var globalTableName: kotlin.String? = null
        /**
         * The Regions where the global table has replicas.
         */
        var replicationGroup: List<Replica>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.GlobalTable) : this() {
            this.globalTableName = x.globalTableName
            this.replicationGroup = x.replicationGroup
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.GlobalTable = GlobalTable(this)
    }
}
