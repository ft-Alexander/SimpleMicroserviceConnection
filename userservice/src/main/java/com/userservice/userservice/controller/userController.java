package com.userservice.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class userController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user-greet")
    public String getUserGreet(@RequestParam String name){
        String greetUrl = "http://localhost:8080/greet?name="+name;
        String greeting = restTemplate.getForObject(greetUrl, String.class);
        return greeting;
    }
}
