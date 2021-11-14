package com.example.footballapp.ui.base

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.footballapp.model.repository.Repository


abstract class BaseViewModel(private val state: SavedStateHandle): ViewModel() {
    protected val repository = Repository()
}
