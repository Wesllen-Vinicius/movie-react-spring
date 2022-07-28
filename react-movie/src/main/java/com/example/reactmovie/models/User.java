package com.example.reactmovie.models;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;
import java.util.*;

@Entity
@Table(	name = "user",
        uniqueConstraints = {
        @UniqueConstraint(columnNames = "id"),
        @UniqueConstraint(columnNames = "name"),
        @UniqueConstraint(columnNames = "email")
})
public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @NotBlank
        @NotNull
        private String name;

        @NotNull
        @NotBlank
        private String password;

        @NotBlank
        @NotNull
        @Email
        private String email;

        @OneToMany
        private List<Movie> rated_movies;

        @OneToMany
        private List<Serie> rated_series;

        @OneToMany
        private List<Movie> related_movies;

        @OneToMany
        private List<Movie> related_series;
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

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public List<Movie> getRatedMovies() {
                return rated_movies;
        }

        public void setRatedMovies(List<Movie> rated_movies) {
                this.rated_movies = rated_movies;
        }

        public List<Serie> getRatedSeries() {
                return rated_series;
        }

        public void setRatedSeries(List<Serie> rated_series) {
                this.rated_series = rated_series;
        }

        public List<Movie> getRelatedMovies() {
                return related_movies;
        }

        public void setRelatedMovies(List<Movie> related_movies) {
                this.related_movies = related_movies;
        }

        public List<Movie> getRelatedSeries() {
                return related_series;
        }

        public void setRelatedSeries(List<Movie> related_series) {
                this.related_series = related_series;
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
