package com.example.retofuncyreact.repository;

import com.example.retofuncyreact.model.Person;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class PersonRepositoryImplement implements IPersonRepository{
    @Override
    public Flux<Person> list() {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person(1, "Walter", "White"));
        personList.add(new Person(2, "Jesse", "Pinkman"));
        personList.add(new Person(3, "Jimmy", "McGill"));
        personList.add(new Person(4, "Mike", "Ehrmantraut"));
        personList.add(new Person(5, "Gustavo", "Fring"));

        return Flux.fromIterable(personList);
    }

    @Override
    public Mono<Person> listById(Integer id) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person(1, "Walter", "White"));
        personList.add(new Person(2, "Jesse", "Pinkman"));
        personList.add(new Person(3, "Jimmy", "McGill"));
        personList.add(new Person(4, "Mike", "Ehrmantraut"));
        personList.add(new Person(5, "Gustavo", "Fring"));

        Person personSearched = personList.stream()
                .reduce((person, person2) -> person.getPersonId().equals(id)?
                        person : person2).get();

        return Mono.just(personSearched);
    }

    @Override
    public Mono<Void> delete(Integer id) {
        return Mono.empty();
    }

    @Override
    public Mono<Person> register(Person p) {
        return Mono.just(p);
    }

    @Override
    public Mono<Person> update(Person p) {
        return Mono.just(p);
    }
}
