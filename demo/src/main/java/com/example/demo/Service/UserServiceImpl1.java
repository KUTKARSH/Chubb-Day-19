package com.example.demo.Service;

import com.example.demo.DAO.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl1 implements UserService {

    private static List<User> users;

    public UserServiceImpl1(){
        users = new ArrayList<>();
    }

    public List<User> getUsers(){
        return users;
    }

    @Override
    public User readUser(String email) {
        Integer searchedUserIdx = searchUser(email);
        if(searchedUserIdx != -1)
            return users.get(searchedUserIdx);
        return null;
    }

    private Integer searchUser(String email){
        int s = users.size();
        for(int i = 0; i < s ; i++)
            if(users.get(i).getEmail().equals(email))
                return i;
        return -1;
    }

    @Override
    public User addUser(User user){
        users.add(user);
        return user;
    }

    @Override
    public User updateUser(User user,String email){
        Integer searchedUserIdx = searchUser(email);
        if(searchedUserIdx == -1)
        {
            addUser(user);
            return user;
        }
        users.set(searchedUserIdx,user);
        return user;
    }

    @Override
    public Boolean deleteUser(String email){
        Integer searchedUserIdx = searchUser(email);
        if(searchedUserIdx != -1){
            users.remove(users.get(searchedUserIdx));
            return true;
        }
        return false;
    }
}
