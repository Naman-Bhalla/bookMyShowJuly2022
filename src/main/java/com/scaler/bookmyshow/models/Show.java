package com.scaler.bookmyshow.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Show extends BaseModel {
//    1 : 1
//    m  :  1
    @ManyToOne
    private Movie movie;
    private Date startTime;
    private Date endTime;

    // 1 : 1
    // m  : 1
    @ManyToOne
    private Auditorium auditorium;

    // 1 : m
    // 1  :  1
    @OneToMany(mappedBy = "show")
    private List<ShowSeat> showSeats;

    //  1 : M
    //  1  :  1
    @OneToMany
    private List<ShowSeatType> showSeatTypes;

    @Enumerated(EnumType.STRING)
    private Language language;


//    @OneToMany(mappedBy = "")
//    @ManyToMany(mappedBy = "")
//    @OneToOne(mappedBy = "")
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<ShowFeature> showFeatures;

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public List<ShowFeature> getShowFeatures() {
        return showFeatures;
    }

    public void setShowFeatures(List<ShowFeature> showFeatures) {
        this.showFeatures = showFeatures;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Auditorium getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(Auditorium auditorium) {
        this.auditorium = auditorium;
    }

    public List<ShowSeat> getShowSeats() {
        return showSeats;
    }

    public void setShowSeats(List<ShowSeat> showSeats) {
        this.showSeats = showSeats;
    }

    public List<ShowSeatType> getShowSeatTypes() {
        return showSeatTypes;
    }

    public void setShowSeatTypes(List<ShowSeatType> showSeatTypes) {
        this.showSeatTypes = showSeatTypes;
    }
}
