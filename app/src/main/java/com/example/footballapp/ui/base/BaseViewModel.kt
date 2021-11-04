package com.example.footballapp.ui.base

import androidx.annotation.Keep
import androidx.lifecycle.ViewModel
import com.example.footballapp.model.repository.Repository

@Keep
abstract class BaseViewModel: ViewModel() {
    protected val repository = Repository()
}
