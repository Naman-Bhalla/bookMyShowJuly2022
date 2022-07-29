package com.scaler.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Getter
@Setter
public class Actor extends BaseModel {
    private String name;

    @ManyToMany(mappedBy = "actors")
    private List<Movie> movies;
}

// Actor: Movie
// 1    : m
// m     :  1
// m:m