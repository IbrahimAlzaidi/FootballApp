package com.example.footballapp.model.response.teamInfo


import com.google.gson.annotations.SerializedName

data class Fixtures(
    @SerializedName("draws")
    val draws: ScoresInfo?,
    @SerializedName("loses")
    val loses: ScoresInfo?,
    @SerializedName("played")
    val played: ScoresInfo?,
    @SerializedName("wins")
    val wins: ScoresInfo?
)