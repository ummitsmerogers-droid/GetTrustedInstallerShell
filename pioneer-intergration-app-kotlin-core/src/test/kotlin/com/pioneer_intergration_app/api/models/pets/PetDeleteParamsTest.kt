// File generated from our OpenAPI spec by Stainless.

package com.pioneer_intergration_app.api.models.pets

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PetDeleteParamsTest {

    @Test
    fun create() {
        PetDeleteParams.builder().petId(0L).build()
    }

    @Test
    fun pathParams() {
        val params = PetDeleteParams.builder().petId(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
