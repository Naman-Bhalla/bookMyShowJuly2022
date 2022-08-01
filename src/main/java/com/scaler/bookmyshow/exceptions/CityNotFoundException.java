package com.scaler.bookmyshow.exceptions;

import com.scaler.bookmyshow.models.City;

public class CityNotFoundException extends Exception {

    public CityNotFoundException(String message) {
        super(message);
    }
}
