package blogProject.manager.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import blogProject.manager.bean.TUser;
import blogProject.manager.service.TUserService;

@Controller
@RequestMapping("/usermanager")
public class UserController {
    
    @Autowired
    TUserService userService;
    
    /**
     * 获取用户列表
     */
    @RequestMapping("/users")
    public String userList(@RequestParam(value="pn",defaultValue="1") Integer pn,
            @RequestParam(value="ps",defaultValue="7") Integer ps,Model model) {
        PageHelper.startPage(pn, ps);
        
        List<TUser> users = userService.getAllUsers();
        System.out.println(users);
        PageInfo<TUser> info = new PageInfo<>(users, 5);

        model.addAttribute("info", info);
        return "usermanager/user";
    }
    
    /**
     * 登录
     */
    @RequestMapping("/login")
    public String login(TUser user,HttpSession session) {
        TUser loginUser = userService.getUser(user);
        if (loginUser != null && loginUser.getUserPermission() == 3) {
            session.setAttribute("loginUser", loginUser);
            return "redirect:/usermanager/manager";
        }
        return "redirect:/login.jsp";
    }
    
    /**
     * 到管理页面
     */
    @RequestMapping("/manager")
    public String toManager(HttpSession session) {
        TUser loginUser = (TUser) session.getAttribute("loginUser");
        System.out.println(loginUser);
        if (loginUser != null && loginUser.getUserPermission() == 3) {
            session.setAttribute("loginUser", loginUser);
            return "manager";
        }
        String url = "http://127.0.0.1:8081/blogProject-portal/index.jsp";
        return "redirect:" + url;
    }
    
    @RequestMapping("/update")
    public String update(TUser user) {
        System.out.println(user);
        boolean flag = userService.update(user);
        return "redirect:/usermanager/users";
    }
    
    @RequestMapping("/logout")
    public String exit(HttpSession session) {
        session.removeAttribute("loginUser");
        String url = "http://127.0.0.1:8081/blogProject-portal/index.jsp";
        return "redirect:" + url;
    }
    
    @RequestMapping("returnblog")
    public String returnblog(HttpSession session,Model model) {
        System.out.println(session.getAttribute("loginUser"));
        model.addAttribute("loginUser",session.getAttribute("loginUser"));
        String url = "http://127.0.0.1:8081/blogProject-portal/index.jsp";
        return "redirect:" + url;
    }
}
