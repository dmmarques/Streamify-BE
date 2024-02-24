package com.dmmarques.StreamifyBE.domain;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/streamify")
public class MovieController {

    private final MovieService movieService;

    @GetMapping("/movies")
    public ResponseEntity<String> fetchAllMovies() {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/movies")
    public ResponseEntity<String> getMovieByParam(@RequestParam String title,
                                                  @RequestParam double rating,
                                                  @RequestParam Genre genre) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> saveMovie(@RequestBody @Valid Movie movie) {
        movieService.saveMovie();
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
