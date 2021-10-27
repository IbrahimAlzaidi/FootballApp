package com.example.footballapp.util

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.footballapp.model.State
import com.example.footballapp.ui.base.BaseAdapter

@BindingAdapter(value = ["app:whenError"])
fun <T> showWhenError(view: View, state: State<T>?) =
    if (state is State.Error)view.visibility = View.VISIBLE
    else view.visibility = View.GONE

@BindingAdapter(value = ["app:whenLoading"])
fun <T> showWhenLoading(view: View, state: State<T>?) =
    if (state is State.Error)view.visibility = View.VISIBLE
    else view.visibility = View.GONE

@BindingAdapter(value = ["app:whenSuccess"])
fun <T> showWhenSuccess(view: View, state: State<T>?) =
    if (state is State.Error)view.visibility = View.VISIBLE
    else view.visibility = View.GONE

@BindingAdapter(value = ["app:ImageUrl"])
fun imageUrl(view:ImageView,url:String){
    Glide.with(view).load(url).into(view)
}

@BindingAdapter(value = ["app:items"])
fun <T> setRecyclerView(view: RecyclerView,items: List<T>?){
    if (items != null){
        (view.adapter as BaseAdapter<T>?)?.setItems(items)
    }else{
        (view.adapter as BaseAdapter<T>?)?.setItems(emptyList())
    }
}
