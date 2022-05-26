package com.example.addanddelete.major;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MajorController {
    @Autowired
    private MajorService services;

    @GetMapping("/majors")

    public String showMajorList(Model model){
        List<Major> listMajors = services.lissAll();


        model.addAttribute("listMajors",listMajors);
        return "majors";
    }
}
