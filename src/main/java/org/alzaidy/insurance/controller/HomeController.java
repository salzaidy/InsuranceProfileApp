package org.alzaidy.insurance.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Insurance Profile API is running.";
    }
}
