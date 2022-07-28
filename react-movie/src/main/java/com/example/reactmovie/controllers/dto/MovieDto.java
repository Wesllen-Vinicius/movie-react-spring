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
        this.id = movie.getId();
        this.original_title = movie.getOriginalTitle();
        this.imdb_id = movie.getImdbId();
        this.release_date = movie.getReleaseDate();
        this.genre_id = movie.getGenreId();
        this.poster_url = movie.getPosterUrl();
        this.adult_content = movie.getAdultContent();
        this.overview = movie.getOverview();
        this.original_language = movie.getOriginalLanguage();
        this.vote_count = movie.getVoteCount();
        this.director = movie.getDirector();
        this.created_at = movie.getCreatedAt();
        this.updated_at = movie.getUpdatedAt();
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

    public String getOriginalTitle() {
        return original_title;
    }

    public void setOriginalTitle(String original_title) {
        this.original_title = original_title;
    }

    public String getImdbId() {
        return imdb_id;
    }

    public void setImdbId(String imdb_id) {
        this.imdb_id = imdb_id;
    }

    public Date getReleaseDate() {
        return release_date;
    }

    public void setReleaseDate(Date release_date) {
        this.release_date = release_date;
    }

    public Integer getGenreId() {
        return genre_id;
    }

    public void setGenreId(Integer genre_id) {
        this.genre_id = genre_id;
    }

    public String getPosterUrl() {
        return poster_url;
    }

    public void setPosterUrl(String poster_url) {
        this.poster_url = poster_url;
    }

    public Boolean getAdultContent() {
        return adult_content;
    }

    public void setAdultContent(Boolean adult_content) {
        this.adult_content = adult_content;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getOriginalLanguage() {
        return original_language;
    }

    public void setOriginalLanguage(String original_language) {
        this.original_language = original_language;
    }

    public Integer getVoteCount() {
        return vote_count;
    }

    public void setVoteCount(Integer vote_count) {
        this.vote_count = vote_count;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
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
