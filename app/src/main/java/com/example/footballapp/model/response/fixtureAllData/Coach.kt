package com.example.footballapp.model.response.fixtureAllData


import com.google.gson.annotations.SerializedName

data class Coach(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("photo")
    val photo: String?
)
