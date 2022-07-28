package com.example.reactmovie.controllers;
import com.example.reactmovie.controllers.dto.MovieDto;
import com.example.reactmovie.models.Movie;
import com.example.reactmovie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@CrossOrigin(originPatterns = "*", maxAge = 3600)
@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @RequestMapping(value = "/movie", method = RequestMethod.GET)
    public List<MovieDto> list(String title) {
        if (title == null) {
            List<Movie> movie = movieRepository.findAll();
            return MovieDto.convert(movie);
        } else {
            List<Movie> movie = movieRepository.findByOriginalTitle(title);
            return MovieDto.convert(movie);
        }
    }

    @RequestMapping(value = "/findMovieById/{id}", method = RequestMethod.GET)
    public ResponseEntity<Movie> GetById(@PathVariable(value = "id") long id) {
        Optional<Movie> movie = movieRepository.findById(id);
        return movie.map(value -> new ResponseEntity<>(value, HttpStatus.ACCEPTED)).orElseGet(()
                -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @RequestMapping(value = "/postMovie", method = RequestMethod.POST)
    public Movie Post(@Valid @RequestBody Movie movie) {
        return movieRepository.save(movie);
    }

    @RequestMapping(value = "/putMovie/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Movie> Put(@PathVariable(value = "id") long id, @Valid @RequestBody Movie newMovie) {
        Optional<Movie> oldMovie = movieRepository.findById(id);
        if (oldMovie.isPresent()) {
            Movie movie = oldMovie.get();
            movie.setDirector(newMovie.getDirector());
            movie.setAdultContent(newMovie.getAdultContent());
            movie.setImdbId(newMovie.getImdbId());
            movie.setOriginalLanguage(newMovie.getOriginalLanguage());
            movie.setReleaseDate(newMovie.getReleaseDate());
            movie.setVoteCount(newMovie.getVoteCount());
            movie.setOverview(newMovie.getOverview());
            movie.setPosterUrl(newMovie.getPosterUrl());
            return new ResponseEntity<>(movie, HttpStatus.ACCEPTED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @RequestMapping(value = "/deleteMovie/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> Delete(@PathVariable(value = "id") long id) {
        Optional<Movie> movie = movieRepository.findById(id);
        if (movie.isPresent()) {
            movieRepository.delete(movie.get());
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
