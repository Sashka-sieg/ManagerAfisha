package ru.netology.manager;

import ru.netology.domain.Movie;

public class PosterManager {
    private Movie[] poster = new Movie[0];
    private int quantityFilm =10;

    public PosterManager(){

    }

    public PosterManager(int quantityFilm) {
        this.quantityFilm = quantityFilm;
    }

    public void  add (Movie newMovies) {
        int length = poster.length +1;
        Movie[] newPoster = new Movie[length];
        for (int i =0; i< poster.length; i++){
            newPoster [i] = poster[i];
        }
        newPoster[newPoster.length - 1] = newMovies;
        poster = newPoster;

    }
    public Movie[] getLastFilms(){
        int quantity =Math.min(quantityFilm, poster.length);
        Movie[] result =new Movie[quantity];
        for (int i=0; i<quantity; i++){
            int index = poster.length-1-i;
            result[i]=poster[index];
        }
        return result;
    }
}
