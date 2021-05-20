package ru.geekbrains.filmsearch.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.geekbrains.filmsearch.domain.Film
import ru.geekbrains.filmsearch.domain.MockFilmRepository

class FilmListViewModel : ViewModel() {
    var filmsLiveData = MutableLiveData<List<Film>>()
    var repository = MockFilmRepository()

    fun getFilmsLiveData() : LiveData<List<Film>> {
        return filmsLiveData
    }

    fun requestFilms() {
        filmsLiveData.value = repository.getFilmsList()
    }

}