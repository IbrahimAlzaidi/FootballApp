package com.example.footballapp.ui.base

import androidx.annotation.Keep
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.footballapp.model.repository.Repository
import kotlinx.coroutines.launch

@Keep
abstract class BaseViewModel: ViewModel() {
    protected val repository = Repository()
}
