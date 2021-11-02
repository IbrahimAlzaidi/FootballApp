package com.example.footballapp.model.response.base.baseMatches


import com.google.gson.annotations.SerializedName

data class Teams(
    @SerializedName("away")
    val away: TeamStatus?,
    @SerializedName("home")
    val home: TeamStatus?
)
