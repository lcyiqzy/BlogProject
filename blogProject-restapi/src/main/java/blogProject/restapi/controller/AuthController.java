package blogProject.restapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    
    @RequestMapping("/login")
    public void login(){
        System.out.println("resapi login....");
    }
}
