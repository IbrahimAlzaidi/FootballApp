package com.example.footballapp.model.response.base.baseMatches


import com.google.gson.annotations.SerializedName

data class StadiumInfo(
    @SerializedName("city")
    val city: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?
)
