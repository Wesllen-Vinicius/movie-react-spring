package com.example.reactmovie.models;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "serie",
        uniqueConstraints = {
        @UniqueConstraint(columnNames = "id")
        })
public class Serie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    @NotNull
    private String title;

    @NotBlank
    @NotNull
    private String originalTitle;

    @NotBlank
    @NotNull
    private Integer imdbId;

    @NotBlank
    @NotNull
    private Date releaseDate;

    @NotBlank
    @NotNull
    private Integer genreId;

    @NotBlank
    @NotNull
    private String posterUrl;

    @NotBlank
    @NotNull
    private boolean adultContent;

    @NotBlank
    @NotNull
    private String overview;

    @NotBlank
    @NotNull
    private String originalLanguage;

    @NotBlank
    @NotNull
    private int voteCount;

    @NotBlank
    @NotNull
    private String director;

    @NotBlank
    @NotNull
    private int episodeCount;

    @CreatedDate
    public LocalDateTime createdAt;

    @LastModifiedDate
    public LocalDateTime updatedAt;

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
