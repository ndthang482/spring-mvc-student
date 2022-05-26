package com.example.addanddelete.teacher;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TeacherController {

    @Autowired
    private TeacherService service;
    @GetMapping("/teachers")

    public String showUserList(Model model){
        List<Teacher> listTeachers = service.lissAll();
        model.addAttribute("listTeachers",listTeachers);
        return "teachers";
    }
}
