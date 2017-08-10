package blogProject.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usermanager")
public class UserController {
    
    
    
    @RequestMapping("/users")
    public String userList() {
        return "usermanager/user";
    }
}
