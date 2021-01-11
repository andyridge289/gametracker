package com.andy.games.add

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.andy.games.models.api.SearchResultGame
import com.andy.games.search.SearchRepository
import kotlinx.coroutines.launch
import timber.log.Timber

class AddGameViewModel @ViewModelInject constructor(
    private val searchRepository: SearchRepository,
    private val addGameRepository: AddGameRepository,
) : ViewModel() {

    var text: String = ""

    val results = MutableLiveData<List<SearchResultGame>>()

    val currentGame = addGameRepository.currentGame

    fun search() {

        viewModelScope.launch {
            val response = searchRepository.search(text)
            if (response == null) {
                Timber.e("Can't return null search response")
                return@launch
            }

            results.postValue(response.results)
        }

    }
}

