package blogProject.portal.controller;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import blogProject.commons.utils.HttpClientUtil;
import blogProject.manager.bean.TUser;
import blogProject.portal.bean.BlogReturn;
import blogProject.portal.constant.Constants;

/**
 * 该类用于调用第三方接口数据
 * @author WzzAdmin
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    RestApiServerInfo serverInfo;
    
    @RequestMapping("/sendpwdEmail")
    public String sendpwdEmail(String userEmail, Model model) {
        
        System.out.println("忘记密码的邮箱账号:" + userEmail);
        
        return null;
        
    }
    
    
    /**
     * 激活方法
     * @param userEmail
     * @param validateCode
     * @param model
     * @return
     */
    @RequestMapping("/activate")
    public String activate(String userEmail, String validateCode, Model model) {
        System.out.println("接收到的激活userEmail：" + userEmail);
        System.out.println("接收到的激活registCode：" + validateCode);

        String url = serverInfo.getRestApiURL() + "/user/activate";
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("userEmail", userEmail);
        params.put("registCode", validateCode);

        try {
            String response = HttpClientUtil.httpGetRequest(url, params);
            System.out.println("response:" + response);

            BlogReturn<TUser> readValue = new ObjectMapper().readValue(response.getBytes(),
                    new TypeReference<BlogReturn<TUser>>() {
                    });

            // 判断是否激活成功,成功来到激活成功登录页面
            if (readValue.getCode() == 1) {
                // 激活成功！页面提示点击这里转到登录页面
                System.out.println(readValue.getMsg());
                model.addAttribute("msg", readValue.getMsg());
                return "redirect:/login.jsp";
            } else {
                System.out.println(readValue.getMsg());
                model.addAttribute("msg", readValue.getMsg());
                return "activate_failure";
            }
        } catch (Exception e) {
            model.addAttribute("msg", "激活异常,请重新操作！");
            return "activate_failure";
        }
    }

    /**
     * 退出登录
     * @param session
     * @return
     */
    @RequestMapping("/exit")
    public String exitLogin(HttpSession session) {
        Object loginSess = session.getAttribute(Constants.LOGIN_USER);
        if (loginSess != null) {
            session.removeAttribute(Constants.LOGIN_USER);
        }
        return "forward:/index.jsp";
    }

    /**
     * 登录
     * @param user
     * @param session
     * @param model
     * @return
     */
    @RequestMapping("/register")
    public String register(TUser user, HttpSession session, Model model) {
        System.out.println("需要注册的user：" + user);

        String url = serverInfo.getRestApiURL() + "/user/regist";

        Map<String, Object> params = new HashMap<String, Object>();

        try {

            params.put("userEmail", user.getUserEmail());
            params.put("userPassword", user.getUserPassword());

            String response = HttpClientUtil.httpGetRequest(url, params);

            // 封装响应对象
            BlogReturn<TUser> readValue = null;
            readValue = new ObjectMapper().readValue(response.getBytes(), new TypeReference<BlogReturn<TUser>>() {
            });
            System.out.println("readValue:" + readValue);

            // 判断是否注册成功,成功来到登录页面
            if (readValue.getCode() == 1) {
                // 注册成功！通知去激活邮箱页面
                model.addAttribute("msg", readValue.getMsg());
                return "redirect:/activate.jsp";
            } else {
                System.out.println(readValue.getExt().get("error"));
                model.addAttribute("msg", readValue.getExt().get("error"));
                return "forward:/activate.jsp";
            }
        } catch (Exception e) {
            System.out.println(e);
            return "forward:/register.jsp";
        }

    }
    
    /**
     * 注册
     * @param user
     * @param session
     * @param model
     * @return
     */
    @RequestMapping("/login")
    public String login(TUser user, HttpSession session, Model model) {
        System.out.println("接收到的user： " + user);

        String url = serverInfo.getRestApiURL();
        System.out.println("url=" + url);

        Map<String, Object> param = new HashMap<String, Object>();
        param.put("userLonginacct", user.getUserLonginacct());
        param.put("userEmail", user.getUserEmail());
        param.put("userPassword", user.getUserPassword());

        try {
            // 调用restapi的登录接口
            String response = HttpClientUtil.httpGetRequest(url + "/user/login", param);
            System.out.println("response:" + response);

            // 逆向响应内容
            BlogReturn<TUser> readValue = new ObjectMapper().readValue(response.getBytes(),
                    new TypeReference<BlogReturn<TUser>>() {
                    });

            System.out.println("readValue:" + readValue);
            // 登录成功,跳转页面
            if (readValue.getCode() == 1) {
                // 将用户放在session中
                session.setAttribute(Constants.LOGIN_USER, readValue.getContent());
                
                // 将该用户的权限放在session中
                session.setAttribute(Constants.LOGIN_USER_PERMISSION, readValue.getExt().get("permission"));
                
                // 重定向到主页面,导航条改变
                return "redirect:/index.jsp";
            } else {
                model.addAttribute("msg", readValue.getMsg());
                return "forward:/login.jsp";
            }
        } catch (Exception e) {
            model.addAttribute("msg", "登录异常！");
            return "forward:/login.jsp";
        }

    }
}
