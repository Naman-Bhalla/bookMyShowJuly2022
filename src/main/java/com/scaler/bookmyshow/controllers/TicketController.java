package com.scaler.bookmyshow.controllers;

import com.scaler.bookmyshow.exceptions.ShowSeatNotAvailableException;
import com.scaler.bookmyshow.models.Ticket;
import com.scaler.bookmyshow.models.User;
import com.scaler.bookmyshow.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class TicketController {
    private TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public Ticket bookTicket(
            Long showId,
            List<Long> showSeatIds,
            Long userId
    ) throws ShowSeatNotAvailableException {
        return this.ticketService.bookTicket(showId, showSeatIds, userId);
    }
}
