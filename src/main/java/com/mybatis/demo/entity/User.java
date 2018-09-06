package com.mybatis.demo.entity;

import java.io.Serializable;
import java.sql.Date;

/**
 * @Description: 用户表
 * @Author：pengrj
 * @Date : 2018/7/22 0022 13:35
 * @version:1.0
 */

public class User implements Serializable {


    private Integer id;

    private String name;


    private Date birthday;

    private String location;


    private String comments;

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
