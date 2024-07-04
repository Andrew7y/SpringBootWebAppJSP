package com.example.springbootwebappjsp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactController {
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
}
