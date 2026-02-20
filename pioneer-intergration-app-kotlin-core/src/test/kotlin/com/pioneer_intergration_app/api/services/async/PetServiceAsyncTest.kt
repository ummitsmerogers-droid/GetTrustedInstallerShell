// File generated from our OpenAPI spec by Stainless.

package com.pioneer_intergration_app.api.services.async

import com.pioneer_intergration_app.api.client.okhttp.PioneerIntergrationAppOkHttpClientAsync
import com.pioneer_intergration_app.api.models.pets.Category
import com.pioneer_intergration_app.api.models.pets.Pet
import com.pioneer_intergration_app.api.models.pets.PetFindByStatusParams
import com.pioneer_intergration_app.api.models.pets.PetFindByTagsParams
import com.pioneer_intergration_app.api.models.pets.PetUpdateByIdParams
import com.pioneer_intergration_app.api.models.pets.PetUploadImageParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PetServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun create() {
        val client = PioneerIntergrationAppOkHttpClientAsync.builder().apiKey("My API Key").build()
        val petServiceAsync = client.pets()

        val pet =
            petServiceAsync.create(
                Pet.builder()
                    .name("doggie")
                    .addPhotoUrl("string")
                    .id(10L)
                    .category(Category.builder().id(1L).name("Dogs").build())
                    .status(Pet.Status.AVAILABLE)
                    .addTag(Pet.Tag.builder().id(0L).name("name").build())
                    .build()
            )

        pet.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = PioneerIntergrationAppOkHttpClientAsync.builder().apiKey("My API Key").build()
        val petServiceAsync = client.pets()

        val pet = petServiceAsync.retrieve(0L)

        pet.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun update() {
        val client = PioneerIntergrationAppOkHttpClientAsync.builder().apiKey("My API Key").build()
        val petServiceAsync = client.pets()

        val pet =
            petServiceAsync.update(
                Pet.builder()
                    .name("doggie")
                    .addPhotoUrl("string")
                    .id(10L)
                    .category(Category.builder().id(1L).name("Dogs").build())
                    .status(Pet.Status.AVAILABLE)
                    .addTag(Pet.Tag.builder().id(0L).name("name").build())
                    .build()
            )

        pet.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun delete() {
        val client = PioneerIntergrationAppOkHttpClientAsync.builder().apiKey("My API Key").build()
        val petServiceAsync = client.pets()

        petServiceAsync.delete(0L)
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun findByStatus() {
        val client = PioneerIntergrationAppOkHttpClientAsync.builder().apiKey("My API Key").build()
        val petServiceAsync = client.pets()

        val pets =
            petServiceAsync.findByStatus(
                PetFindByStatusParams.builder()
                    .status(PetFindByStatusParams.Status.AVAILABLE)
                    .build()
            )

        pets.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun findByTags() {
        val client = PioneerIntergrationAppOkHttpClientAsync.builder().apiKey("My API Key").build()
        val petServiceAsync = client.pets()

        val pets =
            petServiceAsync.findByTags(PetFindByTagsParams.builder().addTag("string").build())

        pets.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun updateById() {
        val client = PioneerIntergrationAppOkHttpClientAsync.builder().apiKey("My API Key").build()
        val petServiceAsync = client.pets()

        petServiceAsync.updateById(
            PetUpdateByIdParams.builder().petId(0L).name("name").status("status").build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun uploadImage() {
        val client = PioneerIntergrationAppOkHttpClientAsync.builder().apiKey("My API Key").build()
        val petServiceAsync = client.pets()

        val response =
            petServiceAsync.uploadImage(
                PetUploadImageParams.builder()
                    .petId(0L)
                    .additionalMetadata("additionalMetadata")
                    .image("some content")
                    .build()
            )

        response.validate()
    }
}
