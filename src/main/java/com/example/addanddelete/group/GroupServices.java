package com.example.addanddelete.group;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServices {

    @Autowired private GroupRepository repo;

    public List<Group> lissAll(){
        return (List<Group>) repo.findAll();
    }
}
