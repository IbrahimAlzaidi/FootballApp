package com.example.footballapp.model.response.topScorers


import com.google.gson.annotations.SerializedName

data class Fouls(
    @SerializedName("committed")
    val committed: Int?,
    @SerializedName("drawn")
    val drawn: Int?
)