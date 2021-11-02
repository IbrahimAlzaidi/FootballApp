package com.example.footballapp.util

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.footballapp.ui.clubDetails.ClubDetailsViewModel
import com.example.footballapp.ui.home.HomeViewModel
import com.example.footballapp.ui.leagueDetails.LeagueDetailsViewModel
import com.example.footballapp.ui.leagueDetails.matches.MatchesViewModel
import com.example.footballapp.ui.leagueDetails.scorers.ScorersViewModel
import com.example.footballapp.ui.leagueDetails.standing.StandingViewModel
import com.example.footballapp.ui.matchDay.MatchDayViewModel
import com.example.footballapp.ui.matchDetails.MatchDetailsViewModel
import com.example.footballapp.ui.playerDetails.PlayerDetailsViewModel
import java.lang.IllegalArgumentException

class ViewModelFactory: ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when{
            modelClass.isAssignableFrom(ClubDetailsViewModel::class.java) -> ClubDetailsViewModel() as T
            modelClass.isAssignableFrom(HomeViewModel::class.java) -> HomeViewModel() as T
            modelClass.isAssignableFrom(LeagueDetailsViewModel::class.java) -> LeagueDetailsViewModel() as T
            modelClass.isAssignableFrom(MatchDayViewModel::class.java) -> MatchDayViewModel() as T
            modelClass.isAssignableFrom(MatchDetailsViewModel::class.java) -> MatchDetailsViewModel() as T
            modelClass.isAssignableFrom(MatchesViewModel::class.java) -> MatchesViewModel() as T
            modelClass.isAssignableFrom(PlayerDetailsViewModel::class.java) -> PlayerDetailsViewModel() as T
            modelClass.isAssignableFrom(ScorersViewModel::class.java) -> ScorersViewModel() as T
            modelClass.isAssignableFrom(StandingViewModel::class.java) -> StandingViewModel() as T
            else -> throw IllegalArgumentException("View Model Class Not Found")
        }
    }
}