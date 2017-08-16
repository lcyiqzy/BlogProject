package blogProject.manager.service;

import java.util.List;

import blogProject.manager.bean.TTypePermission;

public interface TTypePermissionService {

    List<TTypePermission> getAllTypePermissions();

    boolean add(Integer tid, Integer pid);

    boolean del(Integer tid, Integer pid);


}
