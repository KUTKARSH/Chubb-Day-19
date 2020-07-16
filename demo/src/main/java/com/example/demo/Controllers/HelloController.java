package com.example.demo.Controllers;

import com.example.demo.DAO.User;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static UserService userService;

    @Autowired
    public HelloController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/hello")
    public User sayHello(){
        return null;
    }
}

