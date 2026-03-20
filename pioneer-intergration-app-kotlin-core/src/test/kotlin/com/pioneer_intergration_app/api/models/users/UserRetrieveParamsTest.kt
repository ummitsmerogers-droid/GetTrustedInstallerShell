// File generated from our OpenAPI spec by Stainless.

package com.pioneer_intergration_app.api.models.users

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserRetrieveParamsTest {

    @Test
    fun create() {
        UserRetrieveParams.builder().username("username").build()
    }

    @Test
    fun pathParams() {
        val params = UserRetrieveParams.builder().username("username").build()

        assertThat(params._pathParam(0)).isEqualTo("username")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
