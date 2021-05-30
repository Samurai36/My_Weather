package viktor.khlebnikov.geekgrains.android1.myweather.ui.view.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import viktor.khlebnikov.geekgrains.android1.myweather.R
import viktor.khlebnikov.geekgrains.android1.myweather.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commit()
        }
    }
}