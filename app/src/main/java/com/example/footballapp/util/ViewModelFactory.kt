package com.example.footballapp.util

import android.os.Bundle
import androidx.lifecycle.AbstractSavedStateViewModelFactory
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.savedstate.SavedStateRegistryOwner
import com.example.footballapp.ui.clubDetails.ClubDetailsViewModel
import com.example.footballapp.ui.clubDetails.clubInfo.ClubInformationViewModel
import com.example.footballapp.ui.clubDetails.clubMatch.ClubMatchPlayedViewModel
import com.example.footballapp.ui.clubDetails.squadInfo.SquadInfoViewModel
import com.example.footballapp.ui.home.HomeViewModel
import com.example.footballapp.ui.home.liveMatch.LiveMatchViewModel
import com.example.footballapp.ui.home.matchScheduled.MatchScheduledViewModel
import com.example.footballapp.ui.leagueDetails.LeagueDetailsViewModel
import com.example.footballapp.ui.leagueDetails.matches.MatchesViewModel
import com.example.footballapp.ui.leagueDetails.scorers.ScorersViewModel
import com.example.footballapp.ui.leagueDetails.standing.StandingViewModel
import com.example.footballapp.ui.matchDetails.MatchDetailsViewModel
import com.example.footballapp.ui.matchDetails.lineup.LineupViewModel
import com.example.footballapp.ui.matchDetails.matchState.MatchStateViewModel
import com.example.footballapp.ui.matchDetails.substitutes.SubstitutesViewModel
import com.example.footballapp.ui.playerDetails.PlayerDetailsViewModel
import com.example.footballapp.ui.playerDetails.matchPlayedStatistic.PlayedStatisticViewModel
import com.example.footballapp.ui.playerDetails.playedInfo.PlayerInformationViewModel
import com.example.footballapp.ui.search.SearchViewModel

@Suppress("UNCHECKED_CAST")
class ViewModelFactory constructor(
    private val arg: Int? , private val leagueId : Int? , private val teamId:Int?,
    owner: SavedStateRegistryOwner,
    defaultArgs: Bundle? = null
) : AbstractSavedStateViewModelFactory(owner,defaultArgs) {
    override fun <T : ViewModel?> create(
        key: String,
        modelClass: Class<T>,
        handle: SavedStateHandle
    ) = with(modelClass){
        when{
            isAssignableFrom(ClubDetailsViewModel::class.java) -> ClubDetailsViewModel(arg,leagueId,handle)
            isAssignableFrom(HomeViewModel::class.java) -> HomeViewModel(handle)
            isAssignableFrom(LeagueDetailsViewModel::class.java) -> LeagueDetailsViewModel(arg,handle)
            isAssignableFrom(MatchDetailsViewModel::class.java) -> MatchDetailsViewModel(arg,handle)
            isAssignableFrom(MatchesViewModel::class.java) -> MatchesViewModel(arg,handle)
            isAssignableFrom(PlayerDetailsViewModel::class.java) -> PlayerDetailsViewModel(arg,teamId,leagueId,handle)
            isAssignableFrom(ScorersViewModel::class.java) -> ScorersViewModel(arg,handle)
            isAssignableFrom(StandingViewModel::class.java) -> StandingViewModel(leagueId = leagueId,handle)
            isAssignableFrom(LiveMatchViewModel::class.java) -> LiveMatchViewModel(handle)
            isAssignableFrom(MatchScheduledViewModel::class.java) -> MatchScheduledViewModel(handle)
            isAssignableFrom(SearchViewModel::class.java) -> SearchViewModel(handle)
            isAssignableFrom(ClubInformationViewModel::class.java) -> ClubInformationViewModel(arg,leagueId,handle)
            isAssignableFrom(SquadInfoViewModel::class.java) -> SquadInfoViewModel(arg,leagueId,handle)
            isAssignableFrom(ClubMatchPlayedViewModel::class.java) -> ClubMatchPlayedViewModel(arg,handle)
            isAssignableFrom(MatchStateViewModel::class.java) -> MatchStateViewModel(arg,handle)
            isAssignableFrom(LineupViewModel::class.java) -> LineupViewModel(arg,handle)
            isAssignableFrom(SubstitutesViewModel::class.java) -> SubstitutesViewModel(arg,handle)
            isAssignableFrom(PlayedStatisticViewModel::class.java) -> PlayedStatisticViewModel(arg,leagueId,handle)
            isAssignableFrom(PlayerInformationViewModel::class.java) -> PlayerInformationViewModel(arg,leagueId,teamId,handle)
            else -> throw IllegalArgumentException("Unknown ViewModel class: ${modelClass.name}")
        }

    }as T
}
