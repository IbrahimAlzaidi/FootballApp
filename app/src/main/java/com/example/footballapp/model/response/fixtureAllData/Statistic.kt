package com.example.footballapp.model.response.fixtureAllData


import com.google.gson.annotations.SerializedName

data class Statistic(
    @SerializedName("cards")
    val cards: Cards?,
    @SerializedName("dribbles")
    val dribbles: Dribbles?,
    @SerializedName("duels")
    val duels: Duels?,
    @SerializedName("fouls")
    val fouls: Fouls?,
    @SerializedName("games")
    val games: Games?,
    @SerializedName("goals")
    val goals: GoalsX?,
    @SerializedName("offsides")
    val offsides: Any?,
    @SerializedName("passes")
    val passes: Passes?,
    @SerializedName("penalty")
    val penalty: Penalty?,
    @SerializedName("shots")
    val shots: Shots?,
    @SerializedName("tackles")
    val tackles: Tackles?
)
