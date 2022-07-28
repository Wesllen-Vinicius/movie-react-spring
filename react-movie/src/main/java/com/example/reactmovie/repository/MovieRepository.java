package com.example.reactmovie.repository;
import com.example.reactmovie.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    List<Movie> findByOriginalTitle(String originalTitle);

//    Optional<Movie> findMovieById(Long id);

//    Boolean existsByOriginalTitle(String name);

//    Boolean existsById(Integer id);
}
