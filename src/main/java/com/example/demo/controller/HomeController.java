package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
   
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home (Model model) {
        
        model.addAttribute("name", "Welcome Home");
        return "home";
    }

    @RequestMapping(value = "/ex", method = RequestMethod.GET)
    public String ex (Model model) {
        
        model.addAttribute("name", "ex");
        return "ex";
    }
}