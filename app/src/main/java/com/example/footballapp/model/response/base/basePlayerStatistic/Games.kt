package com.example.footballapp.model.response.base.basePlayerStatistic


import com.google.gson.annotations.SerializedName

data class Games(
    @SerializedName("appearences")
    val appearances: Int?,
    @SerializedName("captain")
    val captain: Boolean?,
    @SerializedName("lineups")
    val lineups: Int?,
    @SerializedName("minutes")
    val minutes: Int?,
    @SerializedName("number")
    val number: String?,
    @SerializedName("position")
    val position: String?,
    @SerializedName("rating")
    val rating: String?
)