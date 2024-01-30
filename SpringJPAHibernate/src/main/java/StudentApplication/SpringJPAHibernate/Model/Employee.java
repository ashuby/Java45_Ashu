package StudentApplication.SpringJPAHibernate.Model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name="firstname")
    private String firstName;
    @Column(name="lastname")
    private String lastName;
    @Column(name="noofchildren")
    private String noOfChildren;
    @Column(name="spouse")
    private boolean spouse;
    @Column(name="age")
    private int age;
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Address> addressList;


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", noOfChildren='" + noOfChildren + '\'' +
                ", spouse=" + spouse +
                ", age=" + age +
                ", address=" + addressList +
                '}';
    }
}