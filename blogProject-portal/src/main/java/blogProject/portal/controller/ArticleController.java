package blogProject.portal.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import blogProject.manager.bean.TArticle;
import blogProject.portal.service.TArticleService;


@Controller
public class ArticleController {
	
	@RequestMapping("articles/1")
	public String getPage(){
		
		return "redirect:/singlepage.jsp";
	}
}
