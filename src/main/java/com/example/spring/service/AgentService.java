package com.example.spring.service;

import java.util.List;

import com.example.spring.model.Agent;

public interface AgentService {
 public List<Agent> getAll();
 public void add(Agent agent);
 public void update(Agent agent);
 public void delete(Long id);
 public Agent findById(Long id);
}
