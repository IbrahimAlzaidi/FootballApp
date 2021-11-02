package com.example.footballapp.model.response.base.basePlayerStatistic


import com.google.gson.annotations.SerializedName

data class Shots(
    @SerializedName("on")
    val onTarget: Int?,
    @SerializedName("total")
    val total: Int?
)