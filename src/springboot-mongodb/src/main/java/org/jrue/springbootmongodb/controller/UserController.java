package org.jrue.springbootmongodb.controller;

import org.jrue.springbootmongodb.model.User;
import org.jrue.springbootmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @PostMapping
    public String addDocument(@RequestBody User user) {
        userRepository.save(user);
        return "User " + user.getFirstName() + " has been saved";
    }
}
