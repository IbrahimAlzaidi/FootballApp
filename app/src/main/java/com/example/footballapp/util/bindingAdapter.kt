package com.example.footballapp.util

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.navigation.*
import androidx.recyclerview.widget.RecyclerView
import com.example.footballapp.R
import com.example.footballapp.model.network.State
import com.example.footballapp.model.response.schedulerMatch.SchedulerMatchInfo
import com.example.footballapp.model.response.topScorers.TopScorersInfo
import com.example.footballapp.ui.base.BaseAdapter
import com.github.twocoffeesoneteam.glidetovectoryou.GlideApp

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
fun imageUrl(view:ImageView,url:String?){
    GlideApp.with(view)
        .load(url)
        .placeholder(R.drawable.ic_baseline_cloud_download_24)
        .error(R.drawable.ic_baseline_error_outline_24)
        .into(view)
}

@BindingAdapter(value = ["app:items"])
fun <T> setRecyclerView(view: RecyclerView,items: List<T>?){
    if (items != null){
        (view.adapter as BaseAdapter<T>?)?.setItems(items)
    }else{
        (view.adapter as BaseAdapter<T>?)?.setItems(emptyList())
    }
}

fun NavController.navigateSafe(directions: NavDirections) {
    // Get action by ID. If action doesn't exist on current node, return.
    val action = (currentDestination ?: graph).getAction(directions.actionId) ?: return
    var destId = action.destinationId
    val dest = graph.findNode(destId)
    if (dest is NavGraph) {
        // Action destination is a nested graph, which isn't a real destination.
        // The real destination is the start destination of that graph so resolve it.
        destId = dest.startDestination
    }
    if (currentDestination?.id != destId) {
        navigate(directions)
    }
}

@BindingAdapter(value = ["app:total_goals"])
fun setTotalGoal(view:TextView,text: TopScorersInfo){
    view.text = text.statistics?.joinToString { it.goals?.total.toString() }
}

@BindingAdapter(value = ["app:teamName"])
fun setTimeName(view:TextView, text: TopScorersInfo){
    view.text = text.statistics?.joinToString { it.team?.name.toString() }
}


@BindingAdapter(value = ["app:navAction"])
fun setNavAction(view: View?, actionId: Int) {
    view?.setOnClickListener { View.OnClickListener { view.findNavController().navigate(actionId) } }
}
