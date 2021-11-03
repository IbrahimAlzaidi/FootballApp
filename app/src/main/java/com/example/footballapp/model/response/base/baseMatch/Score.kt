package com.example.footballapp.model.response.base.baseMatch


import com.google.gson.annotations.SerializedName

data class Score(
    @SerializedName("extratime")
    val extraTime: MatchGoals<String>?,
    @SerializedName("fulltime")
    val fullTime: MatchGoals<String>?,
    @SerializedName("halftime")
    val halfTime: MatchGoals<Int>?,
    @SerializedName("penalty")
    val penalty: MatchGoals<String>?
)
