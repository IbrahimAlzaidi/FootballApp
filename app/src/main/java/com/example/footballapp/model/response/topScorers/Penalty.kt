package com.example.footballapp.model.response.topScorers


import com.google.gson.annotations.SerializedName

data class Penalty(
    @SerializedName("commited")
    val commited: Any?,
    @SerializedName("missed")
    val missed: Int?,
    @SerializedName("saved")
    val saved: Any?,
    @SerializedName("scored")
    val scored: Int?,
    @SerializedName("won")
    val won: Any?
)