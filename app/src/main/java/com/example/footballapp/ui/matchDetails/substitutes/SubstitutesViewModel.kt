package com.example.footballapp.ui.matchDetails.substitutes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.footballapp.model.network.State
import com.example.footballapp.model.response.lineup.SubstitutesPlayer
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.util.toSubstitutes
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class SubstitutesViewModel(matchId: Int? = null) : BaseViewModel() {
    val matchSubstitutes = matchId?.let { repository.getMatchLineup(it).asLiveData() }

    private val _substitutesPlayer = MutableLiveData<List<SubstitutesPlayer?>>()

    val substitutesPlayer: LiveData<List<SubstitutesPlayer?>>
        get() = _substitutesPlayer

    init {
        viewModelScope.launch {
            if (matchId != null) {
                repository.getMatchLineup(matchId).collect { state ->
                    if (state is State.Success) {
                        _substitutesPlayer.postValue(state.toData()?.lineupInfo?.toSubstitutes())
                    }
                }
            }
        }
    }
}
