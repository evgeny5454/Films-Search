package ru.geekbrains.filmsearch.router

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import ru.geekbrains.filmsearch.R
import ru.geekbrains.filmsearch.ui.list.FragmentFilmsList

class Router(private val fragmentManager: FragmentManager) {


    fun showFilmsList() {
        fragmentManager.commit {
            replace<FragmentFilmsList>(R.id.container)
            setReorderingAllowed(true)
            addToBackStack("")


        }
    }

}