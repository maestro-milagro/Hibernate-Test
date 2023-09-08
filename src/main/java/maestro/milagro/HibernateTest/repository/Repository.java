package maestro.milagro.HibernateTest.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.Data;
import maestro.milagro.HibernateTest.model.Persons;

@org.springframework.stereotype.Repository
@Data
public class Repository {
    @PersistenceContext
    private EntityManager entityManager;

    public String getPersonsByCity(String city){
//        var person = entityManager.find(Persons.class, city);
        var query = entityManager.createNativeQuery(String.format("select * from Persons where city_of_living = '%s'", city), Persons.class);
        return query.getResultList().toString();
    }

}
