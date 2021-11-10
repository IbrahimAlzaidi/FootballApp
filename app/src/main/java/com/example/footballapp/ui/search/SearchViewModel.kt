package com.example.footballapp.ui.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.footballapp.model.network.State
import com.example.footballapp.model.response.leagueSearch.LeagueSearchResponse
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.util.OnClickListener
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class SearchViewModel : BaseViewModel() , OnClickListener {
    private val _searchLeague = MutableLiveData<State<LeagueSearchResponse?>>()
    val searchLeague: LiveData<State<LeagueSearchResponse?>>
        get() = _searchLeague

    fun getSearchResponse(text: CharSequence?) {
        viewModelScope.launch {
            delay(5000)
            if (text != null) {
                repository.searchLeague(text.toString()).collect {
                    if (it is State.Success) {
                        _searchLeague.postValue(it)
                    }
                }
            }
        }
    }

    override fun onClickItem(id: Int) {
        navigate(SearchFragmentDirections.actionSearchFragmentToLeagueDetailsFragment(id))
    }
}