package com.example.footballapp.model.response.standings


import com.google.gson.annotations.SerializedName

data class Season(
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
