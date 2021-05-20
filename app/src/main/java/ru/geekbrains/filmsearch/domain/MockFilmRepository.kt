package ru.geekbrains.filmsearch.domain

class MockFilmRepository {

    fun getFilmsList(): MutableList<Film> {
        val films: MutableList<Film> = mutableListOf()

        films.add(Film("Киборг убийца","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRo0Daz2gpM_TM-q4aKU820HH94gM6FbuKgJQ&usqp=CAU"))
        films.add(Film("О Н И","https://vokrug.tv/pic/product/c/0/e/e/c0ee1454e38f5e7b4a5f341dbb9b95ee.jpg"))
        films.add(Film("Хепи-Энд ","https://upload.wikimedia.org/wikipedia/ru/thumb/1/1e/Happy_end_film_poster.jpg/1200px-Happy_end_film_poster.jpg"))
        films.add(Film("Спутник","https://static.mk.ru/upload/entities/2020/04/29/21/articles/detailPicture/1e/f5/01/9f/5b63adea20a506e7ffe4ebc7d750585d.jpg"))
        films.add(Film("Хатико","https://www.megacritic.ru/media/reviews/photos/thumbnail/640x640s/9e/00/d5/982_poster_1253603681.jpg"))
        films.add(Film("ГНЕВ","https://avatars.mds.yandex.net/get-kinopoisk-image/4774061/f3be8b0b-456c-4499-a4f3-79e1fee1ae3a/360"))
        films.add(Film("Холодное сердце 2","https://cdn.disney.ru/assets/w398/0cb99a62-abf9-4472-b2e7-d3c1cd8da27e.webp"))
        films.add(Film("Белый тигр","https://cinema.mosfilm.ru/upload/resize_cache/iblock/794/634_422_1/7947fac202c972e12063adab4d5c988c.jpg"))
        films.add(Film("Асоциальная сеть","https://www.film.ru/sites/default/files/styles/thumb_260x400/public/movies/posters/49454358-1429827.jpg"))
        films.add(Film("Звездные войны","https://starwars.ru/media/cache/03/ca/03ca297f4e478d0f68fbe96bfbce3450.png"))
        films.add(Film("МАША","https://www.kino-teatr.ru/movie/posters/big/8/130638.jpg"))
        films.add(Film("Эскорт","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSZve_WOWQKUm8mWKI4QqssZQzI1PR3384cTQ&usqp=CAU"))
        return films
    }
}