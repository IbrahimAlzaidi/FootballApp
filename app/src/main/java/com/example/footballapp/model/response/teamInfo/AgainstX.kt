package com.example.footballapp.model.response.teamInfo


import com.google.gson.annotations.SerializedName

data class AgainstX(
    @SerializedName("average")
    val average: Average?,
    @SerializedName("minute")
    val minute: Minute?,
    @SerializedName("total")
    val total: Total?
)