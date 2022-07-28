package com.example.reactmovie.repository;
import com.example.reactmovie.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    Optional<Movie> findMovieByName(String name);

    Optional<Movie> findMovieById(Integer id);

    Boolean existsByName(String name);

    Boolean existsById(Integer id);
}
