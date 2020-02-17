package com.lxy.newsshow.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {
    /**
     * 登录拦截器
     * @param username
     * @param password
     * @param map
     * @return
     */
    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object>map, HttpSession session){
        if(!StringUtils.isEmpty("username")&&"123456".equals(password)){
            System.out.println("拦截跳转");
            session.setAttribute("loginuser", username);
            return "dashboard";
        }

        else{
            map.put("msg", "用户名密码错误");
            return "index";
        }
    }

}
