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
        return movieRepository.findMovieByTitle(title);

    }


    String saveMovie(Movie movie) {
        movieRepository.save(movie);
        return movie.id;
    }

}
