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

        public List<Movie> getRated_movies() {
                return rated_movies;
        }

        public void setRated_movies(List<Movie> rated_movies) {
                this.rated_movies = rated_movies;
        }

        public List<Serie> getRated_series() {
                return rated_series;
        }

        public void setRated_series(List<Serie> rated_series) {
                this.rated_series = rated_series;
        }

        public List<Movie> getRelated_movies() {
                return related_movies;
        }

        public void setRelated_movies(List<Movie> related_movies) {
                this.related_movies = related_movies;
        }

        public List<Movie> getRelated_series() {
                return related_series;
        }

        public void setRelated_series(List<Movie> related_series) {
                this.related_series = related_series;
        }

        public LocalDateTime getCreated_at() {
                return created_at;
        }

        public void setCreated_at(LocalDateTime created_at) {
                this.created_at = created_at;
        }

        public LocalDateTime getUpdated_at() {
                return updated_at;
        }

        public void setUpdated_at(LocalDateTime updated_at) {
                this.updated_at = updated_at;
        }
}
