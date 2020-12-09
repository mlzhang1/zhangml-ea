package com.example.zhangmlea.shiro.service;

import com.example.zhangmlea.shiro.entity.RoleDAO;
import com.example.zhangmlea.shiro.entity.UserDAO;

import java.util.List;
import java.util.Set;

public interface LoginService {
    UserDAO getMapByName(String userName);

    Set<RoleDAO> getRoleMapByName(String userName);
}
