package com.example.footballapp.model.response.teamInfo


import com.example.footballapp.model.response.base.baseResponse.BaseGoals
import com.google.gson.annotations.SerializedName

data class Biggest(
    @SerializedName("goals")
    val goals: Goals?,
    @SerializedName("loses")
    val loses: BaseGoals<String>?,
    @SerializedName("streak")
    val streak: Streak?,
    @SerializedName("wins")
    val wins: BaseGoals<String>?
)