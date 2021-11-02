package com.example.footballapp.model.response.standing


import com.google.gson.annotations.SerializedName

data class StandingTeamInfo(
    @SerializedName("league")
    val league: League?
)