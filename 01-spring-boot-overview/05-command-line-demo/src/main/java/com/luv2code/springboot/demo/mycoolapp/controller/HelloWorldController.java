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
    // expose new endpoint for workout
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day!!!";
    }

    // just ckecking
}
