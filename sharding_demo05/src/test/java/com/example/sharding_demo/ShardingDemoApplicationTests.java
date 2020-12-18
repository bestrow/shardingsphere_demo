package com.example.sharding_demo;

import com.example.sharding_demo.entity.User;
import com.example.sharding_demo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShardingDemoApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void testAddUser() {
        User user = new User();
        user.setUserName("测试");
        user.setUstatus("正常");
        userMapper.insert(user);
    }

    @Test
    void testFind() {
        User user = userMapper.selectByPrimaryKey(546662776693587968L);
        System.out.println(user);
    }
}
