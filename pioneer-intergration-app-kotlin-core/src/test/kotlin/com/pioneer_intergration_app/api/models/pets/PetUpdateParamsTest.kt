// File generated from our OpenAPI spec by Stainless.

package com.pioneer_intergration_app.api.models.pets

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PetUpdateParamsTest {

    @Test
    fun create() {
        PetUpdateParams.builder()
            .pet(
                Pet.builder()
                    .name("doggie")
                    .addPhotoUrl("string")
                    .id(10L)
                    .category(Category.builder().id(1L).name("Dogs").build())
                    .status(Pet.Status.AVAILABLE)
                    .addTag(Pet.Tag.builder().id(0L).name("name").build())
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            PetUpdateParams.builder()
                .pet(
                    Pet.builder()
                        .name("doggie")
                        .addPhotoUrl("string")
                        .id(10L)
                        .category(Category.builder().id(1L).name("Dogs").build())
                        .status(Pet.Status.AVAILABLE)
                        .addTag(Pet.Tag.builder().id(0L).name("name").build())
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                Pet.builder()
                    .name("doggie")
                    .addPhotoUrl("string")
                    .id(10L)
                    .category(Category.builder().id(1L).name("Dogs").build())
                    .status(Pet.Status.AVAILABLE)
                    .addTag(Pet.Tag.builder().id(0L).name("name").build())
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PetUpdateParams.builder()
                .pet(Pet.builder().name("doggie").addPhotoUrl("string").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(Pet.builder().name("doggie").addPhotoUrl("string").build())
    }
}
