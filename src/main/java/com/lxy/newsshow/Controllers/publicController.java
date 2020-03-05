package com.lxy.newsshow.Controllers;

import com.lxy.newsshow.Mappers.ArticalMapper;
import com.lxy.newsshow.Services.ArticleService;
import com.lxy.newsshow.Services.NewsService;
import com.lxy.newsshow.Services.UserService;
import com.lxy.newsshow.entities.ArticalComment;
import com.lxy.newsshow.entities.Userinfo;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class publicController {
    @Autowired
    UserService userService;
    @Autowired
    ArticleService articleService;
    @PostMapping(value = "/register")
    public String Register(@RequestParam("username") String username,
                           @RequestParam("password") String password,
                           @RequestParam("age") String age,
                           @RequestParam("gender") String gender,
                           @RequestParam("telephone") String telephone,
                           @RequestParam("address") String address,
                           Map<String,Object>map
                           ){
        int Age = Integer.parseInt(age);
        Userinfo userinfo = new Userinfo(username,password,Age,gender,telephone,address);
        boolean flag = userService.InsertIntoUserInfo(userinfo);
        Userinfo userinfo1 = userService.getUserByName(username);
        userService.CreateTable("friend_"+userinfo1.getId());
        userService.CreateArtical("artical_"+userinfo1.getId());
        if(flag) return "index";
        else
        return "404";
    }
    @ResponseBody
    @PostMapping(value="/like")
    public boolean getLike(@RequestBody HashMap<String, String> map, HttpSession session){
        Userinfo userinfo = (Userinfo) session.getAttribute("loginuser");
        System.out.println(userinfo.getUserName());
        String Tableartical = "artical_"+userinfo.getId();
        System.out.println(map.get("ID"));
        int ID = Integer.parseInt(map.get("ID"));
        ArticalComment articalComment = new ArticalComment(Tableartical,ID,1);
        boolean flag = articleService.InsertIntoArtical(articalComment);
        if(flag) return true;
        else return false;
    }
    @ResponseBody
    @PostMapping(value="/dislike")
    public boolean getDisLike(@RequestBody HashMap<String, String> map, HttpSession session){
        Userinfo userinfo = (Userinfo) session.getAttribute("loginuser");
        System.out.println(userinfo.getUserName());
        String Tableartical = "artical_"+userinfo.getId();
        System.out.println(map.get("ID"));
        int ID = Integer.parseInt(map.get("ID"));
        ArticalComment articalComment = new ArticalComment(Tableartical,ID,0);
        boolean flag = articleService.InsertIntoArtical(articalComment);
        if(flag) return true;
        else return false;
    }
}
