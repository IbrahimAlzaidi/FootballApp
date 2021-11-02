package com.example.footballapp.model.response.playerTrophies


import com.google.gson.annotations.SerializedName

data class PlayerTrophiesInfo(
    @SerializedName("country")
    val country: String?,
    @SerializedName("leagueInfo")
    val league: String?,
    @SerializedName("place")
    val place: String?,
    @SerializedName("season")
    val season: String?
)