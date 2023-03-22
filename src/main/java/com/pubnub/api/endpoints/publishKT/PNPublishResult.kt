package com.pubnub.api.endpoints.publishKT


/**
 * Result of the [PubNub.publish] operation
 *
 * @property timetoken The time token when the message or signal was published.
 */
class PNPublishResult internal constructor(
    val timetoken: Long
)
