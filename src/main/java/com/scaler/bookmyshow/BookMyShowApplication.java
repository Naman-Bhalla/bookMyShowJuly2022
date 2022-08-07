package com.scaler.bookmyshow;

import com.scaler.bookmyshow.controllers.*;
import com.scaler.bookmyshow.dtos.CreateUserRequestDto;
import com.scaler.bookmyshow.models.Language;
import com.scaler.bookmyshow.models.SeatType;
import com.scaler.bookmyshow.models.Theatre;
import com.scaler.bookmyshow.models.User;
import com.scaler.bookmyshow.services.TheatreService;
import com.scaler.bookmyshow.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class BookMyShowApplication implements CommandLineRunner {
//    @Autowired
//    @Qualifier("apple")
//    private UserService userService;

//    @Autowired
    private UserController userController;
    private CityController cityController;
    private TheatreController theatreController;
    private ShowController showController;
    private TicketController ticketController;


    @Autowired
    public BookMyShowApplication(UserController userController,
                                 CityController cityController,
                                 TheatreController theatreController,
                                 ShowController showController,
                                 TicketController ticketController
    ) {
        this.userController = userController;
        this.cityController = cityController;
        this.theatreController = theatreController;
        this.showController = showController;
        this.ticketController = ticketController;
    }

    public static void main(String[] args) {
        SpringApplication.run(BookMyShowApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        CreateUserRequestDto requestDto = new CreateUserRequestDto();
        requestDto.setEmail("jayesh@scaler.com");

        this.userController.createUser(requestDto);
        this.cityController.addCity("Chandigarh");
        this.theatreController.createTheatre(
                "PVR",
                "ABC Road, Chandigarh",
                1L
        );

        this.theatreController.addAuditorium(1L, "Audi 1", 123);

        Map<SeatType, Integer> seatsForAudi = new HashMap<>();
        seatsForAudi.put(SeatType.VIP, 20);
        seatsForAudi.put(SeatType.GOLD, 100);

        this.theatreController.addSeats(1L, seatsForAudi);

        this.showController.createShow(
                0L,
                new Date(),
                new Date(),
                1L,
                null,
                Language.ENGLISH
        );

        this.ticketController.bookTicket(
                3L,
                List.of(44L, 45L, 46L),
                1L
        );
    }
}
