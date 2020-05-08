package edu.andres.springtestwithjenkins.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MainController {

    @GetMapping
    public String mainController() {
        return "Hello World! Time on server is " + LocalDateTime.now();
    }
}
