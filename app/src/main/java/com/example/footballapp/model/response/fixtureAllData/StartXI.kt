package com.example.footballapp.model.response.fixtureAllData


import com.google.gson.annotations.SerializedName

data class StartXI(
    @SerializedName("player")
    val player: PlayerX?
)
