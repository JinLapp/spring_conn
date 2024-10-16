package com.example.demo.controller;

import com.example.demo.model.DummyEntity;
import com.example.demo.service.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class DummyController {

    private final DummyService dummyService;

    @Autowired
    public DummyController(DummyService dummyService) {
        this.dummyService = dummyService;
    }

    @GetMapping("/dummy")
    public String getDummyRecord(@RequestParam Long id) {
        Optional<DummyEntity> result = dummyService.getDummyRecord(id);
        if (result.isPresent()) {
            DummyEntity entity = result.get();
            System.out.println("ID: " + entity.getColID() + ", String: " + entity.getColString());
            return "Record found: ID = " + entity.getColID() + ", String = " + entity.getColString();
        } else {
            return "No record found with ID: " + id;
        }
    }
}
