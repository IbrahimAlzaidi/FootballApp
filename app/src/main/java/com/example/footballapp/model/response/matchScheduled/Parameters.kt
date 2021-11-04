package com.example.footballapp.model.response.matchScheduled


import com.google.gson.annotations.SerializedName

data class Parameters(
    @SerializedName("next")
    val next: String?
)
