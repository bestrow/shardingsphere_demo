package com.example.sharding_demo.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
    private Long userId;

    private String userName;

    private String ustatus;
}