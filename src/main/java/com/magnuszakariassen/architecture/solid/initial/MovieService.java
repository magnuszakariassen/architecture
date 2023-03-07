package com.magnuszakariassen.architecture.solid.initial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping()
    public List<String> findMovies() {
        List<Movie> allMovies = movieRepository.findAll();

        List<Movie> actionMoviesWithSufficientlyHighRating = allMovies.stream()
                .filter(movie -> movie.rating() > 7)
                .filter(movie -> movie.genre().equals("thriller"))
                .toList();

        return actionMoviesWithSufficientlyHighRating.stream()
                .map(Movie::title)
                .toList();
    }

}
