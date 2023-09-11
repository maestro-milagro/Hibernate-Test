package maestro.milagro.HibernateTest.service;

import lombok.Data;
import maestro.milagro.HibernateTest.model.Persons;
import maestro.milagro.HibernateTest.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
@Data
public class Service {
    private final Repository repository;
    @Autowired
    public Service(Repository repository){
        this.repository = repository;
    }

    public String findByCityOfLiving(String city){
        if(repository.findByCityOfLivin(city).isEmpty()){
            return "No person found with this city";
        }
        return repository.findByCityOfLivin(city).toString();
    }

    public String findByPersonsID_AgeIsLessThan(int age){
        if(repository.findByPersonsID_AgeIsLessThan(age).isEmpty()){
            return "No person of this age found";
        }
        return repository.findByPersonsID_AgeIsLessThan(age).toString();
    }

    public String findByPersonsID_NameIgnoreCaseAndPersonsID_SurnameIgnoreCase(String name, String surname){
        if (repository.findByPersonsID_NameIgnoreCaseAndPersonsID_SurnameIgnoreCase(name, surname).isEmpty()){
            return "No person found with this name and surname";
        }
        return repository.findByPersonsID_NameIgnoreCaseAndPersonsID_SurnameIgnoreCase(name, surname).toString();
    }
}
