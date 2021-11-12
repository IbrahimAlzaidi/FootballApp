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


}
