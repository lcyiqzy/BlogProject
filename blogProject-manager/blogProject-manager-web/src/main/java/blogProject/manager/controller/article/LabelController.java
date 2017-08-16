package blogProject.manager.controller.article;

import java.io.File;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import blogProject.manager.bean.TLabel;
import blogProject.manager.service.TLabelService;

@Controller
@RequestMapping("/labelManager")
public class LabelController {
    
    @Autowired
    TLabelService labelService;
    
    @ResponseBody
    @RequestMapping("/list")
    public PageInfo<TLabel> list(@RequestParam(value="pn",defaultValue="1")Integer pn,
            @RequestParam(value="ps",defaultValue="7")Integer ps) {
        PageHelper.startPage(pn, ps);
        List<TLabel> list = labelService.getAllLabels();
        PageInfo<TLabel> info = new PageInfo<>(list, 5);
        return info;
    }
    
    /**
     * 添加标签
     */
    @ResponseBody
    @RequestMapping("/add")
    public String add(@RequestParam("pic") MultipartFile file, @RequestParam("name") String name,
            HttpServletRequest request) {
        System.out.println("保存标签开始");
        String OriginalFilename = file.getOriginalFilename();
        TLabel label = new TLabel();
        label.setLabelName(name);
        
        if (file != null && OriginalFilename != "") {
            
            String fileName = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 10) + "_label_" + OriginalFilename;
            //真实位置
            String realPath = request.getSession().getServletContext().getRealPath("picture/") + fileName;
            
            //服务器位置
            String contextPath = request.getContextPath() + "picture/" + fileName;
            
            try {
                file.transferTo(new File(realPath + fileName));
                label.setLabelPicUrl(contextPath);
                label.setLabelRealUrl(realPath);
            } catch (Exception e) {
                e.printStackTrace();
                return "添加失败";
            }
        }
        
        boolean flag = labelService.addLabel(label);
        if (flag) {
            return "添加完成";
        }
        
        return "添加失败";
    }
}
