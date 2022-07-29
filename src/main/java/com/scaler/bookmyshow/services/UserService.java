package com.scaler.bookmyshow.services;

import com.scaler.bookmyshow.controllers.UserController;
import com.scaler.bookmyshow.models.User;
import com.scaler.bookmyshow.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.EnumMap;

@Service
//@Qualifier("apple")
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(String email) {
        User user = new User();
        user.setEmail(email);

        User savedUser = userRepository.save(user);

        return savedUser;
    }
}
