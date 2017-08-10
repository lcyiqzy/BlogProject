package blogProject.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import blogProject.manager.bean.TUser;
import blogProject.manager.dao.TUserMapper;
import blogProject.manager.service.TUserService;

@Service
public class TUserServiceImpl implements TUserService {
    
    @Autowired
    TUserMapper userMapper;
    
    /**
     * 获取所有用户
     */
    @Override
    public List<TUser> getAllUsers() {
        return userMapper.selectByExample(null);
    }
    
    
}
