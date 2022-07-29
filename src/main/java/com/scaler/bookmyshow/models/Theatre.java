package com.scaler.bookmyshow.models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Theatre extends BaseModel {
    private String name;
    private String address;

    // 1 : M
    // 1  :  1
    @OneToMany(mappedBy = "theatre")
    private List<Auditorium> auditoriums;

    // 1 : m
    // 1  :  1
    @OneToMany
    private List<Show> upcomingShows;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Auditorium> getAuditoriums() {
        return auditoriums;
    }

    public void setAuditoriums(List<Auditorium> auditoriums) {
        this.auditoriums = auditoriums;
    }

    public List<Show> getUpcomingShows() {
        return upcomingShows;
    }

    public void setUpcomingShows(List<Show> upcomingShows) {
        this.upcomingShows = upcomingShows;
    }
}
