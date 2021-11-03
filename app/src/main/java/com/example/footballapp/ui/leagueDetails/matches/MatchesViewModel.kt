package com.example.footballapp.ui.leagueDetails.matches

import android.util.Log
import com.example.footballapp.util.Constant.TAG
import com.example.footballapp.ui.base.BaseViewModel

class MatchesViewModel(arg: Int?): BaseViewModel() {
    init {
        Log.i(TAG,arg.toString())
    }

}