package com.neosurge.investmentinsight.controller;

import com.neosurge.investmentinsight.model.UserPreference;
import com.neosurge.investmentinsight.repository.UserPreferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/preferences")
public class UserPreferenceController {
    @Autowired
    private UserPreferenceRepository userPreferenceRepository;

    @PostMapping
    public ResponseEntity<UserPreference> savePreference(@RequestBody UserPreference preference) {
        UserPreference savedPreference = userPreferenceRepository.save(preference);
        return ResponseEntity.ok(savedPreference);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<UserPreference>> getPreferences(@PathVariable String userId) {
        List<UserPreference> preferences = userPreferenceRepository.findByUserId(userId);
        return ResponseEntity.ok(preferences);
    }
}
