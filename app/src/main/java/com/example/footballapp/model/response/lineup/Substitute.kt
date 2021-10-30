package com.example.footballapp.model.response.lineup


import com.google.gson.annotations.SerializedName

data class Substitute(
    @SerializedName("player")
    val player: PlayerX?
)