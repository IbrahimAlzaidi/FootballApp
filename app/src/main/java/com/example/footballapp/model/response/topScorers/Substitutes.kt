package com.example.footballapp.model.response.topScorers


import com.google.gson.annotations.SerializedName

data class Substitutes(
    @SerializedName("bench")
    val bench: Int?,
    @SerializedName("in")
    val inX: Int?,
    @SerializedName("out")
    val `out`: Int?
)