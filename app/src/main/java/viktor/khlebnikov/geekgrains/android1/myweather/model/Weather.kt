package viktor.khlebnikov.geekgrains.android1.myweather.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Weather(
    val city: City = getDefaultCity(),
    val temperature: Int = 0,
    val feelsLike: Int = 0,
    val condition: String = "солнечно",
    val icon: String? = "bkn_n"
) : Parcelable

fun getDefaultCity() = City("Москва", 55.755826, 37.617299900000035)