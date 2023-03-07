package com.magnuszakariassen.architecture.solid.refactored;

import com.magnuszakariassen.architecture.solid.initial.Movie;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieRepository {
    public List<Movie> findAll() {
        Movie inception  = new Movie("Inception", 10, "thriller");
        Movie test = new Movie("Test", 1, "drama");
        Movie test2 = new Movie("Test", 1, "unspecified");

        return List.of(inception, test, test2);
    }
}
