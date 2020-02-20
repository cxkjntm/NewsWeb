package com.lxy.newsshow.Controllers;

import com.github.pagehelper.PageInfo;
import com.lxy.newsshow.Mappers.UserMapper;
import com.lxy.newsshow.Services.NewsService;
import com.lxy.newsshow.Services.UserService;
import com.lxy.newsshow.entities.News;
import com.lxy.newsshow.entities.Userinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    @Autowired
    NewsService newsService ;
    @PostMapping(value = "/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model,
                        Map<String,Object>map, HttpSession session){
        Userinfo userinfo = userService.getUserByName(username);
        if(userinfo==null){
            map.put("msg", "未注册");
            return "index";
        }
        else {
            if (username.equals(userinfo.getUserName()) && password.equals(userinfo.getUserPassword())) {
                session.setAttribute("loginuser", userinfo);
                    PageInfo<News> pageInfo = newsService.getNewsByPage(1);
                    model.addAttribute("pageInfo", pageInfo);
                    return "News/list";
            } else {
                map.put("msg", "用户名或密码错误");
                return "index";
            }
        }
    }
    @GetMapping("/loginOut")
    public String loginOut(HttpSession session){
        session.invalidate();
        return "welcome";
    }
}
