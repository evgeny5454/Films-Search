package ru.geekbrains.filmsearch.ui.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toolbar
import androidx.core.os.persistableBundleOf
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import ru.geekbrains.filmsearch.R
import ru.geekbrains.filmsearch.domain.Film

class FilmAdapter(fragmentFilmsList: FragmentFilmsList) : RecyclerView.Adapter<FilmAdapter.FilmViewHolder>() {

    private var filmList = ArrayList<Film>()

    fun setData(toAdd: List<Film>?) {
        filmList.clear()
        if (toAdd != null) {
            filmList.addAll(toAdd)
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        val view =  LayoutInflater.from(parent.context).inflate(R.layout.item_film, parent, false) as View
        return FilmViewHolder(view)

    }

    override fun getItemCount(): Int {
        return filmList.size
    }



    inner class FilmViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var title:TextView = itemView.findViewById(R.id.title)
        var image:ImageView = itemView.findViewById(R.id.image)
    }



    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {

        var film: Film = filmList[position]
        holder.title.text = film.name
        //holder.toolbar.setTitle(R.string.app_name)

        Glide.with(holder.image)
            .load(film.imageUrl)
            .centerCrop()
            .into(holder.image)

    }
}



