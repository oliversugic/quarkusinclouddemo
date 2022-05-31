package at.htl.quarkusreactivedemo.control;

import at.htl.quarkusreactivedemo.enitity.Person;

import java.util.ArrayList;
import java.util.List;

public class InitBean {
    public static void main(String[] args) {
        PersonRepository personRepository = new PersonRepository();
        List<Person> people = new ArrayList<>();
        people.add(new Person("Max", "Mustermann"));
        people.add(new Person("Hans", "Musterfrau"));
        people.add(new Person("Peter", "Muster"));
        people.add(new Person("Franz", "Musterfrau"));
        people.add(new Person("Klaus", "Muster"));
        people.add(new Person("Karin", "Musterfrau"));
        people.add(new Person("Kerstin", "Musterfrau"));
    }
}