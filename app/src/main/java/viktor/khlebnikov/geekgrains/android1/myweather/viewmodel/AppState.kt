package viktor.khlebnikov.geekgrains.android1.myweather.viewmodel

import viktor.khlebnikov.geekgrains.android1.myweather.model.Weather

sealed class AppState {

    data class Succes(val weatherData: Weather) : AppState()
    object Loading : AppState()
    data class Error(val error: Throwable) : AppState()

}