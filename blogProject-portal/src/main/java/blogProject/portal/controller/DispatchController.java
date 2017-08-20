package blogProject.portal.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import blogProject.commons.utils.HttpClientUtil;
import blogProject.manager.bean.TLabel;
import blogProject.portal.bean.BlogReturn;

@Controller
@RequestMapping("/topage")
public class DispatchController {
    
    @Autowired
    RestApiServerInfo serverInfo;
    
    @RequestMapping("/blog.html")
    public String toBlog(Model model) {
        String url = serverInfo.getRestApiURL() + "/labelManager/list";
        String response = HttpClientUtil.httpGetRequest(url);
        System.out.println("response:" + response);
        try {
            BlogReturn<List<TLabel>> readValue = new ObjectMapper().readValue(response.getBytes(), new TypeReference<BlogReturn<List<TLabel>>>() {
            });
            model.addAttribute("labels", readValue.getContent());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "blog";
    }
    
    @ResponseBody
    @RequestMapping("/backstage")
    public void toBackstage(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        String url = "http://127.0.0.1:8080/blogProject-manager-web/usermanager/manager";
//        request.getRequestDispatcher("blog").forward(request, response);
        Cookie[] cookies = request.getCookies();
        Cookie cookie = cookies[0];
        System.out.println(cookie);
        System.out.println(cookie.getName()+"="+cookie.getValue());
        response.setHeader("Cookie", cookie.getName()+"="+cookie.getValue());
        response.sendRedirect(url);
    }
}
