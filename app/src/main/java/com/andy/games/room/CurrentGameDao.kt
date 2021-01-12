package com.andy.games.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.andy.games.models.game.CurrentGame
import com.andy.games.models.game.Game

@Dao
interface CurrentGameDao {

    data class Tuple(
        val game_id: Int,
        val count: Int
    )

    @Query("SELECT * FROM current_game ORDER BY time DESC LIMIT 1")
    fun getCurrent(): LiveData<CurrentGame?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(game: CurrentGame)

    @Query("SELECT game_id, count(game_id) AS count FROM current_game GROUP BY game_id")
    suspend fun getSummary(): List<Tuple>
}