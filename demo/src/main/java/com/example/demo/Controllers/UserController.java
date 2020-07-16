package com.example.demo.Controllers;

import com.example.demo.DAO.User;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @RequestMapping(value = "/users/",method = RequestMethod.GET)
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @RequestMapping(value = "/user/",method = RequestMethod.POST)
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @RequestMapping(value = "/user/{email}" ,method = RequestMethod.DELETE)
    public Boolean deleteUser(@PathVariable String email){
        return userService.deleteUser(email);
    }

    @RequestMapping(value = "/user/{email}",method = RequestMethod.PUT)
    public User updateUser(@RequestBody User user,@PathVariable String email){
        return userService.updateUser(user,email);
    }

    @RequestMapping(value = "/user/{email}" ,method = RequestMethod.GET)
    public User readUser(@PathVariable String email){
        return userService.readUser(email);
    }

}
