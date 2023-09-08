package maestro.milagro.HibernateTest.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Persons {
    @EmbeddedId
    private PersonsID personsID;
    private String phone_number;
    private String city_of_living;


}
