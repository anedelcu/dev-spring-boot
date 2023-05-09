package com.luv2code.springboot.demo.mycoolapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Value("${welcome.message}")
    private String welcomeMessage;
    @GetMapping("/")
    public String helloWord() {
        return welcomeMessage;
    }
}
