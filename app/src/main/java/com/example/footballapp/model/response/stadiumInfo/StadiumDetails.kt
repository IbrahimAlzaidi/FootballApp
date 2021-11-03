package com.example.footballapp.model.response.stadiumInfo


import com.google.gson.annotations.SerializedName

data class StadiumDetails(
    @SerializedName("team")
    val team: Team?,
    @SerializedName("venue")
    val venue: Venue?
)