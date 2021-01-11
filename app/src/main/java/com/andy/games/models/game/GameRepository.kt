package com.andy.games.models.game

import com.andy.games.room.GameDao
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GameRepository @Inject constructor(
    private val gameDao: GameDao
) {

    val unfinished = gameDao.getUnfinished()
    val finished = gameDao.getFinished()

    suspend fun addGame(game: Game) {
        gameDao.insert(game)
    }

    suspend fun finishGame(game: Game) {
        val updated = game.copy(
            tidyup = true
        )
        gameDao.insert(updated)
    }
}