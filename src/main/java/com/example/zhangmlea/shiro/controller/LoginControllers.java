package com.example.zhangmlea.shiro.controller;

import com.example.zhangmlea.login.dao.UserMapper;
import com.example.zhangmlea.login.entity.UsersPO;
import com.example.zhangmlea.shiro.entity.UserDAO;
import com.example.zhangmlea.shiro.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("login")
public class LoginControllers {

    @Autowired
    LoginService loginService;

    @RequestMapping("/getUserAccount")
    public UserDAO login(){
        UserDAO user = loginService.getMapByName("zhang");
        return user;
    }
}
