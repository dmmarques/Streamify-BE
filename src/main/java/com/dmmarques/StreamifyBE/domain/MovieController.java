package com.dmmarques.StreamifyBE.domain;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/streamify")
public class MovieController {

    private final MovieService movieService;

    @GetMapping("/movies")
    public ResponseEntity<List<Movie>> fetchAllMovies() {
        return new ResponseEntity<>(movieService.fetchAllMovies(), HttpStatus.OK);
    }

    @GetMapping("/movie")
    public ResponseEntity<Optional<Movie>> getMovieByParam(@RequestParam String title) {
        return new ResponseEntity<>(movieService.findMovieByTitle(title), HttpStatus.OK);
    }

    @PostMapping("/movie")
    public ResponseEntity<String> saveMovie(@RequestBody @Valid Movie movie) {
        String id = movieService.saveMovie(movie);
        return new ResponseEntity<>(id, HttpStatus.CREATED);
    }

}
