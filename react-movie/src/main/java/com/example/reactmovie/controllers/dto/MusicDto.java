package com.example.reactmovie.controllers.dto;

import com.example.reactmovie.models.Music;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class MusicDto {

    private Integer id;
    private String title;
    private Date releaseDate;
    private Integer genreId;
    private String language;
    private String posterUrl;
    private int voteCount;
    private boolean adultContent;
    private String author;
    private String duration;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public MusicDto(Music music) {
        this.id = music.getId();
        this.title = music.getTitle();
        this.releaseDate = music.getReleaseDate();
        this.genreId = music.getGenreId();
        this.language = music.getLanguage();
        this.posterUrl = music.getPosterUrl();
        this.voteCount = music.getVoteCount();
        this.adultContent = music.isAdultContent();
        this.author = music.getAuthor();
        this.duration = music.getDuration();
        this.createdAt = music.getCreatedAt();
        this.updatedAt = music.getUpdatedAt();
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
