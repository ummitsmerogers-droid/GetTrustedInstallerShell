// File generated from our OpenAPI spec by Stainless.

package com.pioneer_intergration_app.api.models.pets

import com.pioneer_intergration_app.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PetUpdateByIdParamsTest {

    @Test
    fun create() {
        PetUpdateByIdParams.builder().petId(0L).name("name").status("status").build()
    }

    @Test
    fun pathParams() {
        val params = PetUpdateByIdParams.builder().petId(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = PetUpdateByIdParams.builder().petId(0L).name("name").status("status").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("name", "name").put("status", "status").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PetUpdateByIdParams.builder().petId(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
