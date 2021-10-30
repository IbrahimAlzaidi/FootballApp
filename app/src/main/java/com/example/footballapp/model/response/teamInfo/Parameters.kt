package com.example.footballapp.model.response.teamInfo


import com.google.gson.annotations.SerializedName

data class Parameters(
    @SerializedName("league")
    val league: String?,
    @SerializedName("season")
    val season: String?,
    @SerializedName("team")
    val team: String?
)