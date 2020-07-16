package com.example.demo.Service;

import com.example.demo.DAO.User;

import java.util.ArrayList;
import java.util.List;

public interface UserService {

    public User readUser(String email);
    public User addUser(User user);
    public User updateUser(User user,String email);
    public Boolean deleteUser(String email);
    public List<User> getUsers();

}
