package com.example.zhangmlea.shiro.entity;

import java.util.Set;

public class UserDAO {
    private String id;
    private String userName;
    private String password;
    /**
     * 用户对应的角色集合
     */
    private Set<RoleDAO> roles;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<RoleDAO> getRoles() {
        return roles;
    }

    public void setRoles(Set<RoleDAO> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "UserDAO{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", roles=" + roles +
                '}';
    }
}
