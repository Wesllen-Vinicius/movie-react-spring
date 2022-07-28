package com.example.reactmovie.controllers.dto;

import com.example.reactmovie.models.Music;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class MusicDto {

    private Integer id;
    private String title;
    private Date release_date;
    private Integer genre_id;
    private String language;
    private String poster_url;
    private int vote_count;
    private boolean adult_content;
    private String author;
    private String duration;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    public MusicDto(Music music) {
        this.id = music.getId();
        this.title = music.getTitle();
        this.release_date = music.getReleaseDate();
        this.genre_id = music.getGenreId();
        this.language = music.getLanguage();
        this.poster_url = music.getPosterUrl();
        this.vote_count = music.getVoteCount();
        this.adult_content = music.isAdultContent();
        this.author = music.getAuthor();
        this.duration = music.getDuration();
        this.created_at = music.getCreatedAt();
        this.updated_at = music.getUpdatedAt();
    }

    public static List<MusicDto> convert(List<Music> musics) {
        return musics.stream().map(MusicDto::new).collect(Collectors.toList());
    }

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
