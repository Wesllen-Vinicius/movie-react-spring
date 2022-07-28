package com.example.reactmovie.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByName(String name);

    Optional<User> findUserById(Integer id);

    Boolean existsByName(String name);

    Boolean existsById(Integer id);
}