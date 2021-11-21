package com.niklas.testbackend.repositories;

import com.niklas.testbackend.entities.City;

import org.springframework.data.domain.*;
import org.springframework.data.repository.*;

public interface CityRepository extends CrudRepository<City, Long> {

    
	City findByNameAndStateAllIgnoringCase(String name, String state);

}