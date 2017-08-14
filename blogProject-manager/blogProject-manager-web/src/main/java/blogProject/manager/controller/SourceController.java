package blogProject.manager.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import blogProject.manager.bean.TArticle;
import blogProject.manager.controller.util.ImageUploadUtil;
import blogProject.manager.service.TArticleService;

@Controller
@RequestMapping("/source")
public class SourceController {
    
    @Autowired
    TArticleService articleService;
    
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
    
    /**
     * 到达保存编辑页面
     * @return
     */
    @RequestMapping("/toSave")
    public String toSave() {
        return "sourcemanager/save";
    }
    
    
    /**
     * 图片上传 
     */
    @RequestMapping("/saveImg")
    public void saveImg(HttpServletRequest request, HttpServletResponse response) {
        String DirectoryName = "picture/";
        try {
            ImageUploadUtil.ckeditor(request, response, DirectoryName);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * 保存文章 
     */
    @RequestMapping(value="/saveArticle",produces="text/html;charset=utf-8")
    public String saveArticle(@RequestParam(value="upload") String upload,
            @RequestParam("articleName") String articleName,
            HttpSession session) {
        System.out.println("保存文章开始。。。");
        TArticle article = new TArticle();
        
        //创建日期
        Date date = new Date();
        article.setArticleDate(date);
        
        //文章标题
        article.setArticleName(articleName);
        
        //文章作者
        article.setArticleAuthor("shinn");
        
        //文章作者
        article.setAuthorId(1);
        
        //文章内容
        article.setArticleUrl(upload);
        
        //文章点击量
        article.setArticleReadNum(0);
        
        //文章关注量
        article.setArticleFollowNum(0);
        
        //文章喜欢量
        article.setArticleLikeNum(0);
        
        //文章评论数
        article.setArticleCommitNum(0);
        
        System.out.println(upload);
        
        boolean flag = articleService.saveArticle(article);
        
        if (flag) {
            System.out.println("保存成功");
        } else {
            System.out.println("保存失败");
        }
        
        return "redirect:/source/article";
    }
    

}
