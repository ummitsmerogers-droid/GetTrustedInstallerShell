package com.pioneer_intergration_app.api.core

import com.fasterxml.jackson.databind.ser.std.StdSerializer
import kotlin.reflect.KClass

abstract class BaseSerializer<T : Any>(type: KClass<T>) : StdSerializer<T>(type.java)
