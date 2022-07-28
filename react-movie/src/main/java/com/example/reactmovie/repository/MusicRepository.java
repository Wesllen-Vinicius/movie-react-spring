package com.example.reactmovie.repository;
import com.example.reactmovie.models.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface MusicRepository extends JpaRepository<Music, Long> {
    Optional<Music> findMusicByName(String name);

    Optional<Music> findMusicById(Integer id);

    Boolean existsByName(String name);

    Boolean existsById(Integer id);
}
