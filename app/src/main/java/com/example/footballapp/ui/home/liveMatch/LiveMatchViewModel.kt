package com.example.footballapp.ui.home.liveMatch

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.ui.home.HomeFragmentDirections
import com.example.footballapp.util.OnClickListener

class LiveMatchViewModel : BaseViewModel(), OnClickListener {
    val matchLive = repository.getMatchesLive().asLiveData()

    override fun onClickItem(id: Int) {
        navigate(HomeFragmentDirections.actionHomeFragmentToMatchDetailsFragment(id))
    }
}
