package com.greetservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greetingController {

    @GetMapping("/greet")
    public String greetName(@RequestParam String name){
        return "Hello "+name+"! Welcome to the Microservices world";
    }
}
