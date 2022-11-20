package pl.msi.Repositories;

import org.springframework.data.repository.CrudRepository;
import pl.msi.Entity.User;
import pl.msi.Entity.UserData;

public interface UserDataRepository extends CrudRepository<UserData, Long> {
}
