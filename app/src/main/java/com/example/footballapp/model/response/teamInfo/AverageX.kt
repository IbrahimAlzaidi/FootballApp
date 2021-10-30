package com.example.footballapp.model.response.teamInfo


import com.google.gson.annotations.SerializedName

data class AverageX(
    @SerializedName("away")
    val away: String?,
    @SerializedName("home")
    val home: String?,
    @SerializedName("total")
    val total: String?
)