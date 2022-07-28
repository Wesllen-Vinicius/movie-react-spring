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
    private List<Movie> rated_movies;
    private List<Serie> rated_series;
    private List<Movie> related_movies;
    private List<Movie> related_series;
    public LocalDateTime created_at;
    public LocalDateTime updated_at;

    public UserDto(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.password = user.getPassword();
        this.email = user.getEmail();
        this.rated_movies = user.getRatedMovies();
        this.rated_series = user.getRatedSeries();
        this.related_movies = user.getRelatedMovies();
        this.related_series = user.getRelatedSeries();
        this.created_at = user.getCreatedAt();
        this.updated_at = user.getUpdatedAt();
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

    public List<Movie> getRatedMovies() {
        return rated_movies;
    }

    public void setRatedMovies(List<Movie> rated_movies) {
        this.rated_movies = rated_movies;
    }

    public List<Serie> getRatedSeries() {
        return rated_series;
    }

    public void setRatedSeries(List<Serie> rated_series) {
        this.rated_series = rated_series;
    }

    public List<Movie> getRelatedMovies() {
        return related_movies;
    }

    public void setRelatedMovies(List<Movie> related_movies) {
        this.related_movies = related_movies;
    }

    public List<Movie> getRelatedSeries() {
        return related_series;
    }

    public void setRelatedSeries(List<Movie> related_series) {
        this.related_series = related_series;
    }

    public LocalDateTime getCreatedAt() {
        return created_at;
    }

    public void setCreatedAt(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdatedAt() {
        return updated_at;
    }

    public void setUpdatedAt(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }
}
