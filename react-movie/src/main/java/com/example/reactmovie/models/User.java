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

        @OneToMany
        private List<Movie> ratedMovies;

        @OneToMany
        private List<Serie> ratedSeries;

        @OneToMany
        private List<Movie> relatedMovies;

        @OneToMany
        private List<Movie> relatedSeries;
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

        public List<Movie> getRatedMovies() {
                return ratedMovies;
        }

        public void setRatedMovies(List<Movie> rated_movies) {
                this.ratedMovies = rated_movies;
        }

        public List<Serie> getRatedSeries() {
                return ratedSeries;
        }

        public void setRatedSeries(List<Serie> rated_series) {
                this.ratedSeries = rated_series;
        }

        public List<Movie> getRelatedMovies() {
                return relatedMovies;
        }

        public void setRelatedMovies(List<Movie> related_movies) {
                this.relatedMovies = related_movies;
        }

        public List<Movie> getRelatedSeries() {
                return relatedSeries;
        }

        public void setRelatedSeries(List<Movie> related_series) {
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
