package com.example.footballapp.model.response.matches


import com.google.gson.annotations.SerializedName

data class Status(
    @SerializedName("elapsed")
    val elapsed: Int?,
    @SerializedName("long")
    val long: String?,
    @SerializedName("short")
    val short: String?
)