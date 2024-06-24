
package com.example.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.model.Property;

public interface PropertyRepository  extends JpaRepository<Property, String> {
    
}
