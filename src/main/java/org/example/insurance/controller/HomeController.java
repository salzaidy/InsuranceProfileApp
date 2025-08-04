package org.example.insurance.controller;

import org.example.insurance.model.Profile;
import org.example.insurance.repository.ProfileRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Insurance Profile API is running.";
    }
}
