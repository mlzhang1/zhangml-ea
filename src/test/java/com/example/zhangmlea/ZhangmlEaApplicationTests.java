package com.example.zhangmlea;

import com.example.zhangmlea.shiro.entity.RoleDAO;
import com.example.zhangmlea.shiro.entity.UserDAO;
import com.example.zhangmlea.shiro.service.LoginService;
import com.example.zhangmlea.shiro.service.impl.LoginServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ZhangmlEaApplicationTests {

    @Autowired
    LoginService loginService;
    @Test
    void contextLoads() {
//        List<RoleDAO> list = loginService.getRoleMapByName("zhang");
        UserDAO list = loginService.getMapByName("zhang");
        System.out.println(list);
    }

}
