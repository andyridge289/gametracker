package com.andy.games.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.andy.games.R
import com.andy.games.databinding.FragmentGameListBinding
import com.andy.games.databinding.FragmentGameListListBinding
import com.andy.games.models.game.Game
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class GameListFragment : Fragment() {

    private val vm: GameListFragmentViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding = FragmentGameListListBinding.inflate(inflater, container, false)

        val onClick = { game: Game ->
            vm.selectedGame.value = game
            val action = GameListFragmentDirections.actionGameListFragmentToGameItemFragment()
            findNavController().navigate(action)
        }

        vm.games.observe(viewLifecycleOwner) {
            binding.list.adapter = GameAdapter(it, onClick)
        }

        return binding.root
    }
}