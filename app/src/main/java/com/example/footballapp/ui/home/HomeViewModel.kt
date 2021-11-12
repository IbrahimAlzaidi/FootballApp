package com.example.footballapp.ui.home

import androidx.lifecycle.asLiveData
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.util.OnClickListener

class HomeViewModel : BaseViewModel(), OnClickListener {
    val leaguesInfo = repository.getLeaguesInfo().asLiveData()
    override fun onClickItem(id: Int) {
        navigate(HomeFragmentDirections.actionHomeFragmentToLeagueDetailsFragment(id))
    }
}
