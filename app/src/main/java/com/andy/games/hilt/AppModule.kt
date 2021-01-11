package com.andy.games.hilt

import android.content.Context
import androidx.room.Room
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
}