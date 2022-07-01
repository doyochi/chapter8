package id.hikmah.binar.jetpack.service

import id.hikmah.binar.jetpack.model.MoviePopularResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import id.hikmah.binar.jetpack.model.Result

interface TMDBApiService {
    @GET("movie/popular")
    fun getAllMovie(
        @Query("api_key") key: String
    ): Call<MoviePopularResponse>

    @GET("movie/{movie_id}")
    fun getDetailMovie(
        @Path("movie_id") movieId: Int,
        @Query("api_key") key: String
    ): Call<Result>
}