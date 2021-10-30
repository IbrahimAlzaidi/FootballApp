package com.example.footballapp.model.response.topScorers


import com.google.gson.annotations.SerializedName

data class Dribbles(
    @SerializedName("attempts")
    val attempts: Int?,
    @SerializedName("past")
    val past: Any?,
    @SerializedName("success")
    val success: Int?
)