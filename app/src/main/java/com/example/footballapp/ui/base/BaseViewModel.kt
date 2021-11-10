package com.example.footballapp.ui.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.NavDirections
import com.example.footballapp.model.repository.Repository
import com.example.footballapp.navigation.NavigationController
import com.example.footballapp.util.Event


abstract class BaseViewModel: ViewModel() {
    protected val repository = Repository()

    private val _navigationLiveData = MutableLiveData<Event<NavigationController>>()
    val navigationLiveData: LiveData<Event<NavigationController>> = _navigationLiveData

    fun navigate(direction: NavDirections){
        _navigationLiveData.value = Event(NavigationController.To(direction))
    }
}
