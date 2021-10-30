package com.example.footballapp.model.response.stadiumInfo


import com.google.gson.annotations.SerializedName

data class Response(
    @SerializedName("team")
    val team: Team?,
    @SerializedName("venue")
    val venue: Venue?
)