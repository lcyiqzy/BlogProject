package blogProject.restapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import blogProject.manager.dao.TPermissionMapper;
import blogProject.restapi.service.PermissionService;

@Service
public class PermissionServiceImple implements PermissionService {
    
    @Autowired
    TPermissionMapper permissionMapper;
    
}
