package com.scaler.bookmyshow.models;

import javax.persistence.*;

/**
 * For a show, for every seat type, what is the price for those seat
 * types for that show.
 * 1 : 1
 * M  :  1
 */
@Entity
@Table(name = "show_seattype_mapping")
public class ShowSeatType extends BaseModel {
    // SST : S
    // 1    : 1
    //  M    :  1
    @ManyToOne
    private Show show;

    @Enumerated(EnumType.STRING)
    private SeatType seatType;
    private double price;

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
