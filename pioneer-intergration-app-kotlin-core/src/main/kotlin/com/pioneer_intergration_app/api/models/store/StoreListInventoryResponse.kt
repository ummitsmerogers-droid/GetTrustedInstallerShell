// File generated from our OpenAPI spec by Stainless.

package com.pioneer_intergration_app.api.models.store

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.pioneer_intergration_app.api.core.ExcludeMissing
import com.pioneer_intergration_app.api.core.JsonValue
import com.pioneer_intergration_app.api.core.toImmutable
import com.pioneer_intergration_app.api.errors.PioneerIntergrationAppInvalidDataException
import java.util.Objects

class StoreListInventoryResponse
@JsonCreator
private constructor(
    @com.fasterxml.jackson.annotation.JsonValue
    private val additionalProperties: Map<String, JsonValue>
) {

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [StoreListInventoryResponse].
         */
        fun builder() = Builder()
    }

    /** A builder for [StoreListInventoryResponse]. */
    class Builder internal constructor() {

        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(storeListInventoryResponse: StoreListInventoryResponse) = apply {
            additionalProperties = storeListInventoryResponse.additionalProperties.toMutableMap()
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [StoreListInventoryResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): StoreListInventoryResponse =
            StoreListInventoryResponse(additionalProperties.toImmutable())
    }

    private var validated: Boolean = false

    fun validate(): StoreListInventoryResponse = apply {
        if (validated) {
            return@apply
        }

        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: PioneerIntergrationAppInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StoreListInventoryResponse &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StoreListInventoryResponse{additionalProperties=$additionalProperties}"
}
