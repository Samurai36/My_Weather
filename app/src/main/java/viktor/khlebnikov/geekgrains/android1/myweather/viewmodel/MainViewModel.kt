package viktor.khlebnikov.geekgrains.android1.myweather.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import viktor.khlebnikov.geekgrains.android1.myweather.model.Repository
import viktor.khlebnikov.geekgrains.android1.myweather.model.RepositoryImpl
import java.lang.Thread.sleep

class MainViewModel(
    private val liveDataToObserve: MutableLiveData<AppState> = MutableLiveData(),
    private val repositoryImpl: Repository = RepositoryImpl()
) :
    ViewModel() {

    fun getLiveData() = liveDataToObserve

    fun getWeatherFromLocalSourceRus() = getDataFromLocalSourse(isRussian = true)
    fun getWeatherFromLocalSourceWorld() = getDataFromLocalSourse(isRussian = false)
    fun getWeatherFromRemoteSource() = getDataFromLocalSourse(isRussian = true)

    private fun getDataFromLocalSourse(isRussian: Boolean) {
        liveDataToObserve.value = AppState.Loading
        Thread {
            sleep(1000)
            liveDataToObserve.postValue(
                AppState.Succes(
                    if (isRussian)
                        repositoryImpl.getWeatherFromLocalStorageRus()
                    else repositoryImpl.getWeatherFromLocalStorageWorld()
                )
            )
        }.start()
    }
}