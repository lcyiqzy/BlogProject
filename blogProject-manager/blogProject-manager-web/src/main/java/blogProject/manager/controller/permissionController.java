package blogProject.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/permission")
public class permissionController {
    
    /**
     * 获取所有权限
     * @return
     */
    @RequestMapping("/list")
    public String list() {
        return "permission/permission";
    }
    
    /**
     * 分配权限
     * @return
     */
    @RequestMapping("/assign")
    public String assign() {
        return "permission/assign";
    }
}
