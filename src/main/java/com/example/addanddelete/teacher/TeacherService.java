package com.example.addanddelete.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository repo;

    public List<Teacher> lissAll(){
        return (List<Teacher>) repo.findAll();
    }
}
