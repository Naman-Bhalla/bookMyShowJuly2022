package com.scaler.bookmyshow.controllers;

import com.scaler.bookmyshow.exceptions.CityNotFoundException;
import com.scaler.bookmyshow.models.City;
import com.scaler.bookmyshow.models.Theatre;
import com.scaler.bookmyshow.services.CityService;
import com.scaler.bookmyshow.services.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TheatreController {
    private TheatreService theatreService;

    @Autowired
    public TheatreController(TheatreService theatreService) {
        this.theatreService = theatreService;
    }

    public Theatre createTheatre(
            String name,
            String address,
            Long cityId
    ) {
        Theatre theatre = null;
        try {
            theatre = this.theatreService.createTheatre(name, address, cityId);
        } catch (CityNotFoundException e) {
            System.out.println("Something wrong happened");
        }

        return theatre;
    }
}
