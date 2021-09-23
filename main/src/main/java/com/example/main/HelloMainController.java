package com.example.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMainController {

    @GetMapping("/helloMain")
    public String hello() {
        return "Hello main";
    }
}
