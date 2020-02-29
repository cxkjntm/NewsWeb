package com.lxy.newsshow.Controllers;

import com.lxy.newsshow.Services.UserService;
import com.lxy.newsshow.entities.Userinfo;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class publicController {
    @Autowired
    UserService userService;
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
        String tablename = "friend_"+userinfo1.getId();
        System.out.println(tablename);
        userService.CreateTable(tablename);
        if(flag) return "index";
        else
        return "404";
    }
}
