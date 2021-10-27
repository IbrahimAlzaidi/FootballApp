package com.example.footballapp.ui.base

import android.annotation.SuppressLint
import android.view.*
import androidx.databinding.*
import androidx.recyclerview.widget.RecyclerView
import com.example.footballapp.BR
import com.example.footballapp.viewModel.HomeFragmentViewModel



abstract class BaseAdapter<T>(
    private var items: List<T>,
    private val listener: HomeFragmentViewModel?
) : RecyclerView.Adapter<BaseAdapter.BaseViewHolder>() {
    abstract val layoutId: Int
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder =
        ItemViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                layoutId,
                parent,
                false
            )
        )


    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        val current = items[position]
        when (holder) {
            is ItemViewHolder -> {
                holder.binding.apply {
                    setVariable(BR.item, current)
//                    setVariable(BR.listener,listener) setListener Here
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

    class ItemViewHolder(val binding: ViewDataBinding) : BaseViewHolder(binding)

    abstract class BaseViewHolder(bindning: ViewDataBinding) :
        RecyclerView.ViewHolder(bindning.root)
}
