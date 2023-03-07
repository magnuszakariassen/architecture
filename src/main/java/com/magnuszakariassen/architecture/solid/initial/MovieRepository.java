package com.magnuszakariassen.architecture.solid.initial;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieRepository {

    public List<Movie> findAll() {
        Movie inception  = new Movie("Inception", 10, "thriller");
        Movie test = new Movie("Test", 5, "drama");
        Movie test2 = new Movie("Test", 7, "unspecified");

        return List.of(inception, test, test2);
    }
}
