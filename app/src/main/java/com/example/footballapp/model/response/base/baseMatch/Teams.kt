package com.example.footballapp.model.response.base.baseMatch


import com.google.gson.annotations.SerializedName

data class Teams(
    @SerializedName("away")
    val away: TeamInfo?,
    @SerializedName("home")
    val home: TeamInfo?
)
