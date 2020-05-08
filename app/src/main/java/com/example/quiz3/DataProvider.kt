package com.example.quiz3

import retrofit2.Call
import retrofit2.http.GET

interface DataProvider {
    @GET("/competitions")
    fun getModel() : Call<List<Model>>
}