package com.example.addanddelete.group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;
@Controller
public class GroupController {
    @Autowired
    private GroupServices services;

    @GetMapping("/groups")
    public String showGroupList(Model model){
        List<Group> listGroups = services.lissAll();
        model.addAttribute("listGroups",listGroups);
        return "groups";
    }
}
