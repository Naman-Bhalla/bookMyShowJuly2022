package com.scaler.bookmyshow.models;

public class ShowSeat extends BaseModel {
    private Show show;
    private Seat seat;
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
