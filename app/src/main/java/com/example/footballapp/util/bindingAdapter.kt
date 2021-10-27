package com.example.footballapp.util

import android.util.Log
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.footballapp.model.response.teams.Squad
import com.example.footballapp.ui.home.TeamsAdapter
import com.example.footballapp.util.Constant.TAG

@BindingAdapter(value = ["app:items"])
fun setRecyclerView(view: RecyclerView,items: List<Squad>?){
    if (items != null){
            Log.i(TAG,"___IF___")
        (view.adapter as TeamsAdapter).setItems(items)
    }else{
        Log.i(TAG,"___ELSE___")
        (view.adapter as TeamsAdapter).setItems(emptyList())
    }
}