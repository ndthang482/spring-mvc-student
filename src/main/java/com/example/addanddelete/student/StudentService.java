package com.example.addanddelete.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;

    public List<Student> lissAll(){
        return (List<Student>) repo.findAll();
    }
}
