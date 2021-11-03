package com.example.footballapp.model.response.topScorers


import com.example.footballapp.model.response.base.basePlayerStatistic.Player
import com.example.footballapp.model.response.base.basePlayerStatistic.Statistic
import com.google.gson.annotations.SerializedName

data class TopScorersInfo(
    @SerializedName("player")
    val player: Player?,
    @SerializedName("statistics")
    val statistics: List<Statistic>?
)