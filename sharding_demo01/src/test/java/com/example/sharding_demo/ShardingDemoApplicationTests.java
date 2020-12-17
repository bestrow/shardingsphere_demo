package com.example.sharding_demo;

import com.example.sharding_demo.entity.Course;
import com.example.sharding_demo.mapper.CourseMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShardingDemoApplicationTests {

    @Autowired
    private CourseMapper courseMapper;

    @Test
    void testAdd() {
        Course course = new Course();
        course.setCname("test");
        course.setCstatus("normal");
        course.setUserId(2L);
        courseMapper.insert(course);
    }

    @Test
    void testQuery() {
        Course course = courseMapper.selectByPrimaryKey(546270575232811008L);
        System.out.println(course);
    }

    @Test
    void testDelete() {
        courseMapper.deleteByPrimaryKey(546270575232811008L);
    }
}
