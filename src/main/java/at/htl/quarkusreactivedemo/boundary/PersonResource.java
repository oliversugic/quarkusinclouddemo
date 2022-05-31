package at.htl.quarkusreactivedemo.boundary;

import at.htl.quarkusreactivedemo.control.PersonRepository;
import at.htl.quarkusreactivedemo.enitity.Person;
import io.quarkus.panache.common.Sort;
import io.smallrye.mutiny.Uni;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@Path("/person")
public class PersonResource {

    @Inject
    PersonRepository personRepository;

    @GET
    public Uni<List<Person>> getPeople() {
        return personRepository.listAll(Sort.by("name"));
    }
}
