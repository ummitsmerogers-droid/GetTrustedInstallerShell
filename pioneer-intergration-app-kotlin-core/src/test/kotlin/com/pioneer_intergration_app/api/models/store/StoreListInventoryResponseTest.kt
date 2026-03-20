// File generated from our OpenAPI spec by Stainless.

package com.pioneer_intergration_app.api.models.store

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.pioneer_intergration_app.api.core.JsonValue
import com.pioneer_intergration_app.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StoreListInventoryResponseTest {

    @Test
    fun create() {
        val storeListInventoryResponse =
            StoreListInventoryResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from(0))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val storeListInventoryResponse =
            StoreListInventoryResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from(0))
                .build()

        val roundtrippedStoreListInventoryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(storeListInventoryResponse),
                jacksonTypeRef<StoreListInventoryResponse>(),
            )

        assertThat(roundtrippedStoreListInventoryResponse).isEqualTo(storeListInventoryResponse)
    }
}
