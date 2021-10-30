package com.example.footballapp.model.response.playerStatistic


import com.google.gson.annotations.SerializedName

data class Shots(
    @SerializedName("on")
    val on: Int?,
    @SerializedName("total")
    val total: Int?
)