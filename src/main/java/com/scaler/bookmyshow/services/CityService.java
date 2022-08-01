package com.scaler.bookmyshow.services;

import com.scaler.bookmyshow.models.City;
import com.scaler.bookmyshow.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    private CityRepository cityRepository;

    @Autowired
    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public City addCity(String name) {
        City newCity = new City();
        newCity.setName(name);
        return this.cityRepository.save(newCity);
    }
}
