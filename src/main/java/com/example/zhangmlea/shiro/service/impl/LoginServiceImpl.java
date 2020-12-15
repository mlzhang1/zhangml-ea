package com.example.zhangmlea.shiro.service.impl;

import com.example.zhangmlea.login.entity.UsersPO;
import com.example.zhangmlea.shiro.dao.LoginMapper;
import com.example.zhangmlea.shiro.entity.RoleDAO;
import com.example.zhangmlea.shiro.entity.UserDAO;
import com.example.zhangmlea.shiro.service.LoginService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class LoginServiceImpl implements LoginService {

    private Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);

    @Autowired
    LoginMapper loginMapper;

    @Override
    public UserDAO getMapByName(String userName) {
        logger.info("---------------呵呵------------------");
        return loginMapper.findAccountMapByName(userName);
    }

    @Override
    public Set<RoleDAO> getRoleMapByName(String userName) {
        return loginMapper.findRoleMap(userName);
    }
}
