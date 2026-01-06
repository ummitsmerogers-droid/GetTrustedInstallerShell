@file:JvmName("EmptyHandler")

package com.pioneer_intergration_app.api.core.handlers

import com.pioneer_intergration_app.api.core.http.HttpResponse
import com.pioneer_intergration_app.api.core.http.HttpResponse.Handler

internal fun emptyHandler(): Handler<Void?> = EmptyHandlerInternal

private object EmptyHandlerInternal : Handler<Void?> {
    override fun handle(response: HttpResponse): Void? = null
}
