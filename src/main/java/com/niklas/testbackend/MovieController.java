package com.niklas.testbackend;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;  

@RestController
public class MovieController {

    public MovieController() {}
  
    @GetMapping("/movies")
    List<String> all() {
        List<String> movies = new ArrayList<String>();
        movies.add("Harry Potter");
        return movies;
    }
  
}
