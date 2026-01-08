package com.pioneer_intergration_app.api.errors

class PioneerIntergrationAppInvalidDataException(
    message: String? = null,
    cause: Throwable? = null,
) : PioneerIntergrationAppException(message, cause)
