package com.example.addanddelete.major;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MajorService {
    @Autowired
    private MajorRepository repo;

    public List<Major> lissAll(){
        return (List<Major>) repo.findAll();
    }
}
