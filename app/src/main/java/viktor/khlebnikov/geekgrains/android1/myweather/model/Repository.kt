package viktor.khlebnikov.geekgrains.android1.myweather.model

interface Repository {
    fun getWeatherFromServer(): Weather
    fun getWeatherFromLocalStorage(): Weather
}