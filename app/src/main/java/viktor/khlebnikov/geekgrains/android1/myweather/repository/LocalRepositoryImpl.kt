package viktor.khlebnikov.geekgrains.android1.myweather.repository

import viktor.khlebnikov.geekgrains.android1.myweather.model.Weather
import viktor.khlebnikov.geekgrains.android1.myweather.room.HistoryDao
import viktor.khlebnikov.geekgrains.android1.myweather.utils.convertHistoryEntityToWeather
import viktor.khlebnikov.geekgrains.android1.myweather.utils.convertWeatherToEntity

class LocalRepositoryImpl(private val localDataSource: HistoryDao) :
    LocalRepository {

    override fun getAllHistory(): List<Weather> {
        return convertHistoryEntityToWeather(localDataSource.all())
    }

    override fun saveEntity(weather: Weather) {
        localDataSource.insert(convertWeatherToEntity(weather))
    }
}