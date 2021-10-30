package com.example.footballapp.model.response.teamInfo


import com.google.gson.annotations.SerializedName

data class Goals(
    @SerializedName("against")
    val against: Against?,
    @SerializedName("for")
    val forX: For?
)