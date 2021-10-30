package com.example.footballapp.model.response.teamInfo


import com.google.gson.annotations.SerializedName

data class Streak(
    @SerializedName("draws")
    val draws: Int?,
    @SerializedName("loses")
    val loses: Int?,
    @SerializedName("wins")
    val wins: Int?
)