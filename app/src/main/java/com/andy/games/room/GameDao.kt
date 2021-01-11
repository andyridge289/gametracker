package com.andy.games.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.andy.games.models.game.Game

@Dao
interface GameDao {

    @Query("SELECT * FROM game")
    fun getAll(): LiveData<List<Game>>

    @Query("SELECT * FROM game WHERE tidyup = 1")
    fun getFinished(): LiveData<List<Game>>

    @Query("SELECT * FROM game WHERE tidyup = 0")
    fun getUnfinished(): LiveData<List<Game>>

    @Query("SELECT * FROM game WHERE rawg_id = :id")
    fun getGame(id: Int): LiveData<Game>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(game: Game)
}