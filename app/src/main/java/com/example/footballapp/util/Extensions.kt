package com.example.footballapp.util

import com.example.footballapp.model.response.matchStatistic.MatchResultData
import com.example.footballapp.model.response.matchStatistic.MatchStatisticInfo


fun List<MatchStatisticInfo>.toMatchStatistic(): List<MatchResultData>{
    val result = mutableListOf<MatchResultData>()
    for (i in 0 until (this[0].statistics?.size ?: 0)){
        result.add(
            MatchResultData(
                this[0].statistics?.get(i)?.type,
                this[0].statistics?.get(i)?.value,
                this[1].statistics?.get(i)?.value)
        )
    }
    return result
}

fun List<MatchStatisticInfo>.toMatchStatistic2(): List<MatchResultData>{
    val result = mutableListOf<MatchResultData>()
    for (i in 0 until (this[0].statistics?.size ?: 0)){
        result.add(
            MatchResultData(
                this[0].statistics?.get(i)?.type,
                this[0].statistics?.get(i)?.value,
                this[1].statistics?.get(i)?.value)
        )
    }
    return result
}
