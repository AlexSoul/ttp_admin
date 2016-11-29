package controllers.web;

/**
 * Created by alex on 25.11.16.
 */
import dao.controllers.UsersDAO;
import dao.entities.Users;
import dao.services.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class MainController {

    @Autowired
    private UsersServices usersServices;

    @ModelAttribute("user")
    public Users getUsers() {
        return new Users();
    }

    @RequestMapping("/")
    public String home() {
        return "index";
    }


    @RequestMapping(value = "/dashboard")
    public String dashBoard(HttpSession session, Map<String, Object> map) {

        Users currentUser = (Users)session.getAttribute("CURRENT_USER");
        if (currentUser==null) return "redirect:/";

        map.put("userName",currentUser.getUsername());

        return "dashboard";

    }

    @RequestMapping(value = "/auth", method = RequestMethod.POST)
    public String authUser(HttpSession session, @ModelAttribute("user") Users user,
                             BindingResult result) {

        usersServices.authUser(user);
        Users currentUser = usersServices.authUser(user);
        if (currentUser==null) {
            result.rejectValue("password","error.auth");
            return "index";
        }
        session.setAttribute("CURRENT_USER", currentUser);
        return "redirect:/dashboard";

    }


}
