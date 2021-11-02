package com.example.footballapp.model.response.teamInfo


import com.google.gson.annotations.SerializedName

data class Cards(
    @SerializedName("red")
    val red: BasePercentage?,
    @SerializedName("yellow")
    val yellow: BasePercentage?
)