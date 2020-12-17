package com.example.sharding_demo.mapper;

import com.example.sharding_demo.entity.Course;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CourseMapper {
    int deleteByPrimaryKey(Long cid);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Long cid);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}