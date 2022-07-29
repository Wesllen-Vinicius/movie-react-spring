package com.example.reactmovie.models;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

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

        @ManyToOne
        private Movie ratedMovies;

        @ManyToOne
        private Serie ratedSeries;

        @ManyToOne
        private Movie relatedMovies;

        @ManyToOne
        private Movie relatedSeries;
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

        public Movie getRatedMovies() {
                return ratedMovies;
        }

        public void setRatedMovies(Movie rated_movies) {
                this.ratedMovies = rated_movies;
        }

        public Serie getRatedSeries() {
                return ratedSeries;
        }

        public void setRatedSeries(Serie rated_series) {
                this.ratedSeries = rated_series;
        }

        public Movie getRelatedMovies() {
                return relatedMovies;
        }

        public void setRelatedMovies(Movie related_movies) {
                this.relatedMovies = related_movies;
        }

        public Movie getRelatedSeries() {
                return relatedSeries;
        }

        public void setRelatedSeries(Movie related_series) {
                this.relatedSeries = related_series;
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
