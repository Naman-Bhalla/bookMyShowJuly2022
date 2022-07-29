package com.scaler.bookmyshow.models;

import java.util.Date;
import java.util.List;

public class Ticket extends BaseModel {
    private User bookedBy;
    private Show show;
    private List<ShowSeat> showSeats;
    private double totalAmount;
    private TicketStatus ticketStatus;

    private Date timeOfBooking;

    public Date getTimeOfBooking() {
        return timeOfBooking;
    }

    public void setTimeOfBooking(Date timeOfBooking) {
        this.timeOfBooking = timeOfBooking;
    }

    public User getBookedBy() {
        return bookedBy;
    }

    public void setBookedBy(User bookedBy) {
        this.bookedBy = bookedBy;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public List<ShowSeat> getShowSeats() {
        return showSeats;
    }

    public void setShowSeats(List<ShowSeat> showSeats) {
        this.showSeats = showSeats;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public TicketStatus getBookingStatus() {
        return ticketStatus;
    }

    public void setBookingStatus(TicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public TicketStatus getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(TicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }
}

// if there is a conflict of booking, allow the request
// that is booking more seats