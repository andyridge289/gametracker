
package com.andy.games.models.api

import com.andy.games.models.game.Game
import com.google.gson.annotations.SerializedName

data class SearchResponse(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<SearchResultGame>,
)

data class SearchResultGame(
    val id: Int,
    val slug: String,
    val name: String,
    val platforms: List<SearchResultPlatform>,
    val released: String?,
    @SerializedName("background_image") val backgroundImage: String?,
    val rating: Float,
    val metacritic: Int,
    @SerializedName("saturated_color") val saturatedColour: String,
    @SerializedName("dominant_color") val dominantColour: String,
) {

    fun toGame(): Game {
        return Game(
            name = name,
            rawgId = id,
            backgroundImage = backgroundImage,
            tidyup = false
        )
    }
}

data class SearchResultPlatform(
    val id: Int,
    val name: String,
    val slug: String,

)