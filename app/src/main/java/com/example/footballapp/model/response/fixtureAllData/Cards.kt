package com.example.footballapp.model.response.fixtureAllData


import com.google.gson.annotations.SerializedName

data class Cards(
    @SerializedName("red")
    val red: Int?,
    @SerializedName("yellow")
    val yellow: Int?
)
