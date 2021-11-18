package com.example.footballapp.util

import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.footballapp.R
import com.example.footballapp.model.network.State
import com.example.footballapp.ui.base.BaseAdapter
import com.github.twocoffeesoneteam.glidetovectoryou.GlideApp

@BindingAdapter(value = ["app:showWhenLoading"])
fun <T> View.showWhenLoading(state: State<T>?) {
    if (state is State.Loading) {
        this.visibility = VISIBLE
    } else {
        this.visibility = GONE
    }
}

@BindingAdapter(value = ["app:showWhenError"])
fun <T> View.showWhenError(state: State<T>?) {
    if (state is State.Error) {
        this.visibility = VISIBLE
    } else {
        this.visibility = GONE
    }
}

@BindingAdapter(value = ["app:showWhenSuccess"])
fun <T> View.showWhenSuccess(state: State<T>?) {
    if (state is State.Success) {
        this.visibility = VISIBLE
    } else {
        this.visibility = GONE
    }
}

@BindingAdapter(value = ["app:showWhenSearch"])
fun <T> View.showWhenSearch(state: State<T>?) {
    if (state is State.Success || state is State.Loading || state is State.Error) {
        this.visibility = GONE
    } else {
        this.visibility = VISIBLE
    }
}

@BindingAdapter(value = ["app:ImageUrl"])
fun ImageView.setImageUrl(url: String?) {
    if (url != null) {
        GlideApp.with(context)
            .load(url)
            .placeholder(R.drawable.progress_animation)
            .error(R.drawable.ic_baseline_error_outline_24)
            .into(this)
    }
}

@BindingAdapter(value = ["app:items"])
fun <T> RecyclerView.setRecyclerView(items: List<T>?) {
    if (items != null) {
        (this.adapter as BaseAdapter<T>?)?.setItems(items)
    } else {
        (this.adapter as BaseAdapter<T>?)?.setItems(emptyList())
    }
}

@BindingAdapter(value = ["app:textNull"])
fun setText(view: TextView, text: String?) {
    if (text == null) {
        view.text = "0"
    } else {
        view.text = text
    }
}

@BindingAdapter(value = ["app:progressApp"])
fun ProgressBar.setProgress(text: String?) {
    text?.subSequence(0, 1)?.also { this.progress = it[0].code }
}

@BindingAdapter(value=["app:setScoreSeparator"])
fun TextView.setHomeScoreSeparator(text: String?){
    if (text == null){
        this.text = "-"}
}


@BindingAdapter(value = ["app:visibilityView"])
fun View.showIfTrue(value:Boolean?){
    if (value == true){
        this.visibility = VISIBLE
    }else{
        this.visibility = GONE
    }
}
