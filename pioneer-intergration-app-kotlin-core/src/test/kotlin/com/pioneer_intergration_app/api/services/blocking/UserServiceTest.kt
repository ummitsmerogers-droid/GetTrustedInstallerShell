// File generated from our OpenAPI spec by Stainless.

package com.pioneer_intergration_app.api.services.blocking

import com.pioneer_intergration_app.api.TestServerExtension
import com.pioneer_intergration_app.api.client.okhttp.PioneerIntergrationAppOkHttpClient
import com.pioneer_intergration_app.api.models.users.User
import com.pioneer_intergration_app.api.models.users.UserCreateWithListParams
import com.pioneer_intergration_app.api.models.users.UserLoginParams
import com.pioneer_intergration_app.api.models.users.UserUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UserServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            PioneerIntergrationAppOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userService = client.users()

        val user =
            userService.create(
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

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            PioneerIntergrationAppOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userService = client.users()

        val user = userService.retrieve("username")

        user.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            PioneerIntergrationAppOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userService = client.users()

        userService.update(
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

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            PioneerIntergrationAppOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userService = client.users()

        userService.delete("username")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createWithList() {
        val client =
            PioneerIntergrationAppOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userService = client.users()

        val user =
            userService.createWithList(
                UserCreateWithListParams.builder()
                    .addItem(
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

        user.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun login() {
        val client =
            PioneerIntergrationAppOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userService = client.users()

        userService.login(
            UserLoginParams.builder().password("password").username("username").build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun logout() {
        val client =
            PioneerIntergrationAppOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val userService = client.users()

        userService.logout()
    }
}
