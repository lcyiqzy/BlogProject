package blogProject.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import blogProject.manager.bean.TUser;
import blogProject.manager.service.UserService;

@Controller
@RequestMapping("/usermanager")
public class UserController {
    
    @Autowired
    UserService userService;
    
    @RequestMapping("/users")
    public String userList() {
        List<TUser> users = userService.getAllUsers();
        System.out.println();
        return "usermanager/user";
    }
}
