

//package com.example.demo.repository;

import com.example.demo.model.DummyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DummyRepository extends JpaRepository<DummyEntity, Long> {
    // Custom queries (if needed) can be added here
}