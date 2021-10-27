package com.example.footballapp.util

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.footballapp.ui.base.BaseAdapter

@BindingAdapter(value = ["app:items"])
fun <T> setRecyclerView(view: RecyclerView,items: List<T>?){
    if (items != null){
        (view.adapter as BaseAdapter<T>?)?.setItems(items)
    }else{
        (view.adapter as BaseAdapter<T>?)?.setItems(emptyList())
    }
}
