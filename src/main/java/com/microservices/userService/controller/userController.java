package com.microservices.userService.controller;

import com.microservices.userService.exception.UserNotFoundException;
import com.microservices.userService.model.user;
import com.microservices.userService.service.userService;
import com.microservices.userService.repository.userRepository;
import com.microservices.userService.exception.UserAlreadyRegisteredException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class userController {
    @Autowired
    private userService userService;

    @PostMapping("/add")
    public String add(@RequestBody user user){
        user existingUser = userService.findByEmail(user.getEmail());
        if (existingUser != null) {
            throw new UserAlreadyRegisteredException();
        }
        userService.saveUser(user);
        return "New user is added";
    }

    @GetMapping("/getAll")
    public List<user> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{email}")
    user getUserByEmail(@PathVariable String email){
        return userService.findByEmail(email);
    }

    @PutMapping("/{email}")
    public user updateUser(@RequestBody user newUser, @PathVariable String email) {
        user existingUser = userService.findByEmail(email);
        if (existingUser == null) {
            throw new UserNotFoundException(email);
        }
        existingUser.setUser(newUser.getUser());
        existingUser.setEmail(newUser.getEmail());
        return userService.saveUser(existingUser);
    }


    @Autowired
    private userRepository UserRepository;
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        UserRepository.deleteById(id);
        return "User with id " + id + " has been deleted successfully.";
    }
}