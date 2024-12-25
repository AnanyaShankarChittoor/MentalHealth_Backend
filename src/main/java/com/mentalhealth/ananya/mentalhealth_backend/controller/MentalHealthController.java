package com.mentalhealth.ananya.mentalhealth_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class MentalHealthController {

    @GetMapping("/api/v1/resources")
    public List<String> getMentalHealthResources() {
        // Sample resources
        return List.of("Resource 1", "Resource 2", "Resource 3");
    }

    @PostMapping("/api/v1/chat")
    public String chatWithBot(@RequestBody String userMessage) {
        // Simple bot logic 
        // (can be enhanced later)
        return "You said: " + userMessage + ". How can I help you?";
    }
}
