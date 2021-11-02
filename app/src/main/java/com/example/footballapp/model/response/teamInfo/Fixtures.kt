package com.example.footballapp.model.response.teamInfo


import com.google.gson.annotations.SerializedName

data class Fixtures(
    @SerializedName("draws")
    val draws: BaseFixtures?,
    @SerializedName("loses")
    val loses: BaseFixtures?,
    @SerializedName("played")
    val played: BaseFixtures?,
    @SerializedName("wins")
    val wins: BaseFixtures?
)