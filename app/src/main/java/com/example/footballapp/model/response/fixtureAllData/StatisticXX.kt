package com.example.footballapp.model.response.fixtureAllData


import com.google.gson.annotations.SerializedName

data class StatisticXX(
    @SerializedName("type")
    val type: String?,
    @SerializedName("value")
    val value: String?
)
