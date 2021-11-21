package com.niklas.testbackend.controllers;

import java.util.List;

import com.niklas.testbackend.entities.City;
import com.niklas.testbackend.repositories.CityRepository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;  

@RestController
public class CityController {
    @Autowired
    CityRepository repository;

    public CityController() {}
  
    @GetMapping("/cities")
    Iterable<City> all() {
        return repository.findAll();
    }
  
    @PostMapping("/cities")
    City newCity(@RequestBody City newCity) {
        return repository.save(newCity);
    }

}
