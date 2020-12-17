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
        course.setCname("java");
        course.setCstatus("normal");
        course.setUserId(2L);
        courseMapper.insert(course);
    }

    @Test
    void testDelete() {
       courseMapper.deleteByPrimaryKey(546280075654332416L);
    }

}
