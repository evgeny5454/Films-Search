package ru.geekbrains.filmsearch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.geekbrains.filmsearch.router.Router

class MainActivity : AppCompatActivity() {

    private var router: Router? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        router = Router(supportFragmentManager)

        if (savedInstanceState == null) {
            router!!.showFilmsList()
        }
    }
}