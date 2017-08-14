package blogProject.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import blogProject.manager.bean.TPermission;
import blogProject.manager.dao.TPermissionMapper;
import blogProject.manager.service.TPermissionService;

@Service
public class TPermissionServiceImpl implements TPermissionService {
    
    @Autowired
    TPermissionMapper permissionMapper;
    
    /**
     * 获取所有权限
     */
    @Override
    public List<TPermission> getAllPermissions() {
        return permissionMapper.selectByExample(null);
    }
    
}
