package com.andy.games.add

import androidx.lifecycle.MutableLiveData
import com.andy.games.models.api.SearchResultGame
import com.andy.games.room.GameDao
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AddGameRepository @Inject constructor(
    private val gameDao: GameDao
) {

    val currentGame = MutableLiveData<SearchResultGame>()

    suspend fun add(value: SearchResultGame) {
        val game = value.toGame()
        gameDao.insert(game)
    }
}