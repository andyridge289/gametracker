package com.andy.games.add

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView

import com.andy.games.list.PlaceholderContent.PlaceholderItem
import com.andy.games.databinding.FragmentGameListBinding
import com.andy.games.databinding.GameAddItemBinding
import com.andy.games.models.api.SearchResultGame

class GameAddItemAdapter(
    private val values: List<SearchResultGame>,
    private val onClick: (SearchResultGame) -> Unit
) : RecyclerView.Adapter<GameAddItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameAddItemViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context);
        val  itemBinding = GameAddItemBinding.inflate(layoutInflater, parent, false);
        return GameAddItemViewHolder(itemBinding)

    }

    override fun onBindViewHolder(holder: GameAddItemViewHolder, position: Int) {
        val item = values[position]
        holder.bind(item)
        holder.itemView.setOnClickListener {
            onClick(item)
        }
    }

    override fun getItemCount(): Int = values.size
}