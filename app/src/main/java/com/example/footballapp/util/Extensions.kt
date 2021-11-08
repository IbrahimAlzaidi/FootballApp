package com.example.footballapp.util

import com.example.footballapp.model.response.lineup.DataPlayer
import com.example.footballapp.model.response.lineup.LineupInfo
import com.example.footballapp.model.response.matchStatistic.MatchResultData
import com.example.footballapp.model.response.matchStatistic.MatchStatisticInfo


fun List<MatchStatisticInfo>.toMatchStatistic(): List<MatchResultData> {
    val result = mutableListOf<MatchResultData>()
    for (i in 0 until (this[0].statistics?.size ?: 0)) {
        result.add(
            MatchResultData(
                this[0].statistics?.get(i)?.type,
                this[0].statistics?.get(i)?.value,
                this[1].statistics?.get(i)?.value
            )
        )
    }
    return result
}

fun List<LineupInfo>.toPlayerStart(): List<DataPlayer> {
    val result = mutableListOf<DataPlayer>()
    for (i in 0 until (this[0].playerStartMatch?.size ?:0)) {
        result.add(
            DataPlayer(
                this[0].playerStartMatch?.get(i)?.player?.name,
                this[1].playerStartMatch?.get(i)?.player?.name,
                this[0].playerStartMatch?.get(i)?.player?.number,
                this[1].playerStartMatch?.get(i)?.player?.number,
                this[0].playerStartMatch?.get(i)?.player?.position,
                this[1].playerStartMatch?.get(i)?.player?.position,
                this[0].coach?.name,
                this[1].coach?.name,
            )
        )
    }
    return result
}
