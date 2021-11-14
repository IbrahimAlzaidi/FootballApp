package com.example.footballapp.ui.matchDetails.substitutes

import androidx.lifecycle.*
import com.example.footballapp.model.network.State
import com.example.footballapp.model.response.lineup.SubstitutesPlayer
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.util.toSubstitutes
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class SubstitutesViewModel(arg: Int?, state: SavedStateHandle) : BaseViewModel(state) {
    val matchSubstitutes = arg?.let { repository.getMatchLineup(it).asLiveData() }

    private val _substitutesPlayer = MutableLiveData<List<SubstitutesPlayer?>>()

    val substitutesPlayer: LiveData<List<SubstitutesPlayer?>>
        get() = _substitutesPlayer

    init {
        viewModelScope.launch {
            if (arg != null) {
                repository.getMatchLineup(arg).collect { state ->
                    if (state is State.Success) {
                        _substitutesPlayer.postValue(state.toData()?.lineupInfo?.toSubstitutes())
                    }
                }
            }
        }
    }
}
