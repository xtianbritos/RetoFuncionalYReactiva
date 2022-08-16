package com.example.retofuncyreact.controller;

import com.example.retofuncyreact.model.Person;
import com.example.retofuncyreact.repository.IPersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/persons")
public class PersonController {
    private static final Logger log = LoggerFactory.getLogger(PersonController.class);

    @Autowired
    private IPersonRepository personRepository;

    @GetMapping
    public Flux<Person> list(){
        return personRepository.list();
    }
}
