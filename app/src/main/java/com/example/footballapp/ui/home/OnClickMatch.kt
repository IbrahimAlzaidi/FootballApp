package com.example.footballapp.ui.home

import android.view.View
import com.example.footballapp.ui.base.BaseInteractionListener

interface OnClickMatch : BaseInteractionListener {
    fun onClickMatch(id:Int)
}
