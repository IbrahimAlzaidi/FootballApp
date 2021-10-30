package com.example.footballapp.model.response.playerStatistic


import com.google.gson.annotations.SerializedName

data class Parameters(
    @SerializedName("id")
    val id: String?,
    @SerializedName("season")
    val season: String?
)