package com.mybatis.demo.controller;


import com.mybatis.demo.entity.User;
import com.mybatis.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.UUID;

@RestController
@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/getUserInfo")
    public User getUserInfo(@RequestParam(value = "id",required = false) Integer id) {
        User user =userMapper.getUserInfoById(id);
        return user;
    }

    @PostMapping("/addNewUser")
    @Transactional
    public Integer addNewUser(){
        User user=new User();
        user.setName("xiao"+UUID.randomUUID());
        user.setBirthday(new Date(System.currentTimeMillis()));
        user.setComments("test transaction");
        userMapper.addNewUser(user);
        int i=1/0;
        return user.getId();
    }

    @PostMapping("/addNewUsers")
    @Transactional

    public void addNewUsers(){

        for(int i=0;i<10;i++){
            User user=new User();
            user.setName("xiao"+UUID.randomUUID());
            user.setBirthday(new Date(System.currentTimeMillis()));
            user.setComments("test transaction");
            if(Integer.compare(i,9)==0){
                throw new RuntimeException("测试回滚");
            }
            userMapper.addNewUser(user);
        }

    }



}
