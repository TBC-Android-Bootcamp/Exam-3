package com.example.quiz3

import android.app.Application
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class App : Application() {
    lateinit var globalDataProvider: DataProvider

    override fun onCreate() {
        super.onCreate()
        val retrofit = setUpRetrofit()
        globalDataProvider = retrofit.create(DataProvider::class.java)
    }

    private fun setUpRetrofit() : Retrofit {
        val okHttpClient = setUpHttpClient()
        return Retrofit.Builder()
            .baseUrl(getString(R.string.base_url))
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private fun setUpHttpClient() : OkHttpClient {
        return OkHttpClient.Builder()
            .build()
    }
}