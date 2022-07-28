package com.example.reactmovie.controllers.dto;

import com.example.reactmovie.models.Movie;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class MovieDto {

    private Integer id;
    private String originalTitle;
    private String imdbId;
    private Date releaseDate;
    private Integer genreId;
    private String posterUrl;
    private Boolean adultContent;
    private String overview;
    private String originalLanguage;
    private Integer voteCount;
    private String director;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public MovieDto(Movie movie) {
        this.id = movie.getId();
        this.originalTitle = movie.getOriginalTitle();
        this.imdbId = movie.getImdbId();
        this.releaseDate = movie.getReleaseDate();
        this.genreId = movie.getGenreId();
        this.posterUrl = movie.getPosterUrl();
        this.adultContent = movie.getAdultContent();
        this.overview = movie.getOverview();
        this.originalLanguage = movie.getOriginalLanguage();
        this.voteCount = movie.getVoteCount();
        this.director = movie.getDirector();
        this.createdAt = movie.getCreatedAt();
        this.updatedAt = movie.getUpdatedAt();
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
        return originalTitle;
    }

    public void setOriginalTitle(String original_title) {
        this.originalTitle = original_title;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdb_id) {
        this.imdbId = imdb_id;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date release_date) {
        this.releaseDate = release_date;
    }

    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genre_id) {
        this.genreId = genre_id;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String poster_url) {
        this.posterUrl = poster_url;
    }

    public Boolean getAdultContent() {
        return adultContent;
    }

    public void setAdultContent(Boolean adult_content) {
        this.adultContent = adult_content;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String original_language) {
        this.originalLanguage = original_language;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer vote_count) {
        this.voteCount = vote_count;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
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
