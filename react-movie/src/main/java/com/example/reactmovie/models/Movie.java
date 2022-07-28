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
    private String originalTitle;

    @NotNull
    @NotBlank
    private String imdbId;

    @NotNull
    @NotBlank
    private Date releaseDate;

    @NotNull
    @NotBlank
    private Integer genreId;

    @NotNull
    @NotBlank
    private String posterUrl;

    @NotNull
    @NotBlank
    private Boolean adultContent;


    @NotNull
    @NotBlank
    private String overview;

    @NotNull
    @NotBlank
    private String originalLanguage;

    @NotNull
    @NotBlank
    private Integer voteCount;

    @NotBlank
    @NotNull
    private String director;

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

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
