package com.example.reactmovie.controllers.dto;

import com.example.reactmovie.models.Serie;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class SerieDto {

    private Integer id;
    private String title;
    private String originalTitle;
    private Integer imdbId;
    private Date releaseDate;
    private Integer genreId;
    private String posterUrl;
    private boolean adultContent;
    private String overview;
    private String originalLanguage;
    private int voteCount;
    private String director;
    private int episodeCount;
    public LocalDateTime createdAt;
    public LocalDateTime updatedAt;

    public SerieDto(Serie serie) {
        this.id = serie.getId();
        this.title = serie.getTitle();
        this.originalTitle = serie.getOriginalTitle();
        this.imdbId = serie.getImdbId();
        this.releaseDate = serie.getReleaseDate();
        this.genreId = serie.getGenreId();
        this.posterUrl = serie.getPosterUrl();
        this.adultContent = serie.isAdultContent();
        this.overview = serie.getOverview();
        this.originalLanguage = serie.getOriginalLanguage();
        this.voteCount = serie.getVoteCount();
        this.director = serie.getDirector();
        this.episodeCount = serie.getEpisodeCount();
        this.createdAt = serie.getCreatedAt();
        this.updatedAt = serie.getUpdatedAt();
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
        return originalTitle;
    }

    public void setOriginalTitle(String original_title) {
        this.originalTitle = original_title;
    }

    public Integer getImdbId() {
        return imdbId;
    }

    public void setImdbId(Integer imdb_id) {
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

    public boolean isAdultContent() {
        return adultContent;
    }

    public void setAdultContent(boolean adult_content) {
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

    public int getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(int vote_count) {
        this.voteCount = vote_count;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getEpisodeCount() {
        return episodeCount;
    }

    public void setEpisodeCount(int episode_count) {
        this.episodeCount = episode_count;
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
