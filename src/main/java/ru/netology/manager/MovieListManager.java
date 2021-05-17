package ru.netology.manager;

import ru.netology.domain.Movie;

public class MovieListManager {
  private Movie[] movies = new Movie[0];
  private int moviesListNumber = 8;

  public MovieListManager(int moviesListNumber) {
    this.moviesListNumber = moviesListNumber;
  }

  public MovieListManager() {
  }

  public void addToList(Movie movie) {

    int length = movies.length+1;
    Movie[] tmp = new Movie[length];
    System.arraycopy(movies, 0, tmp, 0, movies.length);
    int lastIndex = tmp.length - 1;
    tmp[lastIndex] = movie;

    movies = tmp;

  }
  public Movie[] findAll() {
    return movies;
  }

  public Movie[] pullMovieList() {
    int count =  moviesListNumber;
    if (movies.length < count) count = movies.length;
    Movie[] list = new Movie[count];
    for (int i = 0; i <list.length; i++) {
      int index = movies.length - i - 1;
      list[i] = movies[index];
    }
    return list;
  }
}