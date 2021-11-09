package com.example.footballapp.util

import android.view.View
import android.view.View.*
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.footballapp.R
import com.example.footballapp.model.network.State
import com.example.footballapp.model.response.topScorers.TopScorersInfo
import com.example.footballapp.ui.base.BaseAdapter
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
            .placeholder(R.drawable.ic_baseline_cloud_download_24)
            .error(R.drawable.ic_baseline_error_outline_24)
            .into(this)
    }
}

@BindingAdapter(value = ["app:ImageUrlTeam"])
fun ImageView.setImageUrl(urlTeam: TopScorersInfo?) {
    val url = urlTeam?.statistics?.joinToString { it.team?.logo.toString() }
    if (url != null) {
        GlideApp.with(context)
            .load(url)
            .placeholder(R.drawable.ic_baseline_cloud_download_24)
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

@BindingAdapter(value = ["app:total_goals"])
fun TextView.setTotalGoals(text: TopScorersInfo) {
    this.text = text.statistics?.joinToString { it.goals?.total.toString() }
}

@BindingAdapter(value = ["app:teamName"])
fun TextView.setTeamName(text: TopScorersInfo) {
    this.text = text.statistics?.joinToString { it.team?.name.toString() }
}

@BindingAdapter(value = ["app:textNotNull"])
fun TextView.setTextNotNull(text: String?) {
    if (text == null || text == "") {
        this.text = "0"
    } else {
        this.text = text
    }
}

@BindingAdapter(value = ["app:textNotNullType"])
fun TextView.setTextTypeNotNull(text: String?) {
    if (text == null || text == "") {
        this.text = "No Result"
    } else {
        this.text = text
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
