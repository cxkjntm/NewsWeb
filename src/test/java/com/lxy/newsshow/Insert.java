package com.lxy.newsshow;

import com.lxy.newsshow.Mappers.UserMapper;
import com.lxy.newsshow.entities.Userinfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Insert {
    @Autowired
    UserMapper userMapper;
    @Test
    void Insert(){
        Userinfo userinfo = new Userinfo("test","123456", 27, "male", "123456", "123456");
        boolean flag = userMapper.InsertIntoUserInfo(userinfo.getUserName(), userinfo.getUserPassword(), (int) userinfo.getAge(), userinfo.getGender(), userinfo.getTelephone(), userinfo.getAddress());
    }
}
