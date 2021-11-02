package com.example.footballapp.model.response.base.baseMatches


import com.google.gson.annotations.SerializedName

data class FullTimeStatus(
    @SerializedName("away")
    val away: String?,
    @SerializedName("home")
    val home: String?
)
