package com.example.footballapp.model.response.matchStatistic


import com.example.footballapp.model.response.base.basePlayerStatistic.Team
import com.google.gson.annotations.SerializedName

data class MatchStatisticInfo(
    @SerializedName("statistics")
    val statistics: List<Statistic>?,
    @SerializedName("teamInfo")
    val team: Team?
)