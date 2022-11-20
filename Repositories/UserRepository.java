package pl.msi.Repositories;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import pl.msi.Entity.User;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    @Query("SELECT u FROM User u")
    public List<User> showAllUsers();

//    @Query("SELECT u FROM User u WHERE u.nip=:id")
//    public List<User> showUserbyId(@Param("id")int id);

    @Query("SELECT u FROM User u WHERE u.id=:id")
    public User showUserbyId(@Param("id")Long id);

}
