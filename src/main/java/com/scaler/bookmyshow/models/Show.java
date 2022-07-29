package com.scaler.bookmyshow.models;

import java.util.Date;
import java.util.List;

public class Show extends BaseModel {
    private Movie movie;
    private Date startTime;
    private Date endTime;
    private Auditorium auditorium;
    private List<ShowSeat> showSeats;
    private List<ShowSeatType> showSeatTypes;
    private Language language;

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
