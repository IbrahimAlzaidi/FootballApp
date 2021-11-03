package com.example.footballapp.model.response.base.baseMatch


import com.google.gson.annotations.SerializedName

data class MatchGoals<T>(
    @SerializedName("away")
    val away: T?,
    @SerializedName("home")
    val home: T?
)
