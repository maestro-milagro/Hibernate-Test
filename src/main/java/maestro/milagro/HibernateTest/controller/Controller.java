package maestro.milagro.HibernateTest.controller;

import lombok.Data;
import maestro.milagro.HibernateTest.model.Persons;
import maestro.milagro.HibernateTest.repository.Repository;
import maestro.milagro.HibernateTest.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
public class Controller {
    Service service;

    @Autowired
    public Controller(Service service){
        this.service = service;
    }

    @GetMapping("/persons/by-city")
    public String getPersonsByCity(@RequestParam String city){
        return service.findByCityOfLiving(city);
    }

    @GetMapping("/persons/by-age")
    public String getPersonsByAge(@RequestParam int age){
        return service.findByPersonsID_AgeIsLessThan(age);
    }

    @GetMapping("/persons/by-name_and_age")
    public String getPersonsByAge(@RequestParam String name, @RequestParam String surname){
        return service.findByPersonsID_NameIgnoreCaseAndPersonsID_SurnameIgnoreCase(name, surname);
    }
}
