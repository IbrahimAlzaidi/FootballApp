package com.example.footballapp.model.response.fixtureAllData


import com.google.gson.annotations.SerializedName

data class Duels(
    @SerializedName("total")
    val total: Int?,
    @SerializedName("won")
    val won: Int?
)
