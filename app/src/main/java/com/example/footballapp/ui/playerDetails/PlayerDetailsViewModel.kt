package com.example.footballapp.ui.playerDetails

import android.util.Log
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.util.Constant.TAG

class PlayerDetailsViewModel(arg: Int?): BaseViewModel() {
    init {
        Log.i(TAG,"playerDetails:$arg")
    }
}