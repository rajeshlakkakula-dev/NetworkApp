package com.example.networkapp

import com.example.networkapp.data.MyDataClass
import retrofit2.Response

import retrofit2.http.GET

interface QuotesApi {

    @GET("/quotes")
    suspend fun getQuotes(): Response<MyDataClass>
}