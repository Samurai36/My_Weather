package viktor.khlebnikov.geekgrains.android1.myweather.repository

import viktor.khlebnikov.geekgrains.android1.myweather.model.Weather

interface LocalRepository {
    fun getAllHistory(): List<Weather>
    fun saveEntity(weather: Weather)
}