package com.example.footballapp.model.response.teamInfo


import com.google.gson.annotations.SerializedName

data class Average(
    @SerializedName("away")
    val away: String?,
    @SerializedName("home")
    val home: String?,
    @SerializedName("total")
    val total: String?
)