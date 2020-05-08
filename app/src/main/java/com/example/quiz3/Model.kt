package com.example.quiz3


import com.google.gson.annotations.SerializedName

data class Model(
    @SerializedName("countryCode")
    val countryCode: String?,
    @SerializedName("ensignUrl")
    val ensignUrl: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("competitions")
    val competitions: List<String>?,
    @SerializedName("area")
    val area: List<String>?
)