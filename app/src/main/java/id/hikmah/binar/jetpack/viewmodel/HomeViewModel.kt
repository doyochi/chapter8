package id.hikmah.binar.jetpack.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import id.hikmah.binar.jetpack.BuildConfig
import id.hikmah.binar.jetpack.model.MoviePopularResponse
import id.hikmah.binar.jetpack.model.Result
import id.hikmah.binar.jetpack.service.TMDBApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class TMDBViewModel(private val tmdbApiService: TMDBApiService): ViewModel() {

    // digunakan untuk assign value, hanya didalam viewmodel
    private val _dataSuccess = MutableLiveData<MoviePopularResponse>()
    // digunakan untuk observe di activity/fragment
    val dataSuccess: LiveData<MoviePopularResponse> get() = _dataSuccess

    private val _detailSuccess = MutableLiveData<Result>()
    val detailSuccess: LiveData<Result> get() = _detailSuccess

    private val _dataError = MutableLiveData<String>()
    val dataError: LiveData<String> get() = _dataError

    fun getAllMoviePopular() {
        tmdbApiService.getAllMovie(BuildConfig.API_KEY).enqueue(object :
            Callback<MoviePopularResponse> {
            override fun onResponse(call: Call<MoviePopularResponse>, response: Response<MoviePopularResponse>) {
                if (response.isSuccessful) {
                    if (response.body() != null) {
                        _dataSuccess.postValue(response.body())
                    } else {
                        _dataError.postValue("Data Empty")
                    }
                } else {
                    _dataError.postValue("Data Gagal diambil")
                }
                Log.e("onResponse", "TestGetMoviePopular")
            }

            override fun onFailure(call: Call<MoviePopularResponse>, t: Throwable) {
                _dataError.postValue("Server Bermasalah")
                Log.e("onFailure", t.toString())
            }

        })
    }

    fun getDetailMovie(pilem_id: Int) {
        tmdbApiService.getDetailMovie(pilem_id, BuildConfig.API_KEY).enqueue(object :
            Callback<Result> {
            override fun onResponse(call: Call<Result>, response: Response<Result>) {
                if (response.isSuccessful) {
                    if (response.body() != null) {
                        _detailSuccess.postValue(response.body())
                    } else {
                        _dataError.postValue("Data Empty")
                    }
                } else {
                    _dataError.postValue("Data Gagal diambil")
                }
                Log.e("onResponse", "TestGetMoviePopular")
            }

            override fun onFailure(call: Call<Result>, t: Throwable) {
                Log.e("onFailure", t.toString())
            }

        })
    }

}