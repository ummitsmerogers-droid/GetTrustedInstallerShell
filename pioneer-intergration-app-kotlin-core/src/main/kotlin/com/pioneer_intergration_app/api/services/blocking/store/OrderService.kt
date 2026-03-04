// File generated from our OpenAPI spec by Stainless.

package com.pioneer_intergration_app.api.services.blocking.store

import com.google.errorprone.annotations.MustBeClosed
import com.pioneer_intergration_app.api.core.ClientOptions
import com.pioneer_intergration_app.api.core.RequestOptions
import com.pioneer_intergration_app.api.core.http.HttpResponse
import com.pioneer_intergration_app.api.core.http.HttpResponseFor
import com.pioneer_intergration_app.api.models.Order
import com.pioneer_intergration_app.api.models.store.orders.OrderCreateParams
import com.pioneer_intergration_app.api.models.store.orders.OrderDeleteParams
import com.pioneer_intergration_app.api.models.store.orders.OrderRetrieveParams

/** Access to Petstore orders */
interface OrderService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): OrderService

    /** Place a new order in the store */
    fun create(
        params: OrderCreateParams = OrderCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Order

    /** @see create */
    fun create(order: Order, requestOptions: RequestOptions = RequestOptions.none()): Order =
        create(OrderCreateParams.builder().order(order).build(), requestOptions)

    /** @see create */
    fun create(requestOptions: RequestOptions): Order =
        create(OrderCreateParams.none(), requestOptions)

    /**
     * For valid response try integer IDs with value <= 5 or > 10. Other values will generate
     * exceptions.
     */
    fun retrieve(
        orderId: Long,
        params: OrderRetrieveParams = OrderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Order = retrieve(params.toBuilder().orderId(orderId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: OrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Order

    /** @see retrieve */
    fun retrieve(orderId: Long, requestOptions: RequestOptions): Order =
        retrieve(orderId, OrderRetrieveParams.none(), requestOptions)

    /**
     * For valid response try integer IDs with value < 1000. Anything above 1000 or nonintegers will
     * generate API errors
     */
    fun delete(
        orderId: Long,
        params: OrderDeleteParams = OrderDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().orderId(orderId).build(), requestOptions)

    /** @see delete */
    fun delete(params: OrderDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(orderId: Long, requestOptions: RequestOptions) =
        delete(orderId, OrderDeleteParams.none(), requestOptions)

    /** A view of [OrderService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): OrderService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /store/order`, but is otherwise the same as
         * [OrderService.create].
         */
        @MustBeClosed
        fun create(
            params: OrderCreateParams = OrderCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Order>

        /** @see create */
        @MustBeClosed
        fun create(
            order: Order,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Order> =
            create(OrderCreateParams.builder().order(order).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<Order> =
            create(OrderCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /store/order/{orderId}`, but is otherwise the same
         * as [OrderService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            orderId: Long,
            params: OrderRetrieveParams = OrderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Order> =
            retrieve(params.toBuilder().orderId(orderId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: OrderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Order>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(orderId: Long, requestOptions: RequestOptions): HttpResponseFor<Order> =
            retrieve(orderId, OrderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /store/order/{orderId}`, but is otherwise the
         * same as [OrderService.delete].
         */
        @MustBeClosed
        fun delete(
            orderId: Long,
            params: OrderDeleteParams = OrderDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().orderId(orderId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: OrderDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(orderId: Long, requestOptions: RequestOptions): HttpResponse =
            delete(orderId, OrderDeleteParams.none(), requestOptions)
    }
}
