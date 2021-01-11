package com.andy.games.current

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.andy.games.models.game.GameRepository

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
        gameRepository.next()
    }

}