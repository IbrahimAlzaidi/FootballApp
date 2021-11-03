package com.example.footballapp.model.response.lineup


import com.google.gson.annotations.SerializedName

data class LineupInfo(
    @SerializedName("coach")
    val coach: Coach?,
    @SerializedName("formation")
    val formation: String?,
    @SerializedName("startXI")
    val playerStartMatch: List<PlayerStartMatch>?,
    @SerializedName("substitutes")
    val substitutes: List<Substitute>?,
    @SerializedName("team")
    val team: Team?
)