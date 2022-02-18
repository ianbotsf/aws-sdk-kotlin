/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0.
 */

package aws.sdk.kotlin.runtime.protocol.eventstream

import aws.sdk.kotlin.runtime.auth.signing.AwsSigningConfig
import aws.sdk.kotlin.runtime.auth.signing.SigningResult
import aws.sdk.kotlin.runtime.auth.signing.sign
import aws.sdk.kotlin.runtime.execution.AuthAttributes
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.io.SdkByteBuffer
import aws.smithy.kotlin.runtime.io.bytes
import aws.smithy.kotlin.runtime.time.Clock
import aws.smithy.kotlin.runtime.time.Instant
import aws.smithy.kotlin.runtime.util.InternalApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

/**
 * Creates a flow that signs each event stream message with the given signing config.
 *
 * Each message's signature incorporates the signature of the previous message.
 * The very first message incorporates the signature of the initial-request for
 * both HTTP2 and WebSockets. The initial signature comes from the execution context.
 */
@InternalApi
public fun Flow<Message>.sign(
    context: ExecutionContext,
    config: AwsSigningConfig,
): Flow<Message> = flow {
    val messages = this@sign

    // NOTE: We need the signature of the initial HTTP request to seed the event stream signatures
    // This is a bit of a chicken and egg problem since the event stream is constructed before the request
    // is signed. The body of the stream shouldn't start being consumed though until after the entire request
    // is built. Thus, by the time we get here the signature will exist in the context.
    var prevSignature = context.getOrNull(AuthAttributes.RequestSignature) ?: error("expected initial HTTP signature to be set before message signing commences")

    // signature date is updated per event message
    val configBuilder = config.toBuilder()

    messages.collect { message ->
        // FIXME - can we get an estimate here on size?
        val buffer = SdkByteBuffer(0U)
        message.encode(buffer)

        // the entire message is wrapped as the payload of the signed message
        val result = signPayload(configBuilder, prevSignature, buffer.bytes())
        prevSignature = result.signature
        emit(result.output)
    }
}

internal suspend fun signPayload(
    configBuilder: AwsSigningConfig.Builder,
    prevSignature: ByteArray,
    messagePayload: ByteArray,
    clock: Clock = Clock.System
): SigningResult<Message> {
    val dt = clock.now().truncateSubsecs()
    val config = configBuilder.apply { date = dt }.build()

    val result = sign(messagePayload, prevSignature, config)
    val signature = result.signature

    val signedMessage = buildMessage {
        addHeader(":date", HeaderValue.Timestamp(dt))
        addHeader(":chunk-signature", HeaderValue.ByteArray(signature))
        payload = messagePayload
    }

    return SigningResult(signedMessage, signature)
}

/**
 * Truncate the sub-seconds from the current time
 */
private fun Instant.truncateSubsecs(): Instant = Instant.fromEpochSeconds(epochSeconds, 0)
