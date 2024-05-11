package com.microservices.userService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class UserAlreadyRegisteredException extends RuntimeException {
    public UserAlreadyRegisteredException() {
        super("User already registered");
    }
}