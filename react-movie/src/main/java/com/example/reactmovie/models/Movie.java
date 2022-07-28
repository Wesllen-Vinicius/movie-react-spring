package com.example.reactmovie.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "movie",
        uniqueConstraints = {
        @UniqueConstraint(columnNames = "id")
        })
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @NotBlank
    private String original_title;

    @NotNull
    @NotBlank
    private String imdb_id;

    @NotNull
    @NotBlank
    private Date release_date;

    @NotNull
    @NotBlank
    private Integer genre_id;

    @NotNull
    @NotBlank
    private String poster_url;

    @NotNull
    @NotBlank
    private Boolean adult_content;

    @NotNull
    @NotBlank
    private String overview;

    @NotNull
    @NotBlank
    private String original_language;

    @NotNull
    @NotBlank
    private Integer vote_count;

    @NotBlank
    @NotNull
    private String director;

    @CreatedDate
    private LocalDateTime created_at;

    @LastModifiedDate
    private LocalDateTime updated_at;

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
