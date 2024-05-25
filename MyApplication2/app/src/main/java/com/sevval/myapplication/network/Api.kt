package com.sevval.myapplication.network

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface Api {

    @POST("/")
    fun sendRequest(@Body request: ApiRequest): Call<ApiResponse>

}