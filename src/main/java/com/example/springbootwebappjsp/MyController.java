package com.example.springbootwebappjsp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping("/")
    public String getRoot(){
        return "index";
    }
    @GetMapping("/list_contact")
    public String to_contact(Model model){
        ContactBusiness business = new ContactBusiness();
        model.addAttribute("contacts",business.getContactList());
        return "contact";
    }
    @GetMapping("list_student")
    public String to_student(Model model){
        StudentBusiness business = new StudentBusiness();
        model.addAttribute("students",business.getStudentList());
        return "student";
    }
}
