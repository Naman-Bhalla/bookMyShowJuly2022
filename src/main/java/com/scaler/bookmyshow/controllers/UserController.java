package com.scaler.bookmyshow.controllers;

import com.scaler.bookmyshow.dtos.CreateUserRequestDto;
import com.scaler.bookmyshow.dtos.CreateUserResponseDto;
import com.scaler.bookmyshow.models.User;
import com.scaler.bookmyshow.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
//    @Qualifier("mango")
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        System.out.printf("USER SERVICE IS BEING CALLED");
        this.userService = userService;
    }

    public CreateUserResponseDto createUser(CreateUserRequestDto request) {
        User savedUser = userService.createUser(
                request.getEmail()
        );

        CreateUserResponseDto response = new CreateUserResponseDto();
        response.setUser(savedUser);

        return response;
    }
}
