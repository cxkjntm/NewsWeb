package com.lxy.newsshow;

import com.lxy.newsshow.Mappers.UserMapper;
import com.lxy.newsshow.entities.Friend;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Insert {
    @Autowired
    UserMapper userMapper;
    @Test
    void Insert(){
        Friend friend = new Friend("friend_14",2);
        userMapper.InsertIntoFriend(friend);
    }
}
