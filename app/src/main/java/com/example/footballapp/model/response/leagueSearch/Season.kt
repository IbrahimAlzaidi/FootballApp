package com.example.footballapp.model.response.leagueSearch


import com.google.gson.annotations.SerializedName

data class Season(
    @SerializedName("coverage")
    val coverage: Coverage?,
    @SerializedName("current")
    val current: Boolean?,
    @SerializedName("end")
    val end: String?,
    @SerializedName("start")
    val start: String?,
    @SerializedName("year")
    val year: Int?
)