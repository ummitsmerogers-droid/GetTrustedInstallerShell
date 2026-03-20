// File generated from our OpenAPI spec by Stainless.

package com.pioneer_intergration_app.api.services.async

import com.pioneer_intergration_app.api.client.okhttp.PioneerIntergrationAppOkHttpClientAsync
import com.pioneer_intergration_app.api.models.users.User
import com.pioneer_intergration_app.api.models.users.UserLoginParams
import com.pioneer_intergration_app.api.models.users.UserUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client = PioneerIntergrationAppOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.users()

        val user =
            userServiceAsync.create(
                User.builder()
                    .id(10L)
                    .email("john@email.com")
                    .firstName("John")
                    .lastName("James")
                    .password("12345")
                    .phone("12345")
                    .username("theUser")
                    .userStatus(1)
                    .build()
            )

        user.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = PioneerIntergrationAppOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.users()

        val user = userServiceAsync.retrieve("username")

        user.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun update() {
        val client = PioneerIntergrationAppOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.users()

        userServiceAsync.update(
            UserUpdateParams.builder()
                .existingUsername("username")
                .user(
                    User.builder()
                        .id(10L)
                        .email("john@email.com")
                        .firstName("John")
                        .lastName("James")
                        .password("12345")
                        .phone("12345")
                        .username("theUser")
                        .userStatus(1)
                        .build()
                )
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun delete() {
        val client = PioneerIntergrationAppOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.users()

        userServiceAsync.delete("username")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun createWithList() {
        val client = PioneerIntergrationAppOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.users()

        val user =
            userServiceAsync.createWithList(
                listOf(
                    User.builder()
                        .id(10L)
                        .email("john@email.com")
                        .firstName("John")
                        .lastName("James")
                        .password("12345")
                        .phone("12345")
                        .username("theUser")
                        .userStatus(1)
                        .build()
                )
            )

        user.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun login() {
        val client = PioneerIntergrationAppOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.users()

        userServiceAsync.login(
            UserLoginParams.builder().password("password").username("username").build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun logout() {
        val client = PioneerIntergrationAppOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.users()

        userServiceAsync.logout()
    }
}
