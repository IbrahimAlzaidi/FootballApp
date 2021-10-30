package com.example.footballapp.model.response.lineup


import com.google.gson.annotations.SerializedName

data class StartXI(
    @SerializedName("player")
    val player: Player?
)