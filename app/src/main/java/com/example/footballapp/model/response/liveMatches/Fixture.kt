package com.example.footballapp.model.response.liveMatches


import com.google.gson.annotations.SerializedName

data class Fixture(
    @SerializedName("date")
    val date: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("periods")
    val periods: Periods?,
    @SerializedName("referee")
    val referee: Any?,
    @SerializedName("status")
    val status: Status?,
    @SerializedName("timestamp")
    val timestamp: Int?,
    @SerializedName("timezone")
    val timezone: String?,
    @SerializedName("venue")
    val venue: Venue?
)
