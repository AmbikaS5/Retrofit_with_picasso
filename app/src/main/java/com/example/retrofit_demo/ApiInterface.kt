package com.example.retrofit_demo

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiInterface {
    @GET("photos")

    fun getData(): Call<List<MyDataItem>>
}