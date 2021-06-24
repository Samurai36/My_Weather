package viktor.khlebnikov.geekgrains.android1.myweather.model

data class WeatherDTO(
    val main: MainDTO?
)

data class MainDTO(
    val temp: Int?,
    val feels_like: Int?
)
