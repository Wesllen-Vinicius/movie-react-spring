package com.example.reactmovie.controllers.dto;

import com.example.reactmovie.models.Movie;
import com.example.reactmovie.models.Serie;
import com.example.reactmovie.models.User;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class UserDto {

    private Integer id;
    private String name;
    private String password;
    private String email;
    private Movie ratedMovies;
    private Serie ratedSeries;
    private Movie relatedMovies;
    private Movie relatedSeries;
    public LocalDateTime createdAt;
    public LocalDateTime updatedAt;

    public UserDto(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.password = user.getPassword();
        this.email = user.getEmail();
        this.createdAt = user.getCreatedAt();
        this.updatedAt = user.getUpdatedAt();
    }

    public static List<UserDto> convert(List<User> users) {
        return users.stream().map(UserDto::new).collect(Collectors.toList());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Movie getRatedMovies() {
        return ratedMovies;
    }

    public void setRatedMovies(Movie rated_movies) {
        this.ratedMovies = rated_movies;
    }

    public Serie getRatedSeries() {
        return ratedSeries;
    }

    public void setRatedSeries(Serie rated_series) {
        this.ratedSeries = rated_series;
    }

    public Movie getRelatedMovies() {
        return relatedMovies;
    }

    public void setRelatedMovies(Movie related_movies) {
        this.relatedMovies = related_movies;
    }

    public Movie getRelatedSeries() {
        return relatedSeries;
    }

    public void setRelatedSeries(Movie related_series) {
        this.relatedSeries = related_series;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime created_at) {
        this.createdAt = created_at;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updated_at) {
        this.updatedAt = updated_at;
    }
}
