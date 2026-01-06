// File generated from our OpenAPI spec by Stainless.

package com.pioneer_intergration_app.api.models.pets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.pioneer_intergration_app.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PetUploadImageResponseTest {

    @Test
    fun create() {
        val petUploadImageResponse =
            PetUploadImageResponse.builder().code(0).message("message").type("type").build()

        assertThat(petUploadImageResponse.code()).isEqualTo(0)
        assertThat(petUploadImageResponse.message()).isEqualTo("message")
        assertThat(petUploadImageResponse.type()).isEqualTo("type")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val petUploadImageResponse =
            PetUploadImageResponse.builder().code(0).message("message").type("type").build()

        val roundtrippedPetUploadImageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(petUploadImageResponse),
                jacksonTypeRef<PetUploadImageResponse>(),
            )

        assertThat(roundtrippedPetUploadImageResponse).isEqualTo(petUploadImageResponse)
    }
}
