package com.example.sharding_demo;

import com.example.sharding_demo.entity.Dict;
import com.example.sharding_demo.mapper.DictMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShardingDemoApplicationTests {

    @Autowired
    private DictMapper dictMapper;

    @Test
    void testAddDict() {
        Dict dict = new Dict();
        dict.setDictName("aa");
        dict.setDictValue("启动");
        dictMapper.insert(dict);
    }

    @Test
    void testDelDict() {
        dictMapper.deleteByPrimaryKey(546325934647541760L);
    }

}
