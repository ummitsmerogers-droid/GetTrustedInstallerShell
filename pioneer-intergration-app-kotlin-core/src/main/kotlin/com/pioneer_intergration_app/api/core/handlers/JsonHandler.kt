@file:JvmName("JsonHandler")

package com.pioneer_intergration_app.api.core.handlers

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.pioneer_intergration_app.api.core.http.HttpResponse
import com.pioneer_intergration_app.api.core.http.HttpResponse.Handler
import com.pioneer_intergration_app.api.errors.PioneerIntergrationAppInvalidDataException

internal inline fun <reified T> jsonHandler(jsonMapper: JsonMapper): Handler<T> =
    object : Handler<T> {
        override fun handle(response: HttpResponse): T {
            try {
                return jsonMapper.readValue(response.body(), jacksonTypeRef())
            } catch (e: Exception) {
                throw PioneerIntergrationAppInvalidDataException("Error reading response", e)
            }
        }
    }
