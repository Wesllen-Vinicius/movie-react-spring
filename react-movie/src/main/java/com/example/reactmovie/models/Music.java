package com.example.reactmovie.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "music",
        uniqueConstraints = {
        @UniqueConstraint(columnNames = "id")
        })
public class Music {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @NotBlank
    private String title;

    @NotNull
    @NotBlank
    private Date release_date;

    @NotNull
    @NotBlank
    private Integer genre_id;

    @NotNull
    @NotBlank
    private String language;

    @NotNull
    @NotBlank
    private String poster_url;

    @NotNull
    @NotBlank
    private int vote_count;

    @NotNull
    @NotBlank
    private boolean adult_content;

    @NotNull
    @NotBlank
    private String author;

    @NotNull
    @NotBlank
    private String duration;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPosterUrl() {
        return poster_url;
    }

    public void setPosterUrl(String poster_url) {
        this.poster_url = poster_url;
    }

    public int getVoteCount() {
        return vote_count;
    }

    public void setVoteCount(int vote_count) {
        this.vote_count = vote_count;
    }

    public boolean isAdultContent() {
        return adult_content;
    }

    public void setAdultContent(boolean adult_content) {
        this.adult_content = adult_content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
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
