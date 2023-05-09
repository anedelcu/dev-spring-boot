package com.luv2code.springboot.demo.mycoolapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    // inject properties for: coach:name and team: name

    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private  String teamName;

    // expose new endpoint "team info"
    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach: " + coachName + ", Team Name: " + teamName;
    }

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

    @PostMapping("/fortune")
    public String addFortune(@RequestBody String fortune) {
        return fortune + " created";
    }

    // bla bla bla

    // just ckecking
}
