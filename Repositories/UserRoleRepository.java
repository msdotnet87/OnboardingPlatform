package pl.msi.Repositories;

import org.springframework.data.repository.CrudRepository;
import pl.msi.Entity.User;
import pl.msi.Entity.UserRole;

public interface UserRoleRepository extends CrudRepository<UserRole, Long> {
}
