package com.andy.games.list

import androidx.recyclerview.widget.RecyclerView
import com.andy.games.databinding.GameAddItemBinding
import com.andy.games.databinding.GameItemBinding
import com.andy.games.models.api.SearchResultGame
import com.andy.games.models.game.Game

class GameViewHolder(private val binding: GameItemBinding):  RecyclerView.ViewHolder(binding.root) {

    fun bind(item: Game) {
        binding.item = item
        binding.executePendingBindings()
    }
}