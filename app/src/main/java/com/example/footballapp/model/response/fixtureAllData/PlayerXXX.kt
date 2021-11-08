package com.example.footballapp.model.response.fixtureAllData


import com.google.gson.annotations.SerializedName

data class PlayerXXX(
    @SerializedName("border")
    val border: String?,
    @SerializedName("number")
    val number: String?,
    @SerializedName("primary")
    val primary: String?
)
