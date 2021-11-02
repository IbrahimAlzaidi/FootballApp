package com.example.footballapp.model.response.matchStatistic


import com.google.gson.annotations.SerializedName

data class Statistic(
    @SerializedName("type")
    val type: String?,
    @SerializedName("value")
    val value: String?
)