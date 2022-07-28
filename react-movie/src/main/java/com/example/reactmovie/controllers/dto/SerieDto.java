package com.example.reactmovie.controllers.dto;

import com.example.reactmovie.models.Serie;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class SerieDto {

    public LocalDateTime created_at;
    public LocalDateTime updated_at;
    private Integer id;
    private String title;
    private String original_title;
    private Integer imdb_id;
    private Date release_date;
    private Integer genre_id;
    private String poster_url;
    private boolean adult_content;
    private String overview;
    private String original_language;
    private int vote_count;
    private String director;
    private int episode_count;

    public SerieDto(Serie serie) {
        this.id = serie.getId();
        this.title = serie.getTitle();
        this.original_title = serie.getOriginalTitle();
        this.imdb_id = serie.getImdbId();
        this.release_date = serie.getReleaseDate();
        this.genre_id = serie.getGenreId();
        this.poster_url = serie.getPosterUrl();
        this.adult_content = serie.isAdultContent();
        this.overview = serie.getOverview();
        this.original_language = serie.getOriginalLanguage();
        this.vote_count = serie.getVoteCount();
        this.director = serie.getDirector();
        this.episode_count = serie.getEpisodeCount();
        this.created_at = serie.getCreatedAt();
        this.updated_at = serie.getUpdatedAt();
    }

    public static List<SerieDto> convert(List<Serie> series) {
        return series.stream().map(SerieDto::new).collect(Collectors.toList());
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

    public String getOriginalTitle() {
        return original_title;
    }

    public void setOriginalTitle(String original_title) {
        this.original_title = original_title;
    }

    public Integer getImdbId() {
        return imdb_id;
    }

    public void setImdbId(Integer imdb_id) {
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

    public boolean isAdultContent() {
        return adult_content;
    }

    public void setAdultContent(boolean adult_content) {
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

    public int getVoteCount() {
        return vote_count;
    }

    public void setVoteCount(int vote_count) {
        this.vote_count = vote_count;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getEpisodeCount() {
        return episode_count;
    }

    public void setEpisodeCount(int episode_count) {
        this.episode_count = episode_count;
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
