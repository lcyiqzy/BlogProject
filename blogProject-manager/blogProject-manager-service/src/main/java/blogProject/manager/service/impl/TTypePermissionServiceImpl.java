package blogProject.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import blogProject.manager.bean.TTypePermission;
import blogProject.manager.dao.TTypePermissionMapper;
import blogProject.manager.example.TTypePermissionExample;
import blogProject.manager.example.TTypePermissionExample.Criteria;
import blogProject.manager.service.TTypePermissionService;

@Service
public class TTypePermissionServiceImpl implements TTypePermissionService {
    
    @Autowired
    TTypePermissionMapper typePermissionMapper;
    
    /**
     * 获取全部
     */
    @Override
    public List<TTypePermission> getAllTypePermissions() {
        return typePermissionMapper.selectByExample(null);
    }
    
    /**
     * 添加
     */
    @Override
    public boolean add(Integer tid, Integer pid) {
        TTypePermission typePermission = new TTypePermission();
        typePermission.setType(tid);
        typePermission.setPermission(pid);
        int i = typePermissionMapper.insertSelective(typePermission);
        if (i == 1) {
            return true;
        }
        return false;
    }

    /**
     * 删除
     */
    @Override
    public boolean del(Integer tid, Integer pid) {
        TTypePermissionExample example = new TTypePermissionExample();
        Criteria criteria = example.createCriteria();
        criteria.andTypeEqualTo(tid);
        criteria.andPermissionEqualTo(pid);
        int i = typePermissionMapper.deleteByExample(example);
        if (i == 1) {
            return true;
        }
        return false;
    }


}
