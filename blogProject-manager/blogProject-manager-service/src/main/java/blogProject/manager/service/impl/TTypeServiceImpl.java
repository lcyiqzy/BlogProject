package blogProject.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import blogProject.manager.bean.TType;
import blogProject.manager.dao.TTypeMapper;
import blogProject.manager.service.TTypeService;

@Service
public class TTypeServiceImpl implements TTypeService {
    
    @Autowired
    TTypeMapper typeMapper;
    
    /**
     * 获取所有用户类型
     */
    @Override
    public List<TType> getAllTypes() {
        return typeMapper.selectByExample(null);
    }

}
