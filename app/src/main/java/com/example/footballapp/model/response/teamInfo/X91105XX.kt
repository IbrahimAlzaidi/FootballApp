package com.example.footballapp.model.response.teamInfo


import com.google.gson.annotations.SerializedName

data class X91105XX(
    @SerializedName("percentage")
    val percentage: String?,
    @SerializedName("total")
    val total: Int?
)