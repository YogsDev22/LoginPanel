package com.example.auth.model;

public class LoginResponse {
    private String token_access;
    private String message;
    private String expiration_date;

    public LoginResponse(String token_access, String message, String expiration_date) {
        this.token_access = token_access;
        this.message = message;
        this.expiration_date = expiration_date;
    }

    // Getters
    public String getTokenAccess() { return token_access; }
    public String getMessage() { return message; }
    public String getExpirationDate() { return expiration_date; }
}
