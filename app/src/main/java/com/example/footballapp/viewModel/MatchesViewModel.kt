package com.example.footballapp.viewModel

import android.util.Log
import com.example.footballapp.util.Constant.TAG
import com.example.footballapp.viewModel.base.BaseViewModel

class MatchesViewModel(arg: String?): BaseViewModel() {
    init {
        Log.i(TAG,arg.toString())
    }

}