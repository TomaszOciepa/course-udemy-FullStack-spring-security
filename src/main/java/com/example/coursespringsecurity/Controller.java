package com.example.coursespringsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/login")
    public String login(){
        return "Zalogowano";
    }

    @GetMapping("/logout")
    public String logout(){
        return "Wylogowano";
    }
}
