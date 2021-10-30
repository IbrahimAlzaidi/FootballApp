package com.example.footballapp.model.response.teamInfo


import com.google.gson.annotations.SerializedName

data class GoalsX(
    @SerializedName("against")
    val against: AgainstX?,
    @SerializedName("for")
    val forX: ForX?
)