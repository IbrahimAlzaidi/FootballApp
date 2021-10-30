package com.example.footballapp.model.response.teamInfo


import com.google.gson.annotations.SerializedName

data class Fixtures(
    @SerializedName("draws")
    val draws: Draws?,
    @SerializedName("loses")
    val loses: LosesX?,
    @SerializedName("played")
    val played: Played?,
    @SerializedName("wins")
    val wins: WinsX?
)