package org.alzaidy.insurance.controller;

import org.alzaidy.insurance.model.Profile;
import org.alzaidy.insurance.repository.ProfileRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/profiles")
@CrossOrigin(origins = "http://localhost:3000")
public class ProfileController {

    private final ProfileRepository repository;

    public ProfileController(ProfileRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<String> createProfile(@RequestBody Profile profile) {
        profile.setUuid(UUID.randomUUID().toString());
        repository.save(profile);
        return ResponseEntity.ok(profile.getUuid());
    }

    @GetMapping("/{uuid}")
    public ResponseEntity<Profile> getProfile(@PathVariable String uuid) {
        return repository.findByUuid(uuid)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
