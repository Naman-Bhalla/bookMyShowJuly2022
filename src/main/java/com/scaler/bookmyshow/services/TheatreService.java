package com.scaler.bookmyshow.services;

import com.scaler.bookmyshow.exceptions.CityNotFoundException;
import com.scaler.bookmyshow.models.City;
import com.scaler.bookmyshow.models.Theatre;
import com.scaler.bookmyshow.repositories.CityRepository;
import com.scaler.bookmyshow.repositories.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class TheatreService {
    private TheatreRepository theatreRepository;
    private CityRepository cityRepository;

    @Autowired
    public TheatreService(TheatreRepository theatreRepository,
                          CityRepository cityRepository) {
        this.theatreRepository = theatreRepository;
        this.cityRepository = cityRepository;
    }

    public Theatre createTheatre(
            String name,
            String address,
            Long cityId
    ) throws CityNotFoundException {
        // Check if the city with that ID exists
        Optional<City> cityOptional = cityRepository.findById(cityId);
        if (cityOptional.isEmpty()) {
            throw new CityNotFoundException("No city with given ID");
        }

        // Create a theatre object
        Theatre theatre = new Theatre();
        theatre.setName(name);
        theatre.setAddress(address);

        // save it in the database
        Theatre savedTheatre = theatreRepository.save(theatre);

        // Fetch the city for the id
        City dbCity = cityOptional.get();

        // Add the theatre to the city
        if (dbCity.getTheatres() == null) {
            dbCity.setTheatres(new ArrayList<>());
        }
        dbCity.getTheatres().add(savedTheatre);

        // Update the city in the database
        this.cityRepository.save(dbCity);

        return savedTheatre;
    }
}
