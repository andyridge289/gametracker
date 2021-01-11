package com.andy.games.list

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.andy.games.models.game.GameRepository

class GameListFragmentViewModel @ViewModelInject constructor(
    private val gameRepository: GameRepository
): ViewModel() {

    val games = gameRepository.all

    val selectedGame = gameRepository.selectedGame

}