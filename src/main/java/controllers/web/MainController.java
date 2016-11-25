package controllers.web;

/**
 * Created by alex on 25.11.16.
 */
import dao.controllers.UsersDAO;
import dao.entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    @Autowired
    private UsersDAO users;

    @ModelAttribute("user")
    public Users getUsers() {
        return new Users();
    }

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping(value = "/auth", method = RequestMethod.POST)
    public String authUser(@ModelAttribute("user") Users user,
                             BindingResult result) {

        users.authUser(user);

        return "index";
    }


}
