package com.example.footballapp.model.response.playerTrophies


import com.google.gson.annotations.SerializedName

data class Response(
    @SerializedName("country")
    val country: String?,
    @SerializedName("league")
    val league: String?,
    @SerializedName("place")
    val place: String?,
    @SerializedName("season")
    val season: String?
)