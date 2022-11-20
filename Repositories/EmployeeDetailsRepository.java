package pl.msi.Repositories;

import org.springframework.data.repository.CrudRepository;
import pl.msi.Entity.EmployeeDetails;
import pl.msi.Entity.User;

public interface EmployeeDetailsRepository extends CrudRepository<EmployeeDetails, Long> {
}
