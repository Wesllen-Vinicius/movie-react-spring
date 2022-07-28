package com.example.reactmovie.repository;
import com.example.reactmovie.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findUserByName(String name);

    Optional<User> findUserById(Long id);

    Boolean existsByName(String name);

    Boolean existsById(Integer id);
}
