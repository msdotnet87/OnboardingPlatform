package pl.msi.Repositories;

import org.springframework.data.repository.CrudRepository;
import pl.msi.Entity.Manager;
import pl.msi.Entity.User;

public interface ManagerRepository extends CrudRepository<Manager, Long> {
}
