package com.example.footballapp.model.response.schedulerMatch


import com.example.footballapp.model.response.base.baseMatch.*
import com.google.gson.annotations.SerializedName

data class SchedulerMatchInfo(
    @SerializedName("fixture")
    val fixture: Fixture?,
    @SerializedName("goals")
    val goals: MatchGoals<Int>?,
    @SerializedName("league")
    val league: League?,
    @SerializedName("score")
    val score: Score?,
    @SerializedName("teams")
    val teams: Teams?
)