// File generated from our OpenAPI spec by Stainless.

package com.pioneer_intergration_app.api.services.blocking

import com.pioneer_intergration_app.api.TestServerExtension
import com.pioneer_intergration_app.api.client.okhttp.PioneerIntergrationAppOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StoreServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun listInventory() {
        val client =
            PioneerIntergrationAppOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val storeService = client.store()

        val response = storeService.listInventory()

        response.validate()
    }
}
