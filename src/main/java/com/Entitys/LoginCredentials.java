package com.Entitys;

import jakarta.persistence.*;

@Entity  // Marks this class as a Hibernate entity
@Table(name = "login_credentials") // Custom table name in DB
public class LoginCredentials {

    @Id  // Marks this field as Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment strategy
    private Long id;

    @Column(name = "username", nullable = false, unique = true, length = 50) // Column mapping with constraints
    private String username;

    @Column(name = "password", nullable = false, length = 100)
    private String pass;

    // Default constructor (required by Hibernate)
    public LoginCredentials() {}

    // Getters and Setters
    public Long getId() { 
        return id; 
    }

    public void setId(Long id) { 
        this.id = id; 
    }

    public String getUsername() { 
        return username; 
    }

    public void setUsername(String username) { 
        this.username = username; 
    }

    public String getPass() { 
        return pass; 
    }

    public void setPass(String pass) { 
        this.pass = pass; 
    }
}
