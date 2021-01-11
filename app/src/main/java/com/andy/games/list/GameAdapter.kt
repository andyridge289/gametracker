package com.andy.games.list

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

import com.andy.games.databinding.GameAddItemBinding
import com.andy.games.databinding.GameItemBinding
import com.andy.games.models.api.SearchResultGame
import com.andy.games.models.game.Game

class GameAdapter(
    private val values: List<Game>,
    private val onClick: (Game) -> Unit
) : RecyclerView.Adapter<GameViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context);
        val  itemBinding = GameItemBinding.inflate(layoutInflater, parent, false);
        return GameViewHolder(itemBinding)

    }

    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {
        val item = values[position]
        holder.bind(item)
        holder.itemView.setOnClickListener {
            onClick(item)
        }
    }

    override fun getItemCount(): Int = values.size
}