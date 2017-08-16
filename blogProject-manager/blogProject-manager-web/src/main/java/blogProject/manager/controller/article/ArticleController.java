package blogProject.manager.controller.article;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import blogProject.manager.bean.TArticle;
import blogProject.manager.bean.TUser;
import blogProject.manager.controller.util.ArticleUploadUtil;
import blogProject.manager.controller.util.DeleteUtil;
import blogProject.manager.controller.util.ImageUploadUtil;
import blogProject.manager.service.TArticleService;

@Controller
@RequestMapping("/article")
public class ArticleController {
    
    @Autowired
    TArticleService articleService;
    
    /**
     * 删除文章
     */
    @RequestMapping(value="/del")
    public String del(@RequestParam(value="did") Integer did,
            @RequestParam(value="drealurl") String drealurl,
            @RequestParam(value="dpicurl") String dpicurl) {
        System.out.println("开始删除文章。。。");
        System.out.println(did + "--------");
        System.out.println(drealurl + "--------");
        System.out.println(dpicurl + "--------");
        boolean flag = articleService.delArticle(did);
        DeleteUtil.deleteFile(drealurl, dpicurl);
//        if (flag) {
//            return "删除完成";
//        }
        return "redirect:/source/article";
    }
    
    /**
     * 图片上传 
     */
    @RequestMapping("/saveImg")
    public void saveImg(HttpServletRequest request, HttpServletResponse response,HttpSession session) {
        List<String> pictureRealPaths = (List<String>) session.getAttribute("pictureRealPaths");
        if (pictureRealPaths == null) {
            System.out.println("图片地址值为空。。。");
            pictureRealPaths = new ArrayList<>();
        }
        String DirectoryName = "picture/";
        try {
            String picRealPath = ImageUploadUtil.ckeditor(request, response, DirectoryName);
            pictureRealPaths.add(picRealPath);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        session.setAttribute("pictureRealPaths", pictureRealPaths);
    }
    
    /**
     * 保存文章 
     */
    @RequestMapping(value="/saveArticle",produces="text/html;charset=utf-8")
    public String saveArticle(@RequestParam(value="upload") String upload,
            @RequestParam("articleName") String articleName,
            HttpServletRequest request, HttpServletResponse response,
            HttpSession session) {
        System.out.println("保存文章开始。。。");
        TArticle article = new TArticle();
        
        TUser loginUser = (TUser) session.getAttribute("loginUser");
        
        String DirectoryName = "article/";
        String url = ArticleUploadUtil.upload(request, response, DirectoryName,upload);
        String[] urls = url.split("&");
        
        List<String> list = (List<String>) session.getAttribute("pictureRealPaths");
        String pictureUrl = "";
        if (list != null) {
            for (String string : list) {
                pictureUrl += string + "&";
            }
        }
        
        System.out.println(pictureUrl);
        
        //创建日期
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(date);
        article.setArticleDate(format);
        
        //文章标题
        article.setArticleName(articleName);
        
        //文章作者
        article.setArticleAuthor(loginUser.getUserLonginacct());
        
        //文章作者id
        article.setAuthorId(loginUser.getId());

        //文章真实地址
        article.setArticleRealUrl(urls[0]);
        
        //文章内容
        article.setArticleUrl(urls[1]);
        
        //文章点击量
        article.setArticleReadNum(0);
        
        //文章关注量
        article.setArticleFollowNum(0);
        
        //文章喜欢量
        article.setArticleLikeNum(0);
        
        //文章评论数
        article.setArticleCommitNum(0);
        
        //图片Url
        article.setArticlePicUrl(pictureUrl);
        
        System.out.println(upload);
        
        boolean flag = articleService.saveArticle(article);
        
        if (flag) {
            System.out.println("保存成功");
        } else {
            System.out.println("保存失败");
        }
        
        session.removeAttribute("pictureRealPaths");
        
        return "redirect:/source/article";
    }
}
