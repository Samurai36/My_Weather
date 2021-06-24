package viktor.khlebnikov.geekgrains.android1.myweather.repository

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query
import viktor.khlebnikov.geekgrains.android1.myweather.model.WeatherDTO

interface WeatherAPI {
    @GET("data/2.5/weather?")
    fun getWeather(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("appid") appid: String
    ): Call<WeatherDTO>
}