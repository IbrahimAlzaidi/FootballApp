package com.example.footballapp.model.response.base.basePlayerStatistic


import com.google.gson.annotations.SerializedName

data class Dribbles(
    @SerializedName("attempts")
    val attempts: Int?,
    @SerializedName("past")
    val past: String?,
    @SerializedName("success")
    val success: Int?
)