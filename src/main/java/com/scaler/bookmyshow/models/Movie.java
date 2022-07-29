package com.scaler.bookmyshow.models;

import java.util.List;

public class Movie extends BaseModel {
    private String name;
    private List<Language> languages;
    private List<Actor> actors;
    private int length;
    private double rating;
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
