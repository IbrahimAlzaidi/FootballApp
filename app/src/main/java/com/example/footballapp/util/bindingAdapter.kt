package com.example.footballapp.util

import android.util.Log
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
import com.example.footballapp.model.response.base.baseLeagueInfo.LeagueInfo
import com.example.footballapp.model.response.matchScheduled.MatchScheduledInfo
import com.example.footballapp.model.response.schedulerMatch.SchedulerMatchInfo
import com.example.footballapp.ui.base.BaseAdapter
import com.example.footballapp.ui.home.LeaguesAdapter
import com.example.footballapp.ui.home.matchScheduled.MatchScheduledAdapter
import com.example.footballapp.ui.leagueDetails.matches.MatchAdapter
import com.example.footballapp.util.Constant.TAG
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
            .timeout(10000)
            .into(this)
    }
}

@BindingAdapter(value = ["app:items"])
fun <T> RecyclerView.setRecyclerView(items: List<T>?) {
    if (items != null) {
        (this.adapter as BaseAdapter<T>?)?.setItems(this, items)
    } else {
        (this.adapter as BaseAdapter<T>?)?.setItems(this, emptyList())
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

@BindingAdapter(value = ["app:setScoreSeparator"])
fun TextView.setHomeScoreSeparator(text: String?) {
    if (text == null) {
        this.text = "-"
    }
}

@BindingAdapter(value = ["app:itemsScroll"])
fun RecyclerView.setRecyclerViewScroll(items: List<SchedulerMatchInfo>?) {
    if (items != null) {
        val position = items.filter { it.fixture?.status?.longMatch == "Match Finished"}.size
        Log.i(TAG, "setRecyclerViewScroll: $position")
        (this.adapter as MatchAdapter?)?.setItems(this, items, position)
    } else {
        (this.adapter as MatchAdapter?)?.setItems(this, emptyList())
    }
}


@BindingAdapter(value = ["app:visibilityView"])
fun View.showIfTrue(value:Boolean?){
    if (value == true){
        this.visibility = VISIBLE
    }else{
        this.visibility = GONE
    }
}

@BindingAdapter(value = ["app:itemsLeagues"])
fun RecyclerView.setRecyclerViewLeagues(items: List<LeagueInfo>?) {
    if (items != null) {
            val item = items.filter { it.country?.name != "World" && it.league?.type != "Cup" }
        (this.adapter as LeaguesAdapter?)?.setItems(this, item)
    } else {
        (this.adapter as LeaguesAdapter?)?.setItems(this, emptyList())
    }
}

@BindingAdapter(value = ["app:itemsMatches"])
fun RecyclerView.setRecyclerViewMatches(items: List<MatchScheduledInfo>?) {
    if (items != null) {
        val item = items.filter { it.league?.country != "World" && it.league?.name != "I Liga - Women" }
        (this.adapter as MatchScheduledAdapter?)?.setItems(this, item)
    } else {
        (this.adapter as MatchScheduledAdapter?)?.setItems(this, emptyList())
    }
}

