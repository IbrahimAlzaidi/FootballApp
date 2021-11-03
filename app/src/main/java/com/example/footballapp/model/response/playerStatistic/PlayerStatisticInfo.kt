package com.example.footballapp.model.response.playerStatistic


import com.example.footballapp.model.response.base.basePlayerStatistic.Player
import com.example.footballapp.model.response.base.basePlayerStatistic.Statistic
import com.google.gson.annotations.SerializedName

data class PlayerStatisticInfo(
    @SerializedName("player")
    val player: Player?,
    @SerializedName("statistics")
    val statistics: List<Statistic>?
)