package com.example.reactmovie.controllers.dto;

import com.example.reactmovie.models.Movie;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class MovieDto {

    private Integer id;
    private String original_title;
    private String imdb_id;
    private Date release_date;
    private Integer genre_id;
    private String poster_url;
    private Boolean adult_content;
    private String overview;
    private String original_language;
    private Integer vote_count;
    private String director;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    public MovieDto(Movie movie) {
        this.id = id;
        this.original_title = original_title;
        this.imdb_id = imdb_id;
        this.release_date = release_date;
        this.genre_id = genre_id;
        this.poster_url = poster_url;
        this.adult_content = adult_content;
        this.overview = overview;
        this.original_language = original_language;
        this.vote_count = vote_count;
        this.director = director;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }
    public static List<MovieDto> convert(List<Movie> movies) {
        return movies.stream().map(MovieDto::new).collect(Collectors.toList());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getImdb_id() {
        return imdb_id;
    }

    public void setImdb_id(String imdb_id) {
        this.imdb_id = imdb_id;
    }

    public Date getRelease_date() {
        return release_date;
    }

    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }

    public Integer getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(Integer genre_id) {
        this.genre_id = genre_id;
    }

    public String getPoster_url() {
        return poster_url;
    }

    public void setPoster_url(String poster_url) {
        this.poster_url = poster_url;
    }

    public Boolean getAdult_content() {
        return adult_content;
    }

    public void setAdult_content(Boolean adult_content) {
        this.adult_content = adult_content;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public Integer getVote_count() {
        return vote_count;
    }

    public void setVote_count(Integer vote_count) {
        this.vote_count = vote_count;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }
}
