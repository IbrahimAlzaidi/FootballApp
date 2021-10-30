package com.example.footballapp.model.response.standing


import com.google.gson.annotations.SerializedName

data class GoalsX(
    @SerializedName("against")
    val against: Int?,
    @SerializedName("for")
    val forX: Int?
)