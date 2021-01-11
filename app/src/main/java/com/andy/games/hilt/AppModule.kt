package com.andy.games.hilt

import android.content.Context
import android.content.SharedPreferences
import androidx.room.Room
import com.andy.games.room.CurrentGameDao
import com.andy.games.room.DB
import com.andy.games.room.GameDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext appContext: Context): DB {
        return Room
            .databaseBuilder(appContext, DB::class.java, "GameDB")
            .fallbackToDestructiveMigration()
            .build()
    }

    @Singleton
    @Provides
    fun provideGameDao(db: DB): GameDao {
        return db.gameDao()
    }

    @Singleton
    @Provides
    fun provideCurrentGameDao(db: DB): CurrentGameDao {
        return db.currentGameDao()
    }

    @Provides
    @Singleton
    fun provideSharedPrefs(@ApplicationContext appContext: Context): SharedPreferences {
        return appContext.getSharedPreferences("default", Context.MODE_PRIVATE)
    }
}