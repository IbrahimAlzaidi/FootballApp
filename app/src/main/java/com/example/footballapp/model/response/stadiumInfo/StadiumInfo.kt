package com.example.footballapp.model.response.stadiumInfo


import com.google.gson.annotations.SerializedName

data class StadiumInfo(
    @SerializedName("teamInfo")
    val team: Team?,
    @SerializedName("venue")
    val stadiumDetails: StadiumDetails?
)