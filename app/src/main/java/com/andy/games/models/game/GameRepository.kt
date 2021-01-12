package com.andy.games.models.game

import android.content.SharedPreferences
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import com.andy.games.room.CurrentGameDao
import com.andy.games.room.GameDao
import timber.log.Timber
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

    suspend fun next() {

        Timber.e("SHIT next")

        val current = currentlyPlayingGame.value

        val candidates = when {
            current == null -> gameDao.getAllSync()
            current.tidyup -> gameDao.getUnfinishedSync()
            else -> gameDao.getFinishedSync()
        }

        val summary = currentGameDao.getSummary()

        val next = getNext(candidates, summary)
        if (next != null) {
            currentGameDao.insert(
                CurrentGame(
                    id = 0,
                    gameId = next.rawgId,
                    time = System.currentTimeMillis()
                )
            )
        }
    }

    private fun getNext(candidates: List<Game>, counts: List<CurrentGameDao.Tuple>): Game? {

        val missing = candidates.filter { g ->
            !counts.any { c -> g.rawgId == c.game_id }
        }

        if (missing.isNotEmpty()) {
            return missing.random()
        }

        val validCounts = counts.filter { c ->
            candidates.any { g -> g.rawgId == c.game_id }
        }

        validCounts.sortedBy { it.count }
        val id = validCounts.getOrNull(0)?.game_id

        return candidates.find { it.rawgId == id }
    }
}