package com.example.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.model.Owner;

public interface OwnerRepository  extends JpaRepository<Owner, Long> {
    
}
