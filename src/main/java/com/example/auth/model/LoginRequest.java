package com.example.auth.model;

public class LoginRequest {
    private String username;
    private String password;
    private String game;
    private String uuid;
    private String version;
    private String hex;
    private String publickey;

    // Getters dan Setters
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getGame() { return game; }
    public void setGame(String game) { this.game = game; }

    public String getUuid() { return uuid; }
    public void setUuid(String uuid) { this.uuid = uuid; }

    public String getVersion() { return version; }
    public void setVersion(String version) { this.version = version; }

    public String getHex() { return hex; }
    public void setHex(String hex) { this.hex = hex; }

    public String getPublickey() { return publickey; }
    public void setPublickey(String publickey) { this.publickey = publickey; }
}
