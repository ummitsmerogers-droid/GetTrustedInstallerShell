// File generated from our OpenAPI spec by Stainless.

package com.pioneer_intergration_app.api.models.store.orders

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrderDeleteParamsTest {

    @Test
    fun create() {
        OrderDeleteParams.builder().orderId(0L).build()
    }

    @Test
    fun pathParams() {
        val params = OrderDeleteParams.builder().orderId(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
