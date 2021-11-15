package com.example.footballapp.util

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
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

class ViewModelFactory(private val arg: Int? , private val leagueId : Int? , private val teamId:Int?): ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when{
            modelClass.isAssignableFrom(ClubDetailsViewModel::class.java) -> ClubDetailsViewModel(teamID = teamId,leagueId = leagueId) as T
            modelClass.isAssignableFrom(HomeViewModel::class.java) -> HomeViewModel() as T
            modelClass.isAssignableFrom(LeagueDetailsViewModel::class.java) -> LeagueDetailsViewModel(leagueId = leagueId) as T
            modelClass.isAssignableFrom(MatchDetailsViewModel::class.java) -> MatchDetailsViewModel(matchId = arg) as T
            modelClass.isAssignableFrom(MatchesViewModel::class.java) -> MatchesViewModel(leagueId = leagueId) as T
            modelClass.isAssignableFrom(PlayerDetailsViewModel::class.java) -> PlayerDetailsViewModel(playerId = arg,teamId = teamId,leagueId = leagueId) as T
            modelClass.isAssignableFrom(ScorersViewModel::class.java) -> ScorersViewModel(leagueId = leagueId) as T
            modelClass.isAssignableFrom(StandingViewModel::class.java) -> StandingViewModel(leagueId = leagueId) as T
            modelClass.isAssignableFrom(LiveMatchViewModel::class.java) -> LiveMatchViewModel() as T
            modelClass.isAssignableFrom(MatchScheduledViewModel::class.java) -> MatchScheduledViewModel() as T
            modelClass.isAssignableFrom(SearchViewModel::class.java) -> SearchViewModel() as T
            modelClass.isAssignableFrom(ClubInformationViewModel::class.java) -> ClubInformationViewModel(teamId = teamId,leagueId = leagueId) as T
            modelClass.isAssignableFrom(SquadInfoViewModel::class.java) -> SquadInfoViewModel(teamId) as T
            modelClass.isAssignableFrom(ClubMatchPlayedViewModel::class.java)->ClubMatchPlayedViewModel(teamId = teamId) as T
            modelClass.isAssignableFrom(MatchStateViewModel::class.java)->MatchStateViewModel(matchId = arg) as T
            modelClass.isAssignableFrom(LineupViewModel::class.java)->LineupViewModel(matchId = arg) as T
            modelClass.isAssignableFrom(SubstitutesViewModel::class.java)->SubstitutesViewModel(matchId = arg) as T
            modelClass.isAssignableFrom(PlayedStatisticViewModel::class.java)->PlayedStatisticViewModel(playerId = arg,leagueId = leagueId) as T
            modelClass.isAssignableFrom(PlayerInformationViewModel::class.java) ->PlayerInformationViewModel(playerId = arg,leagueId = leagueId,teamId = teamId) as T
            else -> throw IllegalArgumentException("View Model Class Not Found")
        }
    }
}
