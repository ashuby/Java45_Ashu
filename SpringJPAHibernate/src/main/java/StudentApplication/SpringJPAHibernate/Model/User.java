package StudentApplication.SpringJPAHibernate.Model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="person")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User  {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "firstname")
    private String name;

    @Column(name = "lastname")
    private String surname;

    @Column(name = "job")
    private String profession;

    @Column(name = "age")
    private int age;

    @Column(name = "work")
    private boolean work;
}
