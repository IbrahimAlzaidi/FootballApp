package com.example.footballapp.model.response.teamInfo

import com.google.gson.annotations.SerializedName

data class BasePercentage(
    @SerializedName("0-15")
    val firstFifteenMinutesPercentage: Percentage?,
    @SerializedName("106-120")
    val secondExtraTimePercentage: Percentage?,
    @SerializedName("16-30")
    val secondFifteenMinutesPercentage: Percentage?,
    @SerializedName("31-45")
    val thirdFifteenMinutesPercentage: Percentage?,
    @SerializedName("46-60")
    val forthFifteenMinutesPercentage: Percentage?,
    @SerializedName("61-75")
    val fifthFifteenMinutesPercentage: Percentage?,
    @SerializedName("76-90")
    val sixthFifteenMinutesPercentage: Percentage?,
    @SerializedName("91-105")
    val firstExtraTimePercentage: Percentage?
)
