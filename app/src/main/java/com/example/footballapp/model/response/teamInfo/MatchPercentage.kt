package com.example.footballapp.model.response.teamInfo


import com.google.gson.annotations.SerializedName

data class MatchPercentage(
    @SerializedName("0-15")
    val firstQuarter: Percentage?,
    @SerializedName("106-120")
    val secondExtraTime: Percentage?,
    @SerializedName("16-30")
    val secondQuarter: Percentage?,
    @SerializedName("31-45")
    val thirdQuarter: Percentage?,
    @SerializedName("46-60")
    val forthQuarter: Percentage?,
    @SerializedName("61-75")
    val fifthQuarter: Percentage?,
    @SerializedName("76-90")
    val sixthQuarter: Percentage?,
    @SerializedName("91-105")
    val firstExtraTime: Percentage?
)