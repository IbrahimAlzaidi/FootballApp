package com.example.footballapp.model.response.fixtureAllData


import com.google.gson.annotations.SerializedName

data class Shots(
    @SerializedName("on")
    val on: Any?,
    @SerializedName("total")
    val total: Any?
)
