package com.example.footballapp.model.response.teamInfo


import com.google.gson.annotations.SerializedName

data class Biggest(
    @SerializedName("goals")
    val goals: Goals?,
    @SerializedName("loses")
    val loses: Loses?,
    @SerializedName("streak")
    val streak: Streak?,
    @SerializedName("wins")
    val wins: Wins?
)