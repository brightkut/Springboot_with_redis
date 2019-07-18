package com.example.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import javax.validation.constraints.NotNull;

@Data
@RedisHash("users")
public class Users {

    @Id
    private  int id;
    @NotNull
    private String name;
    @NotNull
    private  String lastname;
    @NotNull
    private  int age;



}
