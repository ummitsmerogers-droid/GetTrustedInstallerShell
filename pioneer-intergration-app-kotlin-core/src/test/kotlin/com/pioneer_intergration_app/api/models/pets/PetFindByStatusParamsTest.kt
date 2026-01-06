// File generated from our OpenAPI spec by Stainless.

package com.pioneer_intergration_app.api.models.pets

import com.pioneer_intergration_app.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PetFindByStatusParamsTest {

    @Test
    fun create() {
        PetFindByStatusParams.builder().status(PetFindByStatusParams.Status.AVAILABLE).build()
    }

    @Test
    fun queryParams() {
        val params =
            PetFindByStatusParams.builder().status(PetFindByStatusParams.Status.AVAILABLE).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("status", "available").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PetFindByStatusParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
