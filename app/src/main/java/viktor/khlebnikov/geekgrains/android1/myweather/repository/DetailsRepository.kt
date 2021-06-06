package viktor.khlebnikov.geekgrains.android1.myweather.repository

import viktor.khlebnikov.geekgrains.android1.myweather.model.WeatherDTO

interface DetailsRepository {
    fun getWeatherDetailsFromServer(
        lat: Double,
        lon: Double,
        callback: retrofit2.Callback<WeatherDTO>
    )
}