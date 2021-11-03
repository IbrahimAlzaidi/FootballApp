package com.example.footballapp.model.response.standing


import com.google.gson.annotations.SerializedName

data class Goals(
    @SerializedName("against")
    val against: Int?,
    @SerializedName("for")
    val forTeams: Int?
)