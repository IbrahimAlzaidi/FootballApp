package com.example.footballapp.model.response.fixtureAllData


import com.google.gson.annotations.SerializedName

data class Substitute(
    @SerializedName("player")
    val player: PlayerXX?
)
