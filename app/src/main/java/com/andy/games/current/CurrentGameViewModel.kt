package com.andy.games.current

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.andy.games.models.game.GameRepository
import kotlinx.coroutines.launch

class CurrentGameViewModel @ViewModelInject constructor(
    private val gameRepository: GameRepository,
) : ViewModel() {

    val current = gameRepository.currentlyPlayingGame

    val currentName = MediatorLiveData<String>().apply {
        value = "None selected"

        addSource(current) {
            postValue(it.name)
        }
    }

    val currentImage = Transformations.map(current) {
        it?.backgroundImage
    }

    fun next() {
        viewModelScope.launch {
            gameRepository.next()
        }
    }

}