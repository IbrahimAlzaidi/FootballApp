package com.example.footballapp.model.response.teamInfo


import com.google.gson.annotations.SerializedName

data class Penalty(
    @SerializedName("missed")
    val missed: Percentage?,
    @SerializedName("scored")
    val scored: Percentage?,
    @SerializedName("total")
    val total: Int?
)