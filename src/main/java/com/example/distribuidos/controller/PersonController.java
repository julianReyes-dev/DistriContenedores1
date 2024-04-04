package com.example.distribuidos.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.distribuidos.model.Person;

@RestController
@RequestMapping("/person")
public class PersonController {

    @GetMapping()    
    public Person Person() {
        Person person = new Person();
        person.setName("Name1");
        person.setLastName("LastName1");
        return person;
    }
    
}
