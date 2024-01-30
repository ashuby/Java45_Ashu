package StudentApplication.SpringJPAHibernate.Repository;

import StudentApplication.SpringJPAHibernate.Model.Employee;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
