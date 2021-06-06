package viktor.khlebnikov.geekgrains.android1.myweather.utils

import viktor.khlebnikov.geekgrains.android1.myweather.model.FactDTO
import viktor.khlebnikov.geekgrains.android1.myweather.model.Weather
import viktor.khlebnikov.geekgrains.android1.myweather.model.WeatherDTO
import viktor.khlebnikov.geekgrains.android1.myweather.model.getDefaultCity

fun convertDtoToModel(weatherDTO: WeatherDTO): List<Weather> {
    val fact: FactDTO = weatherDTO.fact!!
    return listOf(Weather(getDefaultCity(), fact.temp!!,
        fact.feels_like!!, fact.condition!!, fact.icon))
}
