package com.mybatis.demo.controller;


import com.mybatis.demo.entity.User;
import com.mybatis.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
