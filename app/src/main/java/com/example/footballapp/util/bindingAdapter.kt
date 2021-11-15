package com.example.footballapp.util

import android.view.View
import android.view.View.*
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.footballapp.R
import com.example.footballapp.model.network.State
import com.example.footballapp.model.response.base.baseLeagueInfo.LeagueInfo
import com.example.footballapp.model.response.matchStatistic.MatchResultData
import com.example.footballapp.model.response.topScorers.TopScorersInfo
import com.example.footballapp.ui.base.BaseAdapter
import com.example.footballapp.ui.home.LeaguesAdapter
import com.github.twocoffeesoneteam.glidetovectoryou.GlideApp

@BindingAdapter(value = ["app:showWhenLoading"])
fun <T> View.showWhenLoading(state: State<T>?) {
    if (state is State.Loading) {
        this.visibility = View.VISIBLE
    } else {
        this.visibility = View.GONE
    }
}

@BindingAdapter(value = ["app:showWhenError"])
fun <T> View.showWhenError(state: State<T>?) {
    if (state is State.Error) {
        this.visibility = View.VISIBLE
    } else {
        this.visibility = View.GONE
    }
}

@BindingAdapter(value = ["app:showWhenSuccess"])
fun <T> View.showWhenSuccess(state: State<T>?) {
    if (state is State.Success) {
        this.visibility = View.VISIBLE
    } else {
        this.visibility = View.GONE
    }
}

@BindingAdapter(value = ["app:showWhenSearch"])
fun <T> View.showWhenSearch(state: State<T>?) {
    if (state is State.Success || state is State.Loading || state is State.Error) {
        this.visibility = View.GONE
    } else {
        this.visibility = View.VISIBLE
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

@BindingAdapter(value = ["app:itemsDropFirstTow"])
fun <T> setRecyclerViewDrop(view: RecyclerView, items: List<LeagueInfo>?) {
    if (items != null) {
            val itemDropTow = items.drop(2)
        (view.adapter as LeaguesAdapter?)?.setItems(itemDropTow)
    } else {
        (view.adapter as LeaguesAdapter?)?.setItems(emptyList())
    }
}

@BindingAdapter(value = ["app:textNull"])
fun setText(view: TextView, text: String?){
    if (text == null){
        view.text = "0"
    }else{
        view.text = text
    }
}

@set:BindingAdapter("invisible")
var View.invisible
    get() = visibility == INVISIBLE
    set(value) {
        visibility = if (value) INVISIBLE else VISIBLE
    }

@set:BindingAdapter("gone")
var View.gone
    get() = visibility == GONE
    set(value) {
        visibility = if (value) GONE else VISIBLE
    }
@BindingAdapter(value=["app:progressApp"])
fun ProgressBar.setProgress(text:String?){
    text?.subSequence(0,1)?.also { this.progress = it[0].code }
}
