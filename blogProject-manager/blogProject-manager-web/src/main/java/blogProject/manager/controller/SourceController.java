package blogProject.manager.controller;

import java.io.File;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/source")
public class SourceController {
    
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
    public String getArticles() {
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
    
    @RequestMapping("/toSave")
    public String toSave() {
        return "sourcemanager/save";
    }
    

}
