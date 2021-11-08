package com.example.footballapp.model.response.fixtureAllData


import com.google.gson.annotations.SerializedName

data class Colors(
    @SerializedName("goalkeeper")
    val goalkeeper: Goalkeeper?,
    @SerializedName("player")
    val player: PlayerXXX?
)
