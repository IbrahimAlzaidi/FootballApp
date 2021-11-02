package com.example.footballapp.model.response.base.basePlayerStatistic


import com.google.gson.annotations.SerializedName

data class Cards(
    @SerializedName("red")
    val red: Int?,
    @SerializedName("yellow")
    val yellow: Int?,
    @SerializedName("yellowred")
    val yellowRed: Int?
)