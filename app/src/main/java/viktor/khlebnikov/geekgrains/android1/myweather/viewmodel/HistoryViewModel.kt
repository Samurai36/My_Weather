package viktor.khlebnikov.geekgrains.android1.myweather.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import viktor.khlebnikov.geekgrains.android1.myweather.app.App.Companion.getHistoryDao
import viktor.khlebnikov.geekgrains.android1.myweather.app.AppState
import viktor.khlebnikov.geekgrains.android1.myweather.repository.LocalRepository
import viktor.khlebnikov.geekgrains.android1.myweather.repository.LocalRepositoryImpl

class HistoryViewModel(
    val historyLiveData: MutableLiveData<AppState> = MutableLiveData(),
    private val historyRepository: LocalRepository = LocalRepositoryImpl(getHistoryDao())
) : ViewModel() {

    fun getAllHistory() {
        historyLiveData.value = AppState.Loading
        historyLiveData.value = AppState.Succes(historyRepository.getAllHistory())
    }
}