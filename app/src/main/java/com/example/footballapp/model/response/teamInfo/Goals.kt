package com.example.footballapp.model.response.teamInfo


import com.example.footballapp.model.response.base.baseMatch.MatchGoals
import com.google.gson.annotations.SerializedName

data class Goals(
    @SerializedName("against")
    val against: MatchGoals<Int>?,
    @SerializedName("for")
    val forX: MatchGoals<Int>?
)