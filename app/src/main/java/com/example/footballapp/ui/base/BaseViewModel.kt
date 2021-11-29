package com.example.footballapp.ui.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.NavDirections
import com.example.footballapp.model.repository.Repository
import com.example.footballapp.util.Event
import com.example.footballapp.model.domain.NavigationController

abstract class BaseViewModel : ViewModel() {

    private val _navigationLiveData = MutableLiveData<Event<NavigationController>>()
    val navigationLiveData: LiveData<Event<NavigationController>> = _navigationLiveData

    fun navigate(direction: NavDirections) {
        _navigationLiveData.postValue(Event(NavigationController(direction)))
    }
    protected val repository = Repository()
}
