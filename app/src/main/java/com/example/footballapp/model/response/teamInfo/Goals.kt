package com.example.footballapp.model.response.teamInfo


import com.example.footballapp.model.response.base.baseResponse.BaseGoals
import com.google.gson.annotations.SerializedName

data class Goals(
    @SerializedName("against")
    val against: BaseGoals<Int>?,
    @SerializedName("for")
    val teamGoals: BaseGoals<Int>?
)