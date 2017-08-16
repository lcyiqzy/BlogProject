package blogProject.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import blogProject.manager.bean.TLabel;
import blogProject.manager.dao.TLabelMapper;
import blogProject.manager.service.TLabelService;

@Service
public class TLabelServiceImpl implements TLabelService {
    
    @Autowired
    TLabelMapper labelMapper;
    
    /**
     * 添加
     */
    @Override
    public boolean addLabel(TLabel label) {
        int i = labelMapper.insertSelective(label);
        if (i ==1) {
            return true;
        }
        return false;
    }
    
    /**
     * 查找所有
     */
    @Override
    public List<TLabel> getAllLabels() {
        return labelMapper.selectByExample(null);
    }

}
