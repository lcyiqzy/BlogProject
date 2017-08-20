package blogProject.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
