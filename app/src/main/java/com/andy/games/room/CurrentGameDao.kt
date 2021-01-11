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

    @Query("SELECT * FROM current_game ORDER BY time LIMIT 1")
    fun getCurrent(): LiveData<CurrentGame?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(game: CurrentGame)
}