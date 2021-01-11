package com.andy.games.search

import com.andy.games.BuildConfig
import com.andy.games.models.api.SearchResponse
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface RawgApi {

    @GET("games")
    suspend fun getGame(
        @Query(value = "search") search: String,
        @Query(value = "key") apiKey: String = BuildConfig.RAWG_API_KEY
    ): SearchResponse
}