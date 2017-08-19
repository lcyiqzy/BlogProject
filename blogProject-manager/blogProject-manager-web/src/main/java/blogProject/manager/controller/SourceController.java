package blogProject.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import blogProject.manager.bean.TArticle;
import blogProject.manager.bean.TLabel;
import blogProject.manager.service.TArticleService;
import blogProject.manager.service.TLabelService;


@Controller
@RequestMapping("/source")
public class SourceController {
    
    @Autowired
    TArticleService articleService;
    
    @Autowired
    TLabelService labelService;
    
    /**
     * 获取标签列表
     * @return
     */
    @RequestMapping("/label")
    public String getLabels() {
        return "sourcemanager/label";
    }
    
    /**
     * 获取文章列表
     * @return
     */
    @RequestMapping("/article")
    public String getArticles(@RequestParam(value="pn",defaultValue="1") Integer pn,
            @RequestParam(value="ps",defaultValue="6") Integer ps,
            Model model) {
        PageHelper.startPage(pn, ps);
        List<TArticle> list = articleService.getAllArticles();
        PageInfo<TArticle> info = new PageInfo<>(list, 5);
        model.addAttribute("info", info);
        System.out.println(info);
        return "sourcemanager/article";
    }
    
    /**
     * 获取音频列表
     * @return
     */
    @RequestMapping("/audio")
    public String getAudio() {
        return "sourcemanager/audio";
    }
    
    /**
     * 获取栏目列表
     * @return
     */
    @RequestMapping("/column")
    public String getColumns() {
        return "sourcemanager/column";
    }
    
    /**
     * 到达保存编辑页面
     * @return
     */
    @RequestMapping("/toSave")
    public String toSave(Model model) {
        List<TLabel> labels = labelService.getAllLabels();
        model.addAttribute("labels", labels);
        return "sourcemanager/save";
    }
    
}
