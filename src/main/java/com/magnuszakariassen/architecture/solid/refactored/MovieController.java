package com.magnuszakariassen.architecture.solid.refactored;

import com.magnuszakariassen.architecture.solid.initial.Movie;
import com.magnuszakariassen.architecture.solid.refactored.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/api/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping()
    public List<Movie> findMovies(@RequestParam(required = false) String genre,
                                  @RequestParam(required = false) int ratingThreshold) {
        return movieService.findMovies(genre, ratingThreshold);
    }
}
