//package com.example.demo.service;

import com.example.demo.model.DummyEntity;
import com.example.demo.repository.DummyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DummyService {

    private final DummyRepository dummyRepository;

    @Autowired
    public DummyService(DummyRepository dummyRepository) {
        this.dummyRepository = dummyRepository;
    }

    public Optional<DummyEntity> getDummyRecord(Long id) {
        return dummyRepository.findById(id);
    }
}
