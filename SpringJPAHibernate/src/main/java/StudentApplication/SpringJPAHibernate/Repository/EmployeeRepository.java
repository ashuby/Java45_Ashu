package StudentApplication.SpringJPAHibernate.Repository;

import StudentApplication.SpringJPAHibernate.Model.Employee;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//we are declaring it as repository, so that spring will specify it's a repo
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
