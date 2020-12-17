package com.example.sharding_demo;

import com.example.sharding_demo.entity.Course;
import com.example.sharding_demo.entity.User;
import com.example.sharding_demo.mapper.CourseMapper;
import com.example.sharding_demo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShardingDemoApplicationTests {

    @Autowired
    private CourseMapper courseMapper;
    @Autowired
    private UserMapper userMapper;

    @Test
    void testAddCourse() {
        Course course = new Course();
        course.setCname("testCourse");
        course.setCstatus("nomal");
        course.setUserId(4L);
        courseMapper.insert(course);
    }

    @Test
    void testAddUser() {
        User user = new User();
        user.setUserName("cs01");
        user.setUstatus("aaa");
        userMapper.insert(user);
    }

}
