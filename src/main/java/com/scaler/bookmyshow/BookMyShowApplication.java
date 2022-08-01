package com.scaler.bookmyshow;

import com.scaler.bookmyshow.controllers.CityController;
import com.scaler.bookmyshow.controllers.TheatreController;
import com.scaler.bookmyshow.controllers.UserController;
import com.scaler.bookmyshow.dtos.CreateUserRequestDto;
import com.scaler.bookmyshow.models.Theatre;
import com.scaler.bookmyshow.models.User;
import com.scaler.bookmyshow.services.TheatreService;
import com.scaler.bookmyshow.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookMyShowApplication implements CommandLineRunner {
//    @Autowired
//    @Qualifier("apple")
//    private UserService userService;

//    @Autowired
    private UserController userController;
    private CityController cityController;
    private TheatreController theatreController;

    @Autowired
    public BookMyShowApplication(UserController userController,
                                 CityController cityController,
                                 TheatreController theatreController
    ) {
        this.userController = userController;
        this.cityController = cityController;
        this.theatreController = theatreController;
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
    }
}
