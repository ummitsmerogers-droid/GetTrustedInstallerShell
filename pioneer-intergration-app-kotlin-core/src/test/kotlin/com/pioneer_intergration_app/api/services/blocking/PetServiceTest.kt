// File generated from our OpenAPI spec by Stainless.

package com.pioneer_intergration_app.api.services.blocking

import com.pioneer_intergration_app.api.client.okhttp.PioneerIntergrationAppOkHttpClient
import com.pioneer_intergration_app.api.models.pets.Category
import com.pioneer_intergration_app.api.models.pets.Pet
import com.pioneer_intergration_app.api.models.pets.PetFindByStatusParams
import com.pioneer_intergration_app.api.models.pets.PetFindByTagsParams
import com.pioneer_intergration_app.api.models.pets.PetUpdateByIdParams
import com.pioneer_intergration_app.api.models.pets.PetUploadImageParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PetServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = PioneerIntergrationAppOkHttpClient.builder().apiKey("My API Key").build()
        val petService = client.pets()

        val pet =
            petService.create(
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = PioneerIntergrationAppOkHttpClient.builder().apiKey("My API Key").build()
        val petService = client.pets()

        val pet = petService.retrieve(0L)

        pet.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = PioneerIntergrationAppOkHttpClient.builder().apiKey("My API Key").build()
        val petService = client.pets()

        val pet =
            petService.update(
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = PioneerIntergrationAppOkHttpClient.builder().apiKey("My API Key").build()
        val petService = client.pets()

        petService.delete(0L)
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun findByStatus() {
        val client = PioneerIntergrationAppOkHttpClient.builder().apiKey("My API Key").build()
        val petService = client.pets()

        val pets =
            petService.findByStatus(
                PetFindByStatusParams.builder()
                    .status(PetFindByStatusParams.Status.AVAILABLE)
                    .build()
            )

        pets.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun findByTags() {
        val client = PioneerIntergrationAppOkHttpClient.builder().apiKey("My API Key").build()
        val petService = client.pets()

        val pets = petService.findByTags(PetFindByTagsParams.builder().addTag("string").build())

        pets.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateById() {
        val client = PioneerIntergrationAppOkHttpClient.builder().apiKey("My API Key").build()
        val petService = client.pets()

        petService.updateById(
            PetUpdateByIdParams.builder().petId(0L).name("name").status("status").build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun uploadImage() {
        val client = PioneerIntergrationAppOkHttpClient.builder().apiKey("My API Key").build()
        val petService = client.pets()

        val response =
            petService.uploadImage(
                PetUploadImageParams.builder()
                    .petId(0L)
                    .additionalMetadata("additionalMetadata")
                    .image("Example data")
                    .build()
            )

        response.validate()
    }
}
