package com.andy.games.list

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.andy.games.models.game.GameRepository
import kotlinx.coroutines.launch

class GameItemViewModel @ViewModelInject constructor(
    private val gameRepository: GameRepository
) : ViewModel() {

    private val selectedGame = gameRepository.selectedGame

    val currentName = MediatorLiveData<String>().apply{

        value = ""

        addSource(selectedGame) {
            postValue(it.name)
        }
    }

    val currentImage = Transformations.map(selectedGame) {
        it?.backgroundImage
    }


}