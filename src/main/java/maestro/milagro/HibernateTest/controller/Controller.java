package maestro.milagro.HibernateTest.controller;

import lombok.Data;
import maestro.milagro.HibernateTest.model.Persons;
import maestro.milagro.HibernateTest.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
public class Controller {
    Repository repository;

    @Autowired
    public Controller(Repository repository){
        this.repository = repository;
    }

    @GetMapping("/persons/by-city")
    public String getPersonsByCity(@RequestParam String city){
        return repository.getPersonsByCity(city);
    }
}
