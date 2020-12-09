package com.example.zhangmlea.shiro.entity;

import java.security.Permissions;
import java.util.Set;

public class RoleDAO {
    private String id;
    private String username;
    private String roleName;

    /**
     * 角色对应权限集合
     */
    private Set<PermissionsPO> permissions;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Set<PermissionsPO> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<PermissionsPO> permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return "RoleDAO{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", roleName='" + roleName + '\'' +
                ", permissions=" + permissions +
                '}';
    }
}
