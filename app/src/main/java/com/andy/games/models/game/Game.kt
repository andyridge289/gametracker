package com.andy.games.models.game

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.andy.games.models.api.SearchResultPlatform
import com.google.gson.annotations.SerializedName

@Entity(tableName = "game")
data class Game(
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "tidyup") val tidyup: Boolean,
    @ColumnInfo(name = "rawg_id") val rawgId: Int,
    @SerializedName("background_image") val backgroundImage: String?,
) {

    @PrimaryKey(autoGenerate = true) var id: Int = 0
}