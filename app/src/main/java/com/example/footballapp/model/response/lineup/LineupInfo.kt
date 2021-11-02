package com.example.footballapp.model.response.lineup


import com.google.gson.annotations.SerializedName

data class LineupInfo(
    @SerializedName("coachInfo")
    val coachInfoInfo: CoachInfo?,
    @SerializedName("formation")
    val formation: String?,
    @SerializedName("mainInformation")
    val mainInformation: List<Information>?,
    @SerializedName("substitutes")
    val substitutes: List<Information>?,
    @SerializedName("teamInfo")
    val teamInfo: Team?
)