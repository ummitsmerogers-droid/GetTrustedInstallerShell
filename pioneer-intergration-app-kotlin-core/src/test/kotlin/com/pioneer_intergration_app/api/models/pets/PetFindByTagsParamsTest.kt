// File generated from our OpenAPI spec by Stainless.

package com.pioneer_intergration_app.api.models.pets

import com.pioneer_intergration_app.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PetFindByTagsParamsTest {

    @Test
    fun create() {
        PetFindByTagsParams.builder().addTag("string").build()
    }

    @Test
    fun queryParams() {
        val params = PetFindByTagsParams.builder().addTag("string").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("tags", listOf("string").joinToString(",")).build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PetFindByTagsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
