// File generated from our OpenAPI spec by Stainless.

package com.pioneer_intergration_app.api.errors

import com.pioneer_intergration_app.api.core.JsonValue
import com.pioneer_intergration_app.api.core.http.Headers

abstract class PioneerIntergrationAppServiceException
protected constructor(message: String, cause: Throwable? = null) :
    PioneerIntergrationAppException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
