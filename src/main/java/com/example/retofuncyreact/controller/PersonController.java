package com.example.retofuncyreact.controller;

import com.example.retofuncyreact.model.Person;
import com.example.retofuncyreact.repository.IPersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

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

    @PostMapping
    public Mono<Person> regist(@RequestBody Person p){
        return personRepository.regist(p);
    }
}
