package com.example.addanddelete.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService services;

    @GetMapping("/students")

    public String showUserList(Model model){
        List<Student> listStudents = services.lissAll();
        model.addAttribute("listStudents",listStudents);
        return "students";
    }
}
