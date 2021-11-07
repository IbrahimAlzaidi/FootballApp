package com.example.footballapp.model.response.squadPlayer


import com.google.gson.annotations.SerializedName

data class Parameters(
    @SerializedName("team")
    val team: String?
)
