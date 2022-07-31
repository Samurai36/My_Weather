package viktor.khlebnikov.geekgrains.android1.myweather.utils

import viktor.khlebnikov.geekgrains.android1.myweather.model.*
import viktor.khlebnikov.geekgrains.android1.myweather.room.HistoryEntity

fun convertDtoToModel(weatherDTO: WeatherDTO): List<Weather> {
    val main: MainDTO = weatherDTO.main!!
    return listOf(Weather(getDefaultCity(), main.temp!!,
        main.feels_like!!))
}

fun convertHistoryEntityToWeather(entityList: List<HistoryEntity>): List<Weather> {
    return entityList.map {
        Weather(City(it.city, 0.0, 0.0), it.temperature, 0)
    }
}

fun convertWeatherToEntity(weather: Weather): HistoryEntity {
    return HistoryEntity(0, weather.city.city, weather.temperature)
}