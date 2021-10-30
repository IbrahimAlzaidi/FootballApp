package com.example.footballapp.model.response.teamInfo


import com.google.gson.annotations.SerializedName

data class Penalty(
    @SerializedName("missed")
    val missed: Missed?,
    @SerializedName("scored")
    val scored: Scored?,
    @SerializedName("total")
    val total: Int?
)