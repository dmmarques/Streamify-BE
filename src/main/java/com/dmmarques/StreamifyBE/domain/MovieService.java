package com.dmmarques.StreamifyBE.domain;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class MovieService {

    private final MovieRepository movieRepository;

    List<Movie> fetchAllMovies() {
        log.info("Fetching all movies ...");
        return movieRepository.findAll();
    }

    Optional<Movie> findMovieByTitle(String title) {
        log.info("Fetching movies by Title: {}", title);
        return movieRepository.findMovieByTitle(title);
    }

    List<Optional<Movie>> findMoviesByGenre(String genre) {
        log.info("Fetching movie by Genre: {}", genre);
        return movieRepository.findMoviesByGenreList(genre);
    }

    List<Optional<Movie>> findMoviesByRating(String incRating) {
        log.info("Fetching movie by Rating: {}", incRating);
        return movieRepository.findMoviesByRatingIsGreaterThanEqual(Double.parseDouble(incRating));
    }

    String saveMovie(Movie movie) {
        movieRepository.save(movie);
        return movie.id;
    }

}
