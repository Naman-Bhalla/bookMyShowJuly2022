package com.scaler.bookmyshow.services;

import com.scaler.bookmyshow.models.*;
import com.scaler.bookmyshow.repositories.AuditoriumRepository;
import com.scaler.bookmyshow.repositories.ShowRepository;
import com.scaler.bookmyshow.repositories.ShowSeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class ShowService {
    private AuditoriumRepository auditoriumRepository;
    private ShowRepository showRepository;
    private ShowSeatRepository showSeatRepository;

    @Autowired
    public ShowService(AuditoriumRepository auditoriumRepository,
                       ShowRepository showRepository,
                       ShowSeatRepository showSeatRepository) {
        this.auditoriumRepository = auditoriumRepository;
        this.showRepository = showRepository;
        this.showSeatRepository = showSeatRepository;
    }

    public Show createShow(
            Long movieId,
            Date startTime,
            Date endTime,
            Long auditoriumId,
            Map<SeatType, Integer> seatPricing,
            Language language
    ) {
        Show show = new Show();
        show.setStartTime(startTime);
        show.setEndTime(endTime);
        show.setLanguage(language);

        Auditorium auditorium = auditoriumRepository.findById(auditoriumId).get();
        show.setAuditorium(auditorium);
        Show savedShow = showRepository.save(show);
        List<ShowSeat> savedShowSeats = new ArrayList<>();

        for (Seat seat: auditorium.getSeats()) {
            ShowSeat showSeat = new ShowSeat();
            showSeat.setShow(savedShow);
            showSeat.setSeat(seat);
            showSeat.setState(ShowSeatState.AVAILABLE);
            savedShowSeats.add(showSeatRepository.save(showSeat));
        }

        savedShow.setShowSeats(savedShowSeats);

        return showRepository.save(savedShow);
    }
}
