package StudentApplication.SpringJPAHibernate.Controllers;


import StudentApplication.SpringJPAHibernate.Model.Employee;
import StudentApplication.SpringJPAHibernate.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//RestController annotation is used to create RESTful web services using Spring MVC
@RestController
// We are mapping whatever the request is coming through /employee, we are serving here
@RequestMapping("/employee")
public class EmployeeController {

    //@Autowired annotation to indicate which constructor Spring should use for dependency injection
    @Autowired
    EmployeeRepository employeeRepoObj;

    //Here we are using it because we are sending some body, thats why we are using POST
    @PostMapping("/signup")
    public Employee saveEmployee(@RequestBody Employee obj) {
        Employee employeeResponse = employeeRepoObj.save(obj);

        return employeeResponse;
    }

}