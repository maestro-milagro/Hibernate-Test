package maestro.milagro.HibernateTest.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.Data;
import maestro.milagro.HibernateTest.model.Persons;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Persons, Long> {
    List<Persons> findByCityOfLiving(String city);

    List<Persons> findByPersonsID_AgeIsLessThan(int age);

    List<Persons> findByPersonsID_NameIgnoreCaseAndPersonsID_SurnameIgnoreCase(String name, String surname);

}
