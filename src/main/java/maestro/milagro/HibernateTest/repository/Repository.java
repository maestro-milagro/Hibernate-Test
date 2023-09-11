package maestro.milagro.HibernateTest.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.Data;
import maestro.milagro.HibernateTest.model.Persons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Persons, Long> {
    @Query("select p from Persons p where p.cityOfLiving = :city")
    List<Persons> findByCityOfLivin(@Param("city") String city);
    @Query(value = "select * from Persons p where p.age < ?1", nativeQuery = true)
    List<Persons> findByPersonsID_AgeIsLessThan(int age);
    @Query(value = "select * from Persons p where Lower(p.name) = Lower(?1) and Lower(p.surname) = Lower(?2)", nativeQuery = true)
    List<Persons> findByPersonsID_NameIgnoreCaseAndPersonsID_SurnameIgnoreCase(String name, String surname);

}
