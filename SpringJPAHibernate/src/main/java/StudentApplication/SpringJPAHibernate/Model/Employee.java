package StudentApplication.SpringJPAHibernate.Model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

//  We are declaring it as Entity so that spring will understand this as Entity
@Entity
// Table will be created having table name employee for Employee entity
@Table(name = "employee")
//For Getter and Setters we can use Data
@Data
//@AllArgsConstructor generates a constructor requiring argument for every field in the annotated class
@AllArgsConstructor
//@NoArgsConstructor generates a constructor with no parameter
@NoArgsConstructor

public class Employee {

    //Id will be unique and primary key
    @Id
    // This will automatically generate the id even it is not given
    @GeneratedValue(strategy = GenerationType.AUTO)
    // Column name is id for id attribute
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




    // We are declaring the relationship types, no need to declare in case of onetoone
    //Cascading means, it will fetch each connection one by one and do the needful changes
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Address> addressList = new ArrayList<>();


    //Here we are overiding the tostring function
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