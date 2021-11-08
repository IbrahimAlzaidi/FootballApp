package com.example.footballapp.model.response.lineup

data class DataPlayer(
    val playerHomeTeam: String?,
    val playerAwayTeam: String?,
    val numberHomeTeam: Int?,
    val numberAwayTeam: Int?,
    val positionHomeTeam: String?,
    val positionAwayTeam: String?,
    val coachHomeTeam: String?,
    val coachAwayTeam: String?,
)
