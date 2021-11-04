package com.example.footballapp.model.response.latestMatchScheduled


import com.google.gson.annotations.SerializedName

data class Parameters(
    @SerializedName("next")
    val next: String?
)
