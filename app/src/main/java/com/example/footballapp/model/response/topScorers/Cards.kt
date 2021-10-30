package com.example.footballapp.model.response.topScorers


import com.google.gson.annotations.SerializedName

data class Cards(
    @SerializedName("red")
    val red: Int?,
    @SerializedName("yellow")
    val yellow: Int?,
    @SerializedName("yellowred")
    val yellowred: Int?
)