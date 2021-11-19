package com.example.footballapp.util

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelFactory : ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        listOfViewModels.forEach { viewModelClass ->
            if (modelClass.isAssignableFrom(viewModelClass)) {
                return viewModelClass.newInstance() as T
            }
        }
        throw IllegalArgumentException("View Model Class Not Found")
    }

    companion object {
        val listOfViewModels = mutableListOf<Class<*>>()
    }


}


