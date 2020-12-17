package com.example.sharding_demo.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Course {
    private Long cid;

    private String cname;

    private Long userId;

    private String cstatus;
}