package com.example.footballapp.model.response.standing


import com.google.gson.annotations.SerializedName

data class Parameters(
    @SerializedName("league")
    val league: String?,
    @SerializedName("season")
    val season: String?
)