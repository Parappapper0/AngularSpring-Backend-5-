package com.itismeucci.stefanelli.spring_boot_project.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itismeucci.stefanelli.spring_boot_project.model.Utente;

public interface UserRepository extends JpaRepository<Utente, Long> {
    
    List<Utente> findByUsernameAndPassword(String username, String password);
}
