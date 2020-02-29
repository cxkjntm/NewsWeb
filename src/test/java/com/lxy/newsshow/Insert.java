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
    userMapper.CreateFriend("friend_999");
    }
}
