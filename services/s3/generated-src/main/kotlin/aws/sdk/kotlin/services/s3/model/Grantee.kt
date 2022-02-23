// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * Container for the person being granted permissions.
 */
class Grantee private constructor(builder: Builder) {
    /**
     * Screen name of the grantee.
     */
    val displayName: kotlin.String? = builder.displayName
    /**
     * Email address of the grantee.
     *
     * Using email addresses to specify a grantee is only supported in the following Amazon Web Services Regions:
     *
     *
     * US East (N. Virginia)
     *
     * US West (N. California)
     *
     * US West (Oregon)
     *
     * Asia Pacific (Singapore)
     *
     * Asia Pacific (Sydney)
     *
     * Asia Pacific (Tokyo)
     *
     * Europe (Ireland)
     *
     * South America (São Paulo)
     *
     *
     * For a list of all the Amazon S3 supported Regions and endpoints, see <a href="https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Regions and Endpoints in the Amazon Web Services General Reference.
     */
    val emailAddress: kotlin.String? = builder.emailAddress
    /**
     * The canonical user ID of the grantee.
     */
    val id: kotlin.String? = builder.id
    /**
     * Type of grantee
     */
    val type: aws.sdk.kotlin.services.s3.model.Type? = builder.type
    /**
     * URI of the grantee group.
     */
    val uri: kotlin.String? = builder.uri

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.Grantee = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("Grantee(")
        append("displayName=$displayName,")
        append("emailAddress=$emailAddress,")
        append("id=$id,")
        append("type=$type,")
        append("uri=$uri)")
    }

    override fun hashCode(): kotlin.Int {
        var result = displayName?.hashCode() ?: 0
        result = 31 * result + (emailAddress?.hashCode() ?: 0)
        result = 31 * result + (id?.hashCode() ?: 0)
        result = 31 * result + (type?.hashCode() ?: 0)
        result = 31 * result + (uri?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as Grantee

        if (displayName != other.displayName) return false
        if (emailAddress != other.emailAddress) return false
        if (id != other.id) return false
        if (type != other.type) return false
        if (uri != other.uri) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.Grantee = Builder(this).apply(block).build()

    class Builder {
        /**
         * Screen name of the grantee.
         */
        var displayName: kotlin.String? = null
        /**
         * Email address of the grantee.
         *
         * Using email addresses to specify a grantee is only supported in the following Amazon Web Services Regions:
         *
         *
         * US East (N. Virginia)
         *
         * US West (N. California)
         *
         * US West (Oregon)
         *
         * Asia Pacific (Singapore)
         *
         * Asia Pacific (Sydney)
         *
         * Asia Pacific (Tokyo)
         *
         * Europe (Ireland)
         *
         * South America (São Paulo)
         *
         *
         * For a list of all the Amazon S3 supported Regions and endpoints, see <a href="https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region">Regions and Endpoints in the Amazon Web Services General Reference.
         */
        var emailAddress: kotlin.String? = null
        /**
         * The canonical user ID of the grantee.
         */
        var id: kotlin.String? = null
        /**
         * Type of grantee
         */
        var type: aws.sdk.kotlin.services.s3.model.Type? = null
        /**
         * URI of the grantee group.
         */
        var uri: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.Grantee) : this() {
            this.displayName = x.displayName
            this.emailAddress = x.emailAddress
            this.id = x.id
            this.type = x.type
            this.uri = x.uri
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.Grantee = Grantee(this)
    }
}
