package com.app.bgv.controller;

import com.app.bgv.dao.PersonRepository;
import com.app.bgv.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @PostMapping("/person")
    public ResponseEntity<String> postPersonDetails(@RequestBody Person person) {
         personRepository.save(person);
         return new ResponseEntity("Person added successfully", HttpStatus.CREATED);
    }

    @GetMapping("/personsList")
    public ResponseEntity<List> getPersonDetails() {
         List<Person> personsList = personRepository.findAll();
         return new ResponseEntity<>(personsList,HttpStatus.CREATED);
    }

    @GetMapping("/personsId")
    public ResponseEntity<Person> getPersonById(@PathVariable String id) {
        Person person = personRepository.findOne(id);
        return new ResponseEntity<>(person,HttpStatus.CREATED);
    }
}
