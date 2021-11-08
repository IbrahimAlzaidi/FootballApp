package com.example.footballapp.model.response.fixtureAllData


import com.google.gson.annotations.SerializedName

data class PlayerXXXXX(
    @SerializedName("player")
    val player: PlayerXXXXXX?,
    @SerializedName("statistics")
    val statistics: List<Statistic>?
)
