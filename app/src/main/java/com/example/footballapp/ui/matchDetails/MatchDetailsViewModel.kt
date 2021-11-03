package com.example.footballapp.ui.matchDetails

import android.util.Log
import com.example.footballapp.util.Constant.TAG
import com.example.footballapp.ui.base.BaseViewModel

class MatchDetailsViewModel(arg: Int?): BaseViewModel() {
    init {
        Log.i(TAG,arg.toString())
    }
}