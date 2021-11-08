package com.example.footballapp.model.response.fixtureAllData


import com.google.gson.annotations.SerializedName

data class Passes(
    @SerializedName("accuracy")
    val accuracy: String?,
    @SerializedName("key")
    val key: Any?,
    @SerializedName("total")
    val total: Int?
)
