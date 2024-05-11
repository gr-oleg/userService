package com.microservices.userService.service;

import com.microservices.userService.model.user;
import java.util.List;

public interface userService {
    public user saveUser(user user);
    List<user> getAllUsers();
    user findByEmail(String email);
}