package com.example.footballapp.model.response.teamInfo


import com.example.footballapp.model.response.base.baseMatch.MatchGoals
import com.google.gson.annotations.SerializedName

data class Biggest(
    @SerializedName("goals")
    val goals: Goals?,
    @SerializedName("loses")
    val loses: MatchGoals<String>?,
    @SerializedName("streak")
    val streak: Streak?,
    @SerializedName("wins")
    val wins: MatchGoals<String>?
)