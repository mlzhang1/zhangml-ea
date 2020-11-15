package com.example.zhangmlea.login.controller;

import com.example.zhangmlea.login.dao.UserMapper;
import com.example.zhangmlea.login.entity.UsersPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class LoginController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/test")
    public UsersPO login(){
        UsersPO user = userMapper.getUsersByName("zhang");
        return user;
    }
}
