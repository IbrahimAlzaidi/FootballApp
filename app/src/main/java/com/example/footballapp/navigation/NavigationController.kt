package com.example.footballapp.navigation

import androidx.navigation.NavDirections


sealed class NavigationController{
    data class To(val directions: NavDirections): NavigationController()
}
