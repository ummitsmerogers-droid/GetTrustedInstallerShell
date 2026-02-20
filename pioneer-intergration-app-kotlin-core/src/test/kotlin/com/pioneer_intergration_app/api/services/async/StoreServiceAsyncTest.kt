// File generated from our OpenAPI spec by Stainless.

package com.pioneer_intergration_app.api.services.async

import com.pioneer_intergration_app.api.client.okhttp.PioneerIntergrationAppOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class StoreServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun listInventory() {
        val client = PioneerIntergrationAppOkHttpClientAsync.builder().apiKey("My API Key").build()
        val storeServiceAsync = client.store()

        val response = storeServiceAsync.listInventory()

        response.validate()
    }
}
