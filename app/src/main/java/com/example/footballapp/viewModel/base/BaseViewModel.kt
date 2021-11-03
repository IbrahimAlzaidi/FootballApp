package com.example.footballapp.viewModel.base

import androidx.lifecycle.ViewModel
import com.example.footballapp.model.repository.Repository

abstract class BaseViewModel: ViewModel() {
    protected val repository = Repository()
}