package com.ff4j.poc.controller;

import com.ff4j.poc.domain.User;
import com.ff4j.poc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserRestController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:4200")
    public List<User> findAll() {
        return this.userService.getAllUser();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:4200")
    public User findById(@PathVariable("id") Long id) {
        return this.userService.findUserById(id);
    }



}
