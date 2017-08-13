package blogProject.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import blogProject.manager.bean.TPermission;
import blogProject.manager.bean.TType;
import blogProject.manager.service.TPermissionService;
import blogProject.manager.service.TTypeService;

@Controller
@RequestMapping("/permission")
public class permissionController {
    
    @Autowired
    TTypeService typeService;
    
    @Autowired
    TPermissionService permissionService;
    
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
    public String assign(Model model) {
        List<TType> types = typeService.getAllTypes();
        System.out.println(types);
        List<TPermission> permissions = permissionService.getAllPermissions();
        System.out.println(permissions);
        
        model.addAttribute("types", types);
        model.addAttribute("permissions", permissions);
        return "permission/assign";
    }
}
