package com.example.spring.service;

import java.util.List;

import com.example.spring.model.Property;

public interface PropertyService {
 public List<Property> getAll();
 public void add(Property owner);
 public void update(Property owner);
 public void delete(String id);
 public Property findById(String id);
}
