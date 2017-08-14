package blogProject.manager.controller.article;

import java.io.IOException;
import java.text.SimpleDateFormat;
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
@RequestMapping("/article")
public class ArticleController {
    
    @Autowired
    TArticleService articleService;
    
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
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(date);
        article.setArticleDate(format);
        
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
