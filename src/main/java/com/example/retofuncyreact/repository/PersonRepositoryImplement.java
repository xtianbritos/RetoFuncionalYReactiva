package com.example.retofuncyreact.repository;

import com.example.retofuncyreact.controller.PersonController;
import com.example.retofuncyreact.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonRepositoryImplement implements IPersonRepository{
    private static final Logger log = LoggerFactory.getLogger(PersonController.class);

    @Override
    public Flux<Person> list() {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person(1, "Walter"));
        personList.add(new Person(2, "Jesse"));
        personList.add(new Person(3, "Saul"));
        personList.add(new Person(4, "Mike"));

        return Flux.fromIterable(personList);
    }

    @Override
    public Mono<Person> listById(Integer id) {
        return Mono.just(new Person(id, "Kim"));
    }

    @Override
    public Mono<Void> delete(Integer id) {
        return Mono.empty();
    }

    @Override
    public Mono<Person> register(Person p) {
        log.info(p.toString());
        return Mono.just(p);
    }

    @Override
    public Mono<Person> update(Person p) {
        log.info(p.toString());
        return Mono.just(p);
    }
}
