package maestro.milagro.HibernateTest.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonsID implements Serializable {
    private String name;
    private String surname;
    private int age;
}
