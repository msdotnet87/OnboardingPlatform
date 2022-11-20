package pl.msi.Repositories;

import org.springframework.data.repository.CrudRepository;
import pl.msi.Entity.Employee;
import pl.msi.Entity.User;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
