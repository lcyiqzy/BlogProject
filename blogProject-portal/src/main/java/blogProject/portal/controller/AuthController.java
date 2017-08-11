package blogProject.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import blogProject.commons.utils.HttpClientUtil;
import blogProject.manager.bean.TUser;

@Controller
public class AuthController {
    
    @Autowired
    RestApiServerInfo serverInfo;
    
    @RequestMapping("/login")
    public void login(TUser user){
        System.out.println("接收到的user： " + user);
        System.out.println("logon....");
        
        String url = serverInfo.getRestApiURL();
        System.out.println("url=" + url);
        HttpClientUtil.httpGetRequest(url);
    }
}
