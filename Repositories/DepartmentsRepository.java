package pl.msi.Repositories;

import org.springframework.data.repository.CrudRepository;
import pl.msi.Entity.Departments;
import pl.msi.Entity.User;

public interface DepartmentsRepository extends CrudRepository<Departments, Long> {
}
