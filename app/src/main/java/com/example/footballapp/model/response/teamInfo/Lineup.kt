package com.example.footballapp.model.response.teamInfo


import com.google.gson.annotations.SerializedName

data class Lineup(
    @SerializedName("formation")
    val formation: String?,
    @SerializedName("played")
    val played: Int?
)