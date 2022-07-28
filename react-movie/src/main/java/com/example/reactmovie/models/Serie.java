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
    private String original_title;

    @NotBlank
    @NotNull
    private Integer imdb_id;

    @NotBlank
    @NotNull
    private Date release_date;

    @NotBlank
    @NotNull
    private Integer genre_id;

    @NotBlank
    @NotNull
    private String poster_url;

    @NotBlank
    @NotNull
    private boolean adult_content;

    @NotBlank
    @NotNull
    private String overview;

    @NotBlank
    @NotNull
    private String original_language;

    @NotBlank
    @NotNull
    private int vote_count;

    @NotBlank
    @NotNull
    private String director;

    @NotBlank
    @NotNull
    private int episode_count;

    @CreatedDate
    public LocalDateTime created_at;

    @LastModifiedDate
    public LocalDateTime updated_at;

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
