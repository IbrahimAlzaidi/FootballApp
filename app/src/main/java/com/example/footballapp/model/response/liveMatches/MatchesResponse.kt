package com.example.footballapp.model.response.liveMatches


import com.google.gson.annotations.SerializedName

data class MatchesResponse(
    @SerializedName("events")
    val events: List<Event>?,
    @SerializedName("fixture")
    val fixture: Fixture?,
    @SerializedName("goals")
    val goals: Goals?,
    @SerializedName("league")
    val league: League?,
    @SerializedName("score")
    val score: Score?,
    @SerializedName("teams")
    val teams: Teams?
)
