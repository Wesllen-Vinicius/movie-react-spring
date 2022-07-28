package com.example.reactmovie.repository;
import com.example.reactmovie.models.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface MusicRepository extends JpaRepository<Music, Long> {
//    Optional<Music> findMusicByTitle(String name);
//
//    Optional<Music> findMusicById(Integer id);
//
//    Boolean existsByTitle(String name);
//
//    Boolean existsById(Integer id);
}
