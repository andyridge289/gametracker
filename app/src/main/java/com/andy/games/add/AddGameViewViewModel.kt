package com.andy.games.add

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class AddGameViewViewModel @ViewModelInject constructor(
    private val addGameRepository: AddGameRepository
) : ViewModel() {

    private val currentGame = addGameRepository.currentGame

    val currentName = MediatorLiveData<String>().apply{

        value = ""

        addSource(currentGame) {
            postValue(it.name)
        }
    }

    val currentImage = Transformations.map(currentGame) {
        it?.backgroundImage
    }

    fun add() {
        viewModelScope.launch {
            addGameRepository.add(currentGame.value!!)
        }
    }
}