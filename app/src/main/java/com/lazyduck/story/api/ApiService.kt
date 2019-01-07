package com.lazyduck.story.api

import androidx.lifecycle.LiveData
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * @author datto
 */
interface ApiService {
    @GET("users/{login}")
    fun getUser(@Path("login") login: String): LiveData<String>
}