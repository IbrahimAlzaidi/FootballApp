package com.example.footballapp.model.response.fixtureAllData


import com.google.gson.annotations.SerializedName

data class PenaltyX(
    @SerializedName("away")
    val away: Any?,
    @SerializedName("home")
    val home: Any?
)
