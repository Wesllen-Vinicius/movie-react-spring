package com.example.reactmovie.controllers.dto;

import com.example.reactmovie.models.Genre;

import java.util.List;
import java.util.stream.Collectors;

public class GenreDto {

    private Integer id;
    private String name;
    private String description;

    public GenreDto(Genre genre) {
        this.id = genre.getId();
        this.name = genre.getName();
        this.description = genre.getDescription();
    }

    public static List<GenreDto> convert(List<Genre> genres) {
        return genres.stream().map(GenreDto::new).collect(Collectors.toList());
    }


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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
