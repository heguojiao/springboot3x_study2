package com.hgj.springboot_web_rest.controller;

import com.hgj.springboot_web_rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users/{userId}")
    public String getUser(@PathVariable("userId") String userId)
    {

        return userService.getUser(userId);
    }

}
