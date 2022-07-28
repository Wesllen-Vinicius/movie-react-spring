package com.example.reactmovie.repository;
import com.example.reactmovie.models.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface GenreRepository extends JpaRepository<Genre, Long> {
    Optional<Genre> findGenreByName(String name);

    Optional<Genre> findGenreById(Integer id);

    Boolean existsByName(String name);

    Boolean existsById(Integer id);
}
