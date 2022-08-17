package com.example.retofuncyreact.model;

public class Person {
    private Integer personId;
    private String name;
    private String lastName;

    public Person(Integer personId, String name, String lastName) {
        this.personId = personId;
        this.name = name;
        this.lastName = lastName;
    }

    //Getters y Setters
    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                '}';
    }
}
