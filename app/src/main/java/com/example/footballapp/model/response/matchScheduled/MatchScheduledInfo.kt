package com.example.footballapp.model.response.matchScheduled


import com.example.footballapp.model.response.base.baseMatch.*
import com.google.gson.annotations.SerializedName

data class MatchScheduledInfo(
    @SerializedName("fixture")
    val fixture: Fixture?,
    @SerializedName("goals")
    val goals: MatchGoals<String>?,
    @SerializedName("league")
    val league: League?,
    @SerializedName("score")
    val score: Score?,
    @SerializedName("teams")
    val teams: Teams?
)
