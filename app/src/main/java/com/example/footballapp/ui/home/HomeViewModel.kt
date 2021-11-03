package com.example.footballapp.ui.home

import android.util.Log
import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.util.Constant.TAG

class HomeViewModel: BaseViewModel() {
    val leaguesInfo = repository.getLeaguesInfo().asLiveData()
    val matchLive = repository.getMatchesLive().asLiveData()

}
