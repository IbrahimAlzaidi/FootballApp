package com.example.footballapp.model.response.topScorers


import com.google.gson.annotations.SerializedName

data class Tackles(
    @SerializedName("blocks")
    val blocks: Any?,
    @SerializedName("interceptions")
    val interceptions: Int?,
    @SerializedName("total")
    val total: Int?
)