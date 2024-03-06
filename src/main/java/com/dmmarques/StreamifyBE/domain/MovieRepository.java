package com.dmmarques.StreamifyBE.domain;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, String> {

    Optional<Movie> findMovieByTitle(String title);

    List<Optional<Movie>> findMoviesByGenreList(String genre);

    List<Optional<Movie>> findMoviesByRatingIsGreaterThanEqual(double rating);

}
