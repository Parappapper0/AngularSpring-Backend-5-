package com.itismeucci.stefanelli.spring_boot_project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Utente {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private long id;
    private String name;
    private String surname;
    private String email;
    private String username;
    private String password;

    @Override
    public String toString() {
        return "ID: " + id + ", NAME: " + name + ", SURNAME: " + surname + ", USERNAME: " + username + ", EMAIL: " + email + ", PASSWORD: " + password;
    }
    
    public Utente() {}

    public Utente(String name, String surname, String email, String username, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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
