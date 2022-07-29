package com.scaler.bookmyshow.dtos;

import com.scaler.bookmyshow.models.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserResponseDto {
    private User user;
}
