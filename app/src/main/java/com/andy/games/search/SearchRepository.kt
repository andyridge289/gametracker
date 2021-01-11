package com.andy.games.search

import com.andy.games.models.api.SearchResponse
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import timber.log.Timber
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class SearchRepository @Inject constructor() {

    private val retrofit: Retrofit

    init {
        val logging = HttpLoggingInterceptor();
        logging.level = HttpLoggingInterceptor.Level.BODY;

        val httpClient = OkHttpClient.Builder();
        httpClient.addInterceptor(logging);

        retrofit = Retrofit.Builder()
            .baseUrl("https://api.rawg.io/api/")
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build()
    }

    suspend fun search(value: String): SearchResponse? {

        val api: RawgApi = retrofit.create(RawgApi::class.java)

        return try {
            api.getGame(value)
        } catch (e: Throwable) {
            Timber.e("SHIT $e")
            null
        }
    }
}