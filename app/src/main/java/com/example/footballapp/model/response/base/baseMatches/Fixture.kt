package com.example.footballapp.model.response.base.baseMatches


import com.google.gson.annotations.SerializedName

data class Fixture(
    @SerializedName("date")
    val date: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("periods")
    val periods: Periods?,
    @SerializedName("referee")
    val referee: String?,
    @SerializedName("status")
    val matchStatus: MatchStatus?,
    @SerializedName("timestamp")
    val timestamp: Int?,
    @SerializedName("timezone")
    val timezone: String?,
    @SerializedName("venue")
    val stadium: StadiumInfo?
)
