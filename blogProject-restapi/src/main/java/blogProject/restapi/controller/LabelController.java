package blogProject.restapi.controller;

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
import blogProject.restapi.bean.BlogReturn;
import blogProject.restapi.service.TLabelService;

@Controller
@RequestMapping("/labelManager")
public class LabelController {
    
    @Autowired
    TLabelService labelService;
    
    @ResponseBody
    @RequestMapping("/list")
    public BlogReturn<List<TLabel>> list(@RequestParam(value="pn",defaultValue="1")Integer pn,
            @RequestParam(value="ps",defaultValue="7")Integer ps) {
        PageHelper.startPage(pn, ps);
        List<TLabel> list = labelService.getAllLabels();
        return BlogReturn.success(null, list, null);
    }
    
}
