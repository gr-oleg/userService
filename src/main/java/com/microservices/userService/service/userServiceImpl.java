package com.microservices.userService.service;

import com.microservices.userService.model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServiceImpl implements userService {

    @Autowired
    private com.microservices.userService.repository.userRepository userRepository;

    @Override
    public user saveUser(user user) {
        return userRepository.save(user);
    }

    @Override
    public List<user> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public user findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

}