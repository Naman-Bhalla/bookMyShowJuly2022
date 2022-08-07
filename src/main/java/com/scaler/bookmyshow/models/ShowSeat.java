package com.scaler.bookmyshow.models;

import javax.persistence.*;

@Entity
@Table(name = "show_seat_mapping")
public class ShowSeat extends BaseModel {
    //  SS : S
    //   1   1
    //   M    1
    @ManyToOne
    private Show show;

    //  SS : S
    //   1   1
    //   m    1
    @ManyToOne
    private Seat seat;

    @Enumerated(EnumType.STRING)
    private ShowSeatState state;

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public ShowSeatState getState() {
        return state;
    }

    public void setState(ShowSeatState state) {
        this.state = state;
    }
}

// Make a booking
// 0. Create a city
// 1. Create a theatre
// 2. Create a auditorium
//    in the thetre with seats
// 3. Create a Movie
// 4. Create a Show



// Will start at 9: 10 PM