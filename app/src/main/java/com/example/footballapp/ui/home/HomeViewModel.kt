package com.example.footballapp.ui.home

import androidx.lifecycle.*
import com.example.footballapp.model.response.leagues.LeaguesResponse
import com.example.footballapp.model.response.standing.StandingTeamsResponse
import com.example.footballapp.ui.base.BaseViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.map

class HomeViewModel() : BaseViewModel() {
    val leaguesInfo = repository.getLeaguesInfo().asLiveData()
}

//inline fun <T> LiveData<T>.filterData(crossinline filter: (T?) -> Boolean): LiveData<T> {
//    return MediatorLiveData<T>().apply {
//        addSource(this@filterData) {
//            if (filter(it)) {
//                this.value = it
//            }
//        }
//    }
//}
