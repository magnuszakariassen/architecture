package com.magnuszakariassen.architecture.solid.refactored;

import com.magnuszakariassen.architecture.solid.initial.Movie;

import java.util.List;

public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> findMovies(String genre,
                                  int ratingThreshold) {
        List<Movie> allMovies = movieRepository.findAll();
        return allMovies.stream()
                .filter(movie -> movie.genre().equals(genre))
                .filter(movie -> movie.rating() > ratingThreshold)
                .toList();
    }
}
