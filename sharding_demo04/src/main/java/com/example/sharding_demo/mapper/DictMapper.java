package com.example.sharding_demo.mapper;

import com.example.sharding_demo.entity.Dict;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DictMapper {
    int deleteByPrimaryKey(Long dictId);

    int insert(Dict record);

    int insertSelective(Dict record);

    Dict selectByPrimaryKey(Long dictId);

    int updateByPrimaryKeySelective(Dict record);

    int updateByPrimaryKey(Dict record);
}