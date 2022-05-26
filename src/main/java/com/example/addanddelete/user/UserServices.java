package com.example.addanddelete.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {
    @Autowired private  userRepository repo;

    public List<User> lissAll(){
        return (List<User>) repo.findAll();
    }
}
