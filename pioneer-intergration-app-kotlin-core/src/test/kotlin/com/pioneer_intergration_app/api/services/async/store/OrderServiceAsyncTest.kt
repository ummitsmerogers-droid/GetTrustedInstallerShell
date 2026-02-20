// File generated from our OpenAPI spec by Stainless.

package com.pioneer_intergration_app.api.services.async.store

import com.pioneer_intergration_app.api.client.okhttp.PioneerIntergrationAppOkHttpClientAsync
import com.pioneer_intergration_app.api.models.Order
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OrderServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun create() {
        val client = PioneerIntergrationAppOkHttpClientAsync.builder().apiKey("My API Key").build()
        val orderServiceAsync = client.store().orders()

        val order =
            orderServiceAsync.create(
                Order.builder()
                    .id(10L)
                    .complete(true)
                    .petId(198772L)
                    .quantity(7)
                    .shipDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .status(Order.Status.APPROVED)
                    .build()
            )

        order.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = PioneerIntergrationAppOkHttpClientAsync.builder().apiKey("My API Key").build()
        val orderServiceAsync = client.store().orders()

        val order = orderServiceAsync.retrieve(0L)

        order.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun delete() {
        val client = PioneerIntergrationAppOkHttpClientAsync.builder().apiKey("My API Key").build()
        val orderServiceAsync = client.store().orders()

        orderServiceAsync.delete(0L)
    }
}
