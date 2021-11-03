package com.example.footballapp.model.response.base.basePlayerStatistic


import com.google.gson.annotations.SerializedName

data class Penalty(
    @SerializedName("commited")
    val committed: Any?,
    @SerializedName("missed")
    val missed: Int?,
    @SerializedName("saved")
    val saved: String?,
    @SerializedName("scored")
    val scored: Int?,
    @SerializedName("won")
    val won: String?
)