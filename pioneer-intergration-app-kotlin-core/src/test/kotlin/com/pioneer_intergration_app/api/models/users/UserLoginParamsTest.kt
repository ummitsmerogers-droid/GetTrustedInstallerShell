// File generated from our OpenAPI spec by Stainless.

package com.pioneer_intergration_app.api.models.users

import com.pioneer_intergration_app.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserLoginParamsTest {

    @Test
    fun create() {
        UserLoginParams.builder().password("password").username("username").build()
    }

    @Test
    fun queryParams() {
        val params = UserLoginParams.builder().password("password").username("username").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("password", "password")
                    .put("username", "username")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = UserLoginParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
