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
    private Date releaseDate;

    @NotNull
    @NotBlank
    private Integer genreId;

    @NotNull
    @NotBlank
    private String language;

    @NotNull
    @NotBlank
    private String posterUrl;

    @NotNull
    @NotBlank
    private int voteCount;

    @NotNull
    @NotBlank
    private boolean adultContent;

    @NotNull
    @NotBlank
    private String author;

    @NotNull
    @NotBlank
    private String duration;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String poster_url) {
        this.posterUrl = poster_url;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int vote_count) {
        this.voteCount = vote_count;
    }

    public boolean isAdultContent() {
        return adultContent;
    }

    public void setAdultContent(boolean adult_content) {
        this.adultContent = adult_content;
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
