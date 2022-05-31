package at.htl.quarkusreactivedemo.control;

import at.htl.quarkusreactivedemo.enitity.Person;
import io.quarkus.hibernate.reactive.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class PersonRepository implements PanacheRepository<Person>  {


}
