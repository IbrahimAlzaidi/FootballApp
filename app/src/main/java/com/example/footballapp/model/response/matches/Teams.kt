package com.example.footballapp.model.response.matches


import com.google.gson.annotations.SerializedName

data class Teams(
    @SerializedName("away")
    val away: Away?,
    @SerializedName("home")
    val home: Home?
)