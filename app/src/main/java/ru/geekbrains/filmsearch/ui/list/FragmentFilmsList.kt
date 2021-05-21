package ru.geekbrains.filmsearch.ui.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import ru.geekbrains.filmsearch.R
import ru.geekbrains.filmsearch.domain.Film

class FragmentFilmsList : Fragment() {

    private var viewModel: FilmListViewModel? = null
    private var adapter = FilmAdapter(this)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FilmListViewModel::class.java)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.list_films_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (savedInstanceState == null) {
            viewModel?.requestFilms()
        }

        viewModel?.getFilmsLiveData()?.observe(viewLifecycleOwner, Observer<List<Film?>?> { films -> adapter.setData(films as List<Film>) })
        val filmsList: RecyclerView = view.findViewById(R.id.films_list)
        val lm: RecyclerView.LayoutManager = GridLayoutManager(requireContext(),2)
        filmsList.layoutManager = lm
        filmsList.adapter = adapter

        var button: FloatingActionButton = view.findViewById(R.id.floating_button)
        var toolbar: Toolbar = view.findViewById(R.id.toolbar_list_films)
        toolbar.setTitle(R.string.app_name)

        button.setOnClickListener { it
            Toast.makeText(requireContext(),"Нажата кнопка", Toast.LENGTH_LONG).show()
        }
    }
}