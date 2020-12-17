package com.example.sharding_demo.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Dict {
    private Long dictId;

    private String dictName;

    private String dictValue;
}