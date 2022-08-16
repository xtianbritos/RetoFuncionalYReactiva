package com.example.retofuncyreact.repository;

import com.example.retofuncyreact.model.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IPersonRepository {
    Flux<Person> list();
    Mono<Person> listById(Integer id);
    Mono<Void> delete(Integer id);
    Mono<Person> regist(Person p);
    Mono<Person> update(Person p);
}
