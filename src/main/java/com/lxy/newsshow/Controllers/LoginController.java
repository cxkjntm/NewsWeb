package com.lxy.newsshow.Controllers;

import com.lxy.newsshow.Mappers.UserMapper;
import com.lxy.newsshow.Services.UserService;
import com.lxy.newsshow.entities.Userinfo;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    UserService userService;
    @PostMapping(value = "/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object>map, HttpSession session){
        Userinfo userinfo = userService.getUserByName(username);
        if(userinfo==null){
            map.put("msg", "未注册");
            return "index";
        }
        else {
            if (username.equals(userinfo.getUserName()) && password.equals(userinfo.getUserPassword())) {
                session.setAttribute("loginuser", userinfo);
                return "dashboard";
            } else {
                map.put("msg", "用户名或密码错误");
                return "index";
            }
        }
    }

}
