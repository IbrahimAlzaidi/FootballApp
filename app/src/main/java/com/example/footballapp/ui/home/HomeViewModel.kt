package com.example.footballapp.ui.home

import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import androidx.navigation.Navigation
import com.example.footballapp.ui.base.BaseViewModel
import com.example.footballapp.util.OnClickListener
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class HomeViewModel: BaseViewModel() ,OnClickListener{
    val leaguesInfo = repository.getLeaguesInfo().asLiveData()
    override fun onClickItem(id: Int) {
       navigate(HomeFragmentDirections.actionHomeFragmentToLeagueDetailsFragment(id))
    }
}
