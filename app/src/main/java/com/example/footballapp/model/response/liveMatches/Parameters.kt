package com.example.footballapp.model.response.liveMatches


import com.google.gson.annotations.SerializedName

data class Parameters(
    @SerializedName("live")
    val live: String?,
)