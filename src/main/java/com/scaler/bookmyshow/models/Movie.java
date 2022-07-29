package com.scaler.bookmyshow.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Movie extends BaseModel {
    private String name;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<Language> languages;
//    1  : M
//    M   :  1
    @ManyToMany
    private List<Actor> actors;
    private int length;
    private double rating;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<MovieFeature> movieFeatures;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Actor> getCasts() {
        return actors;
    }

    public void setCasts(List<Actor> actor) {
        this.actors = actor;
    }
}
