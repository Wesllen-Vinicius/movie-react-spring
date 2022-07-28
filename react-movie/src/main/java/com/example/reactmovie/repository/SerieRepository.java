package com.example.reactmovie.repository;
import com.example.reactmovie.models.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface SerieRepository extends JpaRepository<Serie, Long> {
    Optional<Serie> findSerieByName(String name);

    Optional<Serie> findSerieById(Integer id);

    Boolean existsByName(String name);

    Boolean existsById(Integer id);
}
