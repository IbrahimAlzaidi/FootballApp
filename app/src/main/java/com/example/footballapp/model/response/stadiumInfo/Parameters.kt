package com.example.footballapp.model.response.stadiumInfo


import com.google.gson.annotations.SerializedName

data class Parameters(
    @SerializedName("id")
    val id: String?,
    @SerializedName("league")
    val league: String?,
    @SerializedName("season")
    val season: String?
)