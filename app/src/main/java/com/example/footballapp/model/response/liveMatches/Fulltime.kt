package com.example.footballapp.model.response.liveMatches


import com.google.gson.annotations.SerializedName

data class Fulltime(
    @SerializedName("away")
    val away: Any?,
    @SerializedName("home")
    val home: Any?
)
