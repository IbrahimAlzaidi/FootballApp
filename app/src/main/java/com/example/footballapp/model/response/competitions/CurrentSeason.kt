package com.example.footballapp.model.response.competitions


import com.google.gson.annotations.SerializedName

data class CurrentSeason(
    @SerializedName("currentMatchDay")
    val currentMatchDay: Int?,
    @SerializedName("endDate")
    val endDate: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("startDate")
    val startDate: String?,
    @SerializedName("winner")
    val winner: String?
)
