package viktor.khlebnikov.geekgrains.android1.myweather.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import viktor.khlebnikov.geekgrains.android1.myweather.R
import viktor.khlebnikov.geekgrains.android1.myweather.ui.view.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}