package com.example.footballapp.model.response.leagueSearch


import com.google.gson.annotations.SerializedName

data class Parameters(
    @SerializedName("name")
    val name: String?
)