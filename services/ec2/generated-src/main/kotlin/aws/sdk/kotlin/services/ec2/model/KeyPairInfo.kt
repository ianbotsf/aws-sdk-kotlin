// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a key pair.
 */
class KeyPairInfo private constructor(builder: Builder) {
    /**
     * If you used CreateKeyPair to create the key pair:
     *
     *
     * For RSA key pairs, the key fingerprint is the SHA-1 digest of the DER encoded private key.
     *
     *
     *
     * For ED25519 key pairs, the key fingerprint is the base64-encoded SHA-256 digest, which
     * is the default for OpenSSH, starting with <a href="http://www.openssh.com/txt/release-6.8">OpenSSH 6.8.
     *
     *
     * If you used ImportKeyPair to provide Amazon Web Services the public key:
     *
     *
     * For RSA key pairs, the key fingerprint is the MD5 public key fingerprint as specified in section 4 of RFC4716.
     *
     *
     * For ED25519 key pairs, the key fingerprint is the base64-encoded SHA-256
     * digest, which is the default for OpenSSH, starting with <a href="http://www.openssh.com/txt/release-6.8">OpenSSH 6.8.
     */
    val keyFingerprint: kotlin.String? = builder.keyFingerprint
    /**
     * The name of the key pair.
     */
    val keyName: kotlin.String? = builder.keyName
    /**
     * The ID of the key pair.
     */
    val keyPairId: kotlin.String? = builder.keyPairId
    /**
     * The type of key pair.
     */
    val keyType: aws.sdk.kotlin.services.ec2.model.KeyType? = builder.keyType
    /**
     * Any tags applied to the key pair.
     */
    val tags: List<Tag>? = builder.tags

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.KeyPairInfo = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("KeyPairInfo(")
        append("keyFingerprint=$keyFingerprint,")
        append("keyName=$keyName,")
        append("keyPairId=$keyPairId,")
        append("keyType=$keyType,")
        append("tags=$tags)")
    }

    override fun hashCode(): kotlin.Int {
        var result = keyFingerprint?.hashCode() ?: 0
        result = 31 * result + (keyName?.hashCode() ?: 0)
        result = 31 * result + (keyPairId?.hashCode() ?: 0)
        result = 31 * result + (keyType?.hashCode() ?: 0)
        result = 31 * result + (tags?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as KeyPairInfo

        if (keyFingerprint != other.keyFingerprint) return false
        if (keyName != other.keyName) return false
        if (keyPairId != other.keyPairId) return false
        if (keyType != other.keyType) return false
        if (tags != other.tags) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.KeyPairInfo = Builder(this).apply(block).build()

    class Builder {
        /**
         * If you used CreateKeyPair to create the key pair:
         *
         *
         * For RSA key pairs, the key fingerprint is the SHA-1 digest of the DER encoded private key.
         *
         *
         *
         * For ED25519 key pairs, the key fingerprint is the base64-encoded SHA-256 digest, which
         * is the default for OpenSSH, starting with <a href="http://www.openssh.com/txt/release-6.8">OpenSSH 6.8.
         *
         *
         * If you used ImportKeyPair to provide Amazon Web Services the public key:
         *
         *
         * For RSA key pairs, the key fingerprint is the MD5 public key fingerprint as specified in section 4 of RFC4716.
         *
         *
         * For ED25519 key pairs, the key fingerprint is the base64-encoded SHA-256
         * digest, which is the default for OpenSSH, starting with <a href="http://www.openssh.com/txt/release-6.8">OpenSSH 6.8.
         */
        var keyFingerprint: kotlin.String? = null
        /**
         * The name of the key pair.
         */
        var keyName: kotlin.String? = null
        /**
         * The ID of the key pair.
         */
        var keyPairId: kotlin.String? = null
        /**
         * The type of key pair.
         */
        var keyType: aws.sdk.kotlin.services.ec2.model.KeyType? = null
        /**
         * Any tags applied to the key pair.
         */
        var tags: List<Tag>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.KeyPairInfo) : this() {
            this.keyFingerprint = x.keyFingerprint
            this.keyName = x.keyName
            this.keyPairId = x.keyPairId
            this.keyType = x.keyType
            this.tags = x.tags
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.KeyPairInfo = KeyPairInfo(this)
    }
}
