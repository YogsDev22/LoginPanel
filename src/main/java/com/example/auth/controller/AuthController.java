package com.example.auth.controller;

import com.example.auth.model.LoginRequest;
import com.example.auth.model.LoginResponse;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @PostMapping("/verify")
    public LoginResponse login(@RequestBody LoginRequest request) {
        // Contoh: Validasi username dan password
        if ("user123".equals(request.getUsername()) && "password123".equals(request.getPassword())) {
            return new LoginResponse(
                    "eyJhbGciOiJIUzI1NiIsIn",  // Contoh token JWT
                    "Login successful",
                    "2025-12-31 23:59:59"
            );
        } else {
            return new LoginResponse(null, "Invalid username or password", null);
        }
    }
}
