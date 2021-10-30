package com.example.footballapp.model.response.matchStatistic


import com.google.gson.annotations.SerializedName

data class Response(
    @SerializedName("statistics")
    val statistics: List<Statistic>?,
    @SerializedName("team")
    val team: Team?
)