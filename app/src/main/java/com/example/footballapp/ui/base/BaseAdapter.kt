package com.example.footballapp.ui.base

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.footballapp.BR
import com.example.footballapp.model.response.standingTeam.Standing
import com.example.footballapp.model.response.standingTeam.StandingTeams


abstract class BaseAdapter<T>(
    private var items: List<T>,
    private val listener: BaseInteractionListener?,
    private val layoutId: Int,
) : RecyclerView.Adapter<BaseAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder =
        ItemViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                layoutId,
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val current = items[position]
        when (holder) {
            is ItemViewHolder -> {
                holder.binding.apply {
                    setVariable(BR.item, current)
                    setVariable(BR.listener,listener)
                }
            }
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setItems(newItems: List<T>) {
        items = newItems
        notifyDataSetChanged()
    }

    override fun getItemCount() = items.size

    fun getItems() = items

    class ItemViewHolder(val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root)

//    abstract class BaseViewHolder(bindings: ViewDataBinding) :
//        RecyclerView.ViewHolder(bindings.root)
}
