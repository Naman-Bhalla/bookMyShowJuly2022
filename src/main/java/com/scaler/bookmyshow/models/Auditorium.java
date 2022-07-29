package com.scaler.bookmyshow.models;

import java.util.List;

public class Auditorium extends BaseModel {
    private String name;
    private List<Seat> seats;
    private int capacity;

    private List<AuditoriumFeature> auditoriumFeatures;
    private Theatre theatre;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Theatre getTheatre() {
        return theatre;
    }

    public void setTheatre(Theatre theatre) {
        this.theatre = theatre;
    }

    public List<AuditoriumFeature> getAuditoriumFeatures() {
        return auditoriumFeatures;
    }

    public void setAuditoriumFeatures(List<AuditoriumFeature> auditoriumFeatures) {
        this.auditoriumFeatures = auditoriumFeatures;
    }
}
