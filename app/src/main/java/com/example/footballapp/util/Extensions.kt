package com.example.footballapp.util

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.fragment.findNavController
import com.example.footballapp.model.domain.NavigationController
import com.example.footballapp.model.response.lineup.DataPlayer
import com.example.footballapp.model.response.lineup.LineupInfo
import com.example.footballapp.model.response.lineup.SubstitutesPlayer
import com.example.footballapp.model.response.matchStatistic.MatchResultData
import com.example.footballapp.model.response.matchStatistic.MatchStatisticInfo
import com.yarolegovich.discretescrollview.DSVOrientation
import com.yarolegovich.discretescrollview.DiscreteScrollView
import com.yarolegovich.discretescrollview.transform.Pivot
import com.yarolegovich.discretescrollview.transform.ScaleTransformer

fun List<MatchStatisticInfo?>.toMatchStatistic(): List<MatchResultData?> {
    val result = mutableListOf<MatchResultData?>()
    for (i in 0 until (this[0]?.statistics?.size ?: 0)) {
        result.add(
            MatchResultData(
                this[0]?.statistics?.get(i)?.type,
                this[0]?.statistics?.get(i)?.value,
                this[1]?.statistics?.get(i)?.value
            )
        )
    }
    return result
}

fun List<LineupInfo?>.toPlayerStart(): List<DataPlayer?> {
    val result = mutableListOf<DataPlayer?>()
    for (i in 0 until (this[0]?.playerStartMatch?.size ?: 0)) {
        result.add(
            DataPlayer(
                this[0]?.playerStartMatch?.get(i)?.player?.name,
                this[1]?.playerStartMatch?.get(i)?.player?.name,
                this[0]?.playerStartMatch?.get(i)?.player?.number,
                this[1]?.playerStartMatch?.get(i)?.player?.number,
                this[0]?.playerStartMatch?.get(i)?.player?.position,
                this[1]?.playerStartMatch?.get(i)?.player?.position,
                this[0]?.coach?.name,
                this[1]?.coach?.name,
            )
        )
    }
    return result
}

fun List<LineupInfo?>.toSubstitutes(): List<SubstitutesPlayer?> {
    val result = mutableListOf<SubstitutesPlayer?>()
    for (i in 0 until (this[0]?.substitutes?.size ?: 0)) {
        result.add(
            SubstitutesPlayer(
                this[0]?.substitutes?.get(i)?.player?.name,
                this[1]?.substitutes?.get(i)?.player?.name,
                this[0]?.substitutes?.get(i)?.player?.number,
                this[1]?.substitutes?.get(i)?.player?.number,
                this[0]?.substitutes?.get(i)?.player?.position,
                this[1]?.substitutes?.get(i)?.player?.position,
            )
        )
    }
    return result
}

fun DiscreteScrollView.setCustomRecyclerViewProperties() {
    this.apply {
        setOrientation(DSVOrientation.HORIZONTAL)
        setOffscreenItems(2)
        setOverScrollEnabled(true)
        setItemTransitionTimeMillis(20)
        setItemTransformer(
            ScaleTransformer.Builder()
                .setMaxScale(1.1f)
                .setMinScale(0.8f)
                .setPivotX(Pivot.X.CENTER)
                .setPivotY(Pivot.Y.BOTTOM)
                .build()
        )
        setSlideOnFling(true)
    }
}

fun LiveData<Event<NavigationController>>.observeEvent(owner: LifecycleOwner, navController: NavController){
    this.observe(owner, { event ->
        event?.getContentIfNotHandle()?.let { command ->
            navController.navigate(command.directions)
        }
    })
}
