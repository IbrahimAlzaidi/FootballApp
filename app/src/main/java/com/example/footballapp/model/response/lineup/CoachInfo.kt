package com.example.footballapp.model.response.lineup


import com.google.gson.annotations.SerializedName

data class CoachInfo(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("photo")
    val photo: String?
)