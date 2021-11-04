package com.example.footballapp.util

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.footballapp.ui.clubDetails.ClubDetailsViewModel
import com.example.footballapp.ui.home.HomeViewModel
import com.example.footballapp.ui.home.allMatchScheduled.AllMatchScheduledViewModel
import com.example.footballapp.ui.home.liveMatch.LiveMatchViewModel
import com.example.footballapp.ui.leagueDetails.LeagueDetailsViewModel
import com.example.footballapp.ui.matchDetails.MatchDetailsViewModel
import com.example.footballapp.ui.leagueDetails.matches.MatchesViewModel
import com.example.footballapp.ui.playerDetails.PlayerDetailsViewModel
import com.example.footballapp.ui.leagueDetails.scorers.ScorersViewModel
import com.example.footballapp.ui.leagueDetails.standing.StandingViewModel
import java.lang.IllegalArgumentException

class ViewModelFactory(private val arg: Int?): ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when{
            modelClass.isAssignableFrom(ClubDetailsViewModel::class.java) -> ClubDetailsViewModel(arg) as T
            modelClass.isAssignableFrom(HomeViewModel::class.java) -> HomeViewModel() as T
            modelClass.isAssignableFrom(LeagueDetailsViewModel::class.java) -> LeagueDetailsViewModel(arg) as T
            modelClass.isAssignableFrom(MatchDetailsViewModel::class.java) -> MatchDetailsViewModel(arg) as T
            modelClass.isAssignableFrom(MatchesViewModel::class.java) -> MatchesViewModel(arg) as T
            modelClass.isAssignableFrom(PlayerDetailsViewModel::class.java) -> PlayerDetailsViewModel(arg) as T
            modelClass.isAssignableFrom(ScorersViewModel::class.java) -> ScorersViewModel(arg) as T
            modelClass.isAssignableFrom(StandingViewModel::class.java) -> StandingViewModel(arg) as T
            modelClass.isAssignableFrom(LiveMatchViewModel::class.java) -> LiveMatchViewModel() as T
            modelClass.isAssignableFrom(AllMatchScheduledViewModel::class.java) -> AllMatchScheduledViewModel() as T
            else -> throw IllegalArgumentException("View Model Class Not Found")
        }
    }
}
