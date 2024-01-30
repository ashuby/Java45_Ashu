package StudentApplication.SpringJPAHibernate.Controllers;


import StudentApplication.SpringJPAHibernate.Model.Employee;
import StudentApplication.SpringJPAHibernate.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepoObj;

    @PostMapping("/signup")
    public Employee saveEmployee(@RequestBody Employee obj) {
        Employee employeeResponse = employeeRepoObj.save(obj);

        return employeeResponse;
    }

}