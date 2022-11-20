package pl.msi.Services.Implem;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.msi.Entity.User;
import pl.msi.Entity.UserWithData;
import pl.msi.Repositories.UserDataRepository;
import pl.msi.Repositories.UserRepository;
import pl.msi.Repositories.UserRoleRepository;
import pl.msi.Services.UserService;

import java.util.List;

@Service
public class UserServiceImplem implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserDataRepository userDataRepository;

    @Autowired
    UserRoleRepository userRoleRepository;

    @Autowired
    UserWithData userWithData;

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }


    @Override
    public List<User> showUser() {
       return userRepository.showAllUsers();
    }

    @Override
    public List<User> showUserRoles() {
        return null;
    }

    @Override
    public List<User> showUserwithData() {
      return null;
    }


    }



