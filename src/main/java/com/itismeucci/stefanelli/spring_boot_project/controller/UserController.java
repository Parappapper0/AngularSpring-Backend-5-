package com.itismeucci.stefanelli.spring_boot_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itismeucci.stefanelli.spring_boot_project.model.Utente;
import com.itismeucci.stefanelli.spring_boot_project.model.Valid;
import com.itismeucci.stefanelli.spring_boot_project.repo.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {
    
    @Autowired
    UserRepository userRepository;

    @PostMapping("login")
    public Valid loginRequest(@RequestBody Utente u) {

        Valid valid = new Valid();
        valid.setValid(!userRepository.findByUsernameAndPassword(u.getUsername(), u.getPassword()).isEmpty());
        return valid;
    }

    @PostMapping("register")
    public Utente registerRequest(@RequestBody Utente u) {
        return userRepository.save(u);
    }
}
