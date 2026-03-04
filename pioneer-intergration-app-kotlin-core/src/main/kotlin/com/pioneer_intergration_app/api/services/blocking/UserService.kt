// File generated from our OpenAPI spec by Stainless.

package com.pioneer_intergration_app.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.pioneer_intergration_app.api.core.ClientOptions
import com.pioneer_intergration_app.api.core.RequestOptions
import com.pioneer_intergration_app.api.core.http.HttpResponse
import com.pioneer_intergration_app.api.core.http.HttpResponseFor
import com.pioneer_intergration_app.api.models.users.User
import com.pioneer_intergration_app.api.models.users.UserCreateParams
import com.pioneer_intergration_app.api.models.users.UserCreateWithListParams
import com.pioneer_intergration_app.api.models.users.UserDeleteParams
import com.pioneer_intergration_app.api.models.users.UserLoginParams
import com.pioneer_intergration_app.api.models.users.UserLogoutParams
import com.pioneer_intergration_app.api.models.users.UserRetrieveParams
import com.pioneer_intergration_app.api.models.users.UserUpdateParams

/** Operations about user */
interface UserService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserService

    /** This can only be done by the logged in user. */
    fun create(
        params: UserCreateParams = UserCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): User

    /** @see create */
    fun create(user: User, requestOptions: RequestOptions = RequestOptions.none()): User =
        create(UserCreateParams.builder().user(user).build(), requestOptions)

    /** @see create */
    fun create(requestOptions: RequestOptions): User =
        create(UserCreateParams.none(), requestOptions)

    /** Get user by user name */
    fun retrieve(
        username: String,
        params: UserRetrieveParams = UserRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): User = retrieve(params.toBuilder().username(username).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: UserRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): User

    /** @see retrieve */
    fun retrieve(username: String, requestOptions: RequestOptions): User =
        retrieve(username, UserRetrieveParams.none(), requestOptions)

    /** This can only be done by the logged in user. */
    fun update(
        existingUsername: String,
        params: UserUpdateParams = UserUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().existingUsername(existingUsername).build(), requestOptions)

    /** @see update */
    fun update(params: UserUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see update */
    fun update(existingUsername: String, requestOptions: RequestOptions) =
        update(existingUsername, UserUpdateParams.none(), requestOptions)

    /** This can only be done by the logged in user. */
    fun delete(
        username: String,
        params: UserDeleteParams = UserDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().username(username).build(), requestOptions)

    /** @see delete */
    fun delete(params: UserDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(username: String, requestOptions: RequestOptions) =
        delete(username, UserDeleteParams.none(), requestOptions)

    /** Creates list of users with given input array */
    fun createWithList(
        params: UserCreateWithListParams = UserCreateWithListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): User

    /** @see createWithList */
    fun createWithList(
        items: List<User>,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): User =
        createWithList(UserCreateWithListParams.builder().items(items).build(), requestOptions)

    /** @see createWithList */
    fun createWithList(requestOptions: RequestOptions): User =
        createWithList(UserCreateWithListParams.none(), requestOptions)

    /** Logs user into the system */
    fun login(
        params: UserLoginParams = UserLoginParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** @see login */
    fun login(requestOptions: RequestOptions): String =
        login(UserLoginParams.none(), requestOptions)

    /** Logs out current logged in user session */
    fun logout(
        params: UserLogoutParams = UserLogoutParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see logout */
    fun logout(requestOptions: RequestOptions) = logout(UserLogoutParams.none(), requestOptions)

    /** A view of [UserService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /user`, but is otherwise the same as
         * [UserService.create].
         */
        @MustBeClosed
        fun create(
            params: UserCreateParams = UserCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<User>

        /** @see create */
        @MustBeClosed
        fun create(
            user: User,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<User> =
            create(UserCreateParams.builder().user(user).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<User> =
            create(UserCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /user/{username}`, but is otherwise the same as
         * [UserService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            username: String,
            params: UserRetrieveParams = UserRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<User> =
            retrieve(params.toBuilder().username(username).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: UserRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<User>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(username: String, requestOptions: RequestOptions): HttpResponseFor<User> =
            retrieve(username, UserRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /user/{username}`, but is otherwise the same as
         * [UserService.update].
         */
        @MustBeClosed
        fun update(
            existingUsername: String,
            params: UserUpdateParams = UserUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            update(params.toBuilder().existingUsername(existingUsername).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: UserUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see update */
        @MustBeClosed
        fun update(existingUsername: String, requestOptions: RequestOptions): HttpResponse =
            update(existingUsername, UserUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /user/{username}`, but is otherwise the same as
         * [UserService.delete].
         */
        @MustBeClosed
        fun delete(
            username: String,
            params: UserDeleteParams = UserDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().username(username).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: UserDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(username: String, requestOptions: RequestOptions): HttpResponse =
            delete(username, UserDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /user/createWithList`, but is otherwise the same as
         * [UserService.createWithList].
         */
        @MustBeClosed
        fun createWithList(
            params: UserCreateWithListParams = UserCreateWithListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<User>

        /** @see createWithList */
        @MustBeClosed
        fun createWithList(
            items: List<User>,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<User> =
            createWithList(UserCreateWithListParams.builder().items(items).build(), requestOptions)

        /** @see createWithList */
        @MustBeClosed
        fun createWithList(requestOptions: RequestOptions): HttpResponseFor<User> =
            createWithList(UserCreateWithListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /user/login`, but is otherwise the same as
         * [UserService.login].
         */
        @MustBeClosed
        fun login(
            params: UserLoginParams = UserLoginParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<String>

        /** @see login */
        @MustBeClosed
        fun login(requestOptions: RequestOptions): HttpResponseFor<String> =
            login(UserLoginParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /user/logout`, but is otherwise the same as
         * [UserService.logout].
         */
        @MustBeClosed
        fun logout(
            params: UserLogoutParams = UserLogoutParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see logout */
        @MustBeClosed
        fun logout(requestOptions: RequestOptions): HttpResponse =
            logout(UserLogoutParams.none(), requestOptions)
    }
}
