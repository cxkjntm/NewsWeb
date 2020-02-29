package com.lxy.newsshow.Services;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lxy.newsshow.Mappers.NewsMapper;
import com.lxy.newsshow.Mappers.UserMapper;
import com.lxy.newsshow.entities.News;
import com.lxy.newsshow.entities.Userinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public Userinfo getUserById(int id){
        return userMapper.getUserById(id);
    }
    public Userinfo getUserByName(String username){
        return userMapper.getUserByName(username);
    }
   public boolean InsertIntoUserInfo(Userinfo userinfo){
        boolean flag = userMapper.InsertIntoUserInfo(userinfo.getUserName(), userinfo.getUserPassword(), (int) userinfo.getAge(), userinfo.getGender(), userinfo.getTelephone(), userinfo.getAddress());
//        boolean flag = userMapper.InsertIntoUserInfo("test","123456", 27, "male", "123456", "123456");
        if(flag) return true;
        else return false;
   }

}
