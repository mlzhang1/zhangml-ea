package com.example.zhangmlea.shiro.service.impl;

import com.example.zhangmlea.login.entity.UsersPO;
import com.example.zhangmlea.shiro.dao.LoginMapper;
import com.example.zhangmlea.shiro.entity.RoleDAO;
import com.example.zhangmlea.shiro.entity.UserDAO;
import com.example.zhangmlea.shiro.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    LoginMapper loginMapper;

    @Override
    public UserDAO getMapByName(String userName) {
        return loginMapper.findAccountMapByName(userName);
    }

    @Override
    public Set<RoleDAO> getRoleMapByName(String userName) {
        return loginMapper.findRoleMap(userName);
    }
}
