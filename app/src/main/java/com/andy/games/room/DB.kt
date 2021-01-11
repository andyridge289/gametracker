package com.andy.games.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.andy.games.models.game.CurrentGame
import com.andy.games.models.game.Game

@Database(
    entities = arrayOf(
        Game::class,
        CurrentGame::class,
    ),
    version = 4
)
abstract class DB: RoomDatabase() {
    abstract fun gameDao(): GameDao
    abstract fun currentGameDao(): CurrentGameDao
}

