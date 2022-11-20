package pl.msi.Services;

import pl.msi.Entity.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);
    List<User> showUser();
    List<User> showUserRoles();
    List<User> showUserwithData();





}
