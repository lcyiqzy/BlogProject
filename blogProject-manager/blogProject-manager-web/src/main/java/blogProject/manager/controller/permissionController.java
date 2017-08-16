package blogProject.manager.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import blogProject.manager.bean.TPermission;
import blogProject.manager.bean.TType;
import blogProject.manager.bean.TTypePermission;
import blogProject.manager.service.TPermissionService;
import blogProject.manager.service.TTypePermissionService;
import blogProject.manager.service.TTypeService;

@Controller
@RequestMapping("/permission")
public class permissionController {
    
    @Autowired
    TTypeService typeService;
    
    @Autowired
    TPermissionService permissionService;
    
    @Autowired
    TTypePermissionService typePermissionService;
    
    /**
     * 获取所有权限
     * @return
     */
    @RequestMapping("/list")
    public String list(Model model) {
        List<TPermission> permissions = permissionService.getAllPermissions();
        model.addAttribute("permissions", permissions);
        return "permission/permission";
    }
    
    /**
     * 到分配权限页面
     * @return
     */
    @RequestMapping("/assign")
    public String assign(Model model,HttpSession session) {
        //获取用户类型
        List<TType> types = typeService.getAllTypes();
        System.out.println(types);
        //获取权限类型
        List<TPermission> permissions = permissionService.getAllPermissions();
        System.out.println(permissions);
               
        model.addAttribute("types", types);
        model.addAttribute("permissions", permissions);
        return "permission/assign";
    }
    
    @ResponseBody
    @RequestMapping("/tps")
    public List<TTypePermission> getTypePermission() {
        return typePermissionService.getAllTypePermissions();
    }
    
    @ResponseBody
    @RequestMapping("/update")
    public void updateTps(@RequestParam("opt") String opt,
            @RequestParam("tid") Integer tid,
            @RequestParam("pid") Integer pid) {
        if ("add".equals(opt)) {
            boolean flag = typePermissionService.add(tid,pid);
        }
        if ("del".equals(opt)) {
            boolean flag = typePermissionService.del(tid,pid);
        }
    }
}
