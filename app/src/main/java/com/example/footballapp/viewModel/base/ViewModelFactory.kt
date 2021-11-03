package com.example.footballapp.viewModel.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.footballapp.viewModel.*
import java.lang.IllegalArgumentException

class ViewModelFactory(private val arg: String?): ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when{
            modelClass.isAssignableFrom(ClubDetailsViewModel::class.java) -> ClubDetailsViewModel(arg) as T
            modelClass.isAssignableFrom(HomeViewModel::class.java) -> HomeViewModel(arg) as T
            modelClass.isAssignableFrom(LeagueDetailsViewModel::class.java) -> LeagueDetailsViewModel(arg) as T
            modelClass.isAssignableFrom(MatchDetailsViewModel::class.java) -> MatchDetailsViewModel(arg) as T
            modelClass.isAssignableFrom(MatchesViewModel::class.java) -> MatchesViewModel(arg) as T
            modelClass.isAssignableFrom(PlayerDetailsViewModel::class.java) -> PlayerDetailsViewModel(arg) as T
            modelClass.isAssignableFrom(ScorersViewModel::class.java) -> ScorersViewModel(arg) as T
            modelClass.isAssignableFrom(StandingViewModel::class.java) -> StandingViewModel(arg) as T
            else -> throw IllegalArgumentException("View Model Class Not Found")
        }
    }
}