/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0.
 */

package aws.sdk.kotlin.runtime.protocol.eventstream

import aws.sdk.kotlin.runtime.InternalSdkApi
import aws.smithy.kotlin.runtime.http.HttpBody
import aws.smithy.kotlin.runtime.http.toHttpBody
import aws.smithy.kotlin.runtime.io.SdkByteBuffer
import aws.smithy.kotlin.runtime.io.SdkByteChannel
import aws.smithy.kotlin.runtime.io.bytes
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import kotlin.coroutines.coroutineContext

/**
 * Transform the stream of messages into a stream of raw bytes. Each
 * element of the resulting flow is the encoded version of the corresponding message
 */
@InternalSdkApi
public fun Flow<Message>.encode(): Flow<ByteArray> = map {
    // TODO - can we figure out the encoded size and directly get a byte array
    val buffer = SdkByteBuffer(1024U)
    it.encode(buffer)
    buffer.bytes()
}

/**
 * Transform a stream of encoded messages into an [HttpBody].
 */
@InternalSdkApi
public suspend fun Flow<ByteArray>.asEventStreamHttpBody(): HttpBody {
    val encodedMessages = this
    val ch = SdkByteChannel(true)

    // FIXME - we should probably tie this to our own scope (off ExecutionContext) but for now
    //         tie it to whatever arbitrary scope we are in
    val scope = CoroutineScope(coroutineContext)

    val job = scope.launch {
        encodedMessages.collect {
            ch.writeFully(it)
        }
    }

    job.invokeOnCompletion { cause ->
        ch.close(cause)
    }

    return ch.toHttpBody()
}
