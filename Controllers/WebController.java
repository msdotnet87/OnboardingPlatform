package pl.msi.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pl.msi.Entity.User;
import pl.msi.Entity.UserData;
import pl.msi.Entity.UserRole;
import pl.msi.Services.Implem.UserServiceImplem;

import java.util.List;

@Controller
public class WebController {


    User user;

    UserData userData;

    UserRole userRole;
    UserServiceImplem userServiceImplem;

    @Autowired
    public WebController(User user, UserData userData, UserRole userRole, UserServiceImplem userServiceImplem){
        this.user = user;
        this.userData = userData;
        this.userRole = userRole;
        this.userServiceImplem = userServiceImplem;
    }


/*
SHOW CONTENT
 */

    @RequestMapping(value = "/api/show_custmer")
    public ModelAndView show_customer(Model model, ModelAndView modelAndView){
        List<User> showUsers = userServiceImplem.showUser();
        model.addAttribute("allUsers", showUsers);
        modelAndView.setViewName("show_customer");
        return modelAndView;
    }

}
