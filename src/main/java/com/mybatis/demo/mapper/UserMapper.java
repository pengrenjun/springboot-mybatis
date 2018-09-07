package com.mybatis.demo.mapper;

import com.mybatis.demo.entity.User;

public interface UserMapper {

    User getUserInfoById(Integer id);

    void addNewUser(User user);
}
