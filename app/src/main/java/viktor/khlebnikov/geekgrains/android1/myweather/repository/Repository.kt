package viktor.khlebnikov.geekgrains.android1.myweather.repository

import viktor.khlebnikov.geekgrains.android1.myweather.model.Weather

interface Repository {
    fun getWeatherFromServer(): Weather
    fun getWeatherFromLocalStorageRus(): List<Weather>
    fun getWeatherFromLocalStorageWorld(): List<Weather>
}