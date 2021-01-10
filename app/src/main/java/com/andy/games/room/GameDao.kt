package com.andy.games.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.andy.games.models.Game

@Dao
interface GameDao {

    @Query("SELECT * FROM game WHERE tidyup = 1")
    fun getFinished(): LiveData<Game>

    @Query("SELECT * FROM game WHERE tidyup = 0")
    fun getUnfinished(): LiveData<Game>

    @Insert
    suspend fun insert(game: Game)
}