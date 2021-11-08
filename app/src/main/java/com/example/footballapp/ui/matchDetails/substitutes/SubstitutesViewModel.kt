package com.example.footballapp.ui.matchDetails.substitutes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.footballapp.model.network.State
import com.example.footballapp.model.response.lineup.SubstitutesPlayer
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.util.toSubstitutes
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class SubstitutesViewModel(val arg: Int?) : BaseViewModel() {

    private val _substitutesPlayer = MutableLiveData<List<SubstitutesPlayer>>()
    val substitutesPlayer: LiveData<List<SubstitutesPlayer>> = _substitutesPlayer

    init {
        viewModelScope.launch {
            if (arg != null) {
                repository.getMatchLineup(718351).collect { state ->
                    if (state is State.Success) {
                        _substitutesPlayer.postValue(state.toData()?.lineupInfo?.toSubstitutes())
                    }
                }
            }
        }
    }
}
