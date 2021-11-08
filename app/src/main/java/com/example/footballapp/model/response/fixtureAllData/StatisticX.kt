package com.example.footballapp.model.response.fixtureAllData


import com.google.gson.annotations.SerializedName

data class StatisticX(
    @SerializedName("statistics")
    val statistics: List<StatisticXX>?,
    @SerializedName("team")
    val team: TeamXXX?
)
