package com.example.footballapp.viewModel.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.footballapp.viewModel.*
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