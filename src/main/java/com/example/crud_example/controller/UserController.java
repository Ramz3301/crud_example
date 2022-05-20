package com.example.crud_example.controller;

import com.example.crud_example.model.User;
import com.example.crud_example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String allUsers() {
        List<User> users = userService.findAll();

        return "index.html";
    }
}
