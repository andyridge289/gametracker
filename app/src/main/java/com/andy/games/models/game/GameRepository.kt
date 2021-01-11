package com.andy.games.models.game

import android.content.SharedPreferences
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import com.andy.games.room.CurrentGameDao
import com.andy.games.room.GameDao
import javax.inject.Inject
import javax.inject.Singleton

const val CURRENT_GAME = "CURRENT_GAME"

@Singleton
class GameRepository @Inject constructor(
    private val gameDao: GameDao,
    private val currentGameDao: CurrentGameDao,
) {


    val selectedGame = MutableLiveData<Game>()

    private val currentlyPlayingGameId = Transformations.map(currentGameDao.getCurrent()) {
        it?.gameId
    }

    val currentlyPlayingGame = Transformations.switchMap(currentlyPlayingGameId) {
        if (it != null) {
            gameDao.getGame(it)
        } else {
            MutableLiveData(null)
        }
    }

    val all = gameDao.getAll()
    val unfinished = gameDao.getUnfinished()
    val finished = gameDao.getFinished()

    suspend fun finishGame(game: Game) {
        val updated = game.copy(
            tidyup = true
        )
        gameDao.insert(updated)
    }

    suspend fun setCurrentGame(game: Game) {
        val current = CurrentGame(0, game.rawgId, System.currentTimeMillis())
        currentGameDao.insert(current)
    }

    fun next() {

    }
}