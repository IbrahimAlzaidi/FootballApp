package com.example.footballapp.model.response.fixtureAllData


import com.google.gson.annotations.SerializedName

data class Penalty(
    @SerializedName("commited")
    val commited: Any?,
    @SerializedName("missed")
    val missed: Int?,
    @SerializedName("saved")
    val saved: Int?,
    @SerializedName("scored")
    val scored: Int?,
    @SerializedName("won")
    val won: Any?
)
