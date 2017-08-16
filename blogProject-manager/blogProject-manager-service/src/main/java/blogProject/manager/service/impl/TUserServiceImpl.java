package blogProject.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import blogProject.manager.bean.TUser;
import blogProject.manager.dao.TUserMapper;
import blogProject.manager.example.TUserExample;
import blogProject.manager.example.TUserExample.Criteria;
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
    
    /**
     * 获取一个用户
     */
    @Override
    public TUser getUser(TUser user) {
        TUserExample example = new TUserExample();
        Criteria criteria = example.createCriteria();
        criteria.andUserLonginacctEqualTo(user.getUserLonginacct());
        criteria.andUserPasswordEqualTo(user.getUserPassword());
        List<TUser> list = userMapper.selectByExample(example);
        if (list != null && list.size() == 1) {
            return list.get(0);
        }
        return null;
    }
    
    /**
     * 修改
     */
    @Override
    public boolean update(TUser user) {
        int i = userMapper.updateByPrimaryKeySelective(user);
        System.out.println(i);
        if (i == 1) {
            return true;
        }
        return false;
    }
    
    
}
