// File generated from our OpenAPI spec by Stainless.

package com.pioneer_intergration_app.api.models.users

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserCreateWithListParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body)
            .containsExactly(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = UserCreateWithListParams.builder().build()

        val body = params._body()
    }
}
