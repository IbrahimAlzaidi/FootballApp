package com.example.footballapp.ui.home

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.footballapp.R
import com.example.footballapp.databinding.ItemBinding
import com.example.footballapp.model.response.teams.Squad

class TeamsAdapter(
    private var items: List<Squad>,
    ): RecyclerView.Adapter<TeamsAdapter.TeamsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamsViewHolder {
        return TeamsViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false))
    }

    override fun onBindViewHolder(holder: TeamsViewHolder, position: Int) {
        val currentItem = items[position]
        holder.binding.item = currentItem
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setItems(newItems: List<Squad>){
        items = newItems
        notifyDataSetChanged()
    }

    override fun getItemCount() = items.size
    class TeamsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val binding = ItemBinding.bind(itemView)
    }
}