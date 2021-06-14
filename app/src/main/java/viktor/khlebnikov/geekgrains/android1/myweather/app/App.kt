package viktor.khlebnikov.geekgrains.android1.myweather.app

import android.app.Application
import androidx.room.Room
import viktor.khlebnikov.geekgrains.android1.myweather.room.HistoryDao
import viktor.khlebnikov.geekgrains.android1.myweather.room.HistoryDataBase

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        appInstance = this
    }

    companion object {

        private var appInstance: App? = null
        private const val DB_NAME = "History.db"

        val appHistoryDao by lazy {
            Room
                .databaseBuilder(
                    appInstance!!.applicationContext,
                    HistoryDataBase::class.java,
                    DB_NAME
                )
                .allowMainThreadQueries()
                .build()
                .historyDao()
        }

    }
}

