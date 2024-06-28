package net.javaguides.computerrepairsystem.controller;

public class AuthRequest {
    private String username;
    private String password;

    // Default constructor (required for Jackson JSON parsing)
    public AuthRequest() {}

    // Getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
