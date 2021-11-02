package com.example.footballapp.model.response.base.basePlayerStatistic


import com.google.gson.annotations.SerializedName

data class PlayerStatistic(
    @SerializedName("player")
    val playerInfo: PlayerInfo?,
    @SerializedName("statistics")
    val statistics: List<Statistic>?
)