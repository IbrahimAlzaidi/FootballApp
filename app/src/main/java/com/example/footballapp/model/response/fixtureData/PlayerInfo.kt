package com.example.footballapp.model.response.fixtureData


import com.example.footballapp.model.response.base.basePlayerStatistic.Statistic
import com.google.gson.annotations.SerializedName

data class PlayerInfo(
    @SerializedName("player")
    val player: PlayerId?,
    @SerializedName("statistics")
    val statistics: List<Statistic>?
)
