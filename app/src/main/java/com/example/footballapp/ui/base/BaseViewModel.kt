package com.example.footballapp.ui.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.NavDirections
import com.example.footballapp.model.repository.Repository
import com.example.footballapp.util.Event

abstract class BaseViewModel : ViewModel() {

    private val _navigationLiveData = MutableLiveData<Event<NavDirections>>()
    val navigationLiveData: LiveData<Event<NavDirections>>
        get() = _navigationLiveData

    fun navigate(direction: NavDirections) {
        _navigationLiveData.postValue(Event(direction))
    }

    protected val repository = Repository()
}
