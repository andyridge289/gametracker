package com.andy.games.add

import androidx.recyclerview.widget.RecyclerView
import com.andy.games.databinding.GameAddItemBinding
import com.andy.games.models.api.SearchResultGame

class GameAddItemViewHolder(private val binding: GameAddItemBinding):  RecyclerView.ViewHolder(binding.root) {

    fun bind(item: SearchResultGame) {
        binding.item = item
        binding.executePendingBindings()
    }
}