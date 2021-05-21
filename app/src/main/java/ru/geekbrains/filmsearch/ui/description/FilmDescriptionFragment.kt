package ru.geekbrains.filmsearch.ui.description

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toolbar
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import ru.geekbrains.filmsearch.R
import ru.geekbrains.filmsearch.domain.Film

class FilmDescriptionFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.film_descriptoin, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val film: Film? = null

        var image: ImageView = view.findViewById(R.id.image)
        var toolbar: Toolbar = view.findViewById(R.id.toolbar_description)

        if (film != null) {
            toolbar.title = film.name
        }

        if (film != null) {
            Glide.with(image)
                    .load(film.imageUrl)
                    .centerCrop()
                    .into(image)
        }



    }

    companion object {
        private const val ARG_FILM = "ARG_FILM"
        fun newInstance(film: Film?): FilmDescriptionFragment {
            val fragment = FilmDescriptionFragment()
            val bundle = Bundle()
            bundle.putParcelable("ARG_FILM", film)
            fragment.arguments = bundle
            return fragment

        }
    }
}