package com.example.footballapp.ui.home

import android.util.Log
import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.util.Constant

class HomeViewModel: BaseViewModel() {
    val leaguesInfo = repository.getLeaguesInfo().asLiveData()
    var x: Int? = null

    init {
        Log.i(Constant.TAG, "Test Variables: $x")
    }
}
