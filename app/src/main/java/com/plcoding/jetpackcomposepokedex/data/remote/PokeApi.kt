package com.plcoding.jetpackcomposepokedex.data.remote

import androidx.compose.ui.unit.DpOffset
import com.plcoding.jetpackcomposepokedex.data.remote.respondes.Pokemon
import com.plcoding.jetpackcomposepokedex.data.remote.respondes.PokemonList
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokeApi {
    suspend fun getPokemonList(
        @Query("limit") limit: Int,
        @Query("offset") offset: Int
    ): PokemonList

    @GET("pokemon/{name}")
    suspend fun getPokemonInfo(
        @Path("name") name: String
    ): Pokemon
}