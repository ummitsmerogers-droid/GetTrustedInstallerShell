// File generated from our OpenAPI spec by Stainless.

package com.pioneer_intergration_app.api.models.users

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.pioneer_intergration_app.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserTest {

    @Test
    fun create() {
        val user =
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

        assertThat(user.id()).isEqualTo(10L)
        assertThat(user.email()).isEqualTo("john@email.com")
        assertThat(user.firstName()).isEqualTo("John")
        assertThat(user.lastName()).isEqualTo("James")
        assertThat(user.password()).isEqualTo("12345")
        assertThat(user.phone()).isEqualTo("12345")
        assertThat(user.username()).isEqualTo("theUser")
        assertThat(user.userStatus()).isEqualTo(1)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val user =
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

        val roundtrippedUser =
            jsonMapper.readValue(jsonMapper.writeValueAsString(user), jacksonTypeRef<User>())

        assertThat(roundtrippedUser).isEqualTo(user)
    }
}
