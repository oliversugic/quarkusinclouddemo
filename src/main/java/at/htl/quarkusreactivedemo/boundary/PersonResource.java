package at.htl.quarkusreactivedemo.boundary;

import at.htl.quarkusreactivedemo.control.PersonRepository;
import at.htl.quarkusreactivedemo.enitity.Person;
import io.quarkus.panache.common.Sort;
import io.smallrye.mutiny.Uni;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/person")
public class PersonResource {

    @Inject
    PersonRepository personRepository;

    @GET
    public List<Person> getPeople() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Max", "Mustermann"));
        people.add(new Person("Hans", "Musterfrau"));
        people.add(new Person("Peter", "Muster"));
        people.add(new Person("Franz", "Musterfrau"));
        people.add(new Person("Klaus", "Muster"));
        people.add(new Person("Karin", "Musterfrau"));
        people.add(new Person("Kerstin", "Musterfrau"));
        return people;
    }
}
