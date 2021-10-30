package com.example.footballapp.model.response.matches


import com.google.gson.annotations.SerializedName

data class Parameters(
    @SerializedName("league")
    val league: String?,
    @SerializedName("season")
    val season: String?,
    @SerializedName("status")
    val status: String?
)