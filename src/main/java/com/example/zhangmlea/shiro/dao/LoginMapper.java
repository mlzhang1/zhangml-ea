package com.example.zhangmlea.shiro.dao;

import com.example.zhangmlea.login.entity.UsersPO;
import com.example.zhangmlea.shiro.entity.PermissionsPO;
import com.example.zhangmlea.shiro.entity.RoleDAO;
import com.example.zhangmlea.shiro.entity.UserDAO;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Mapper
@Repository
public interface LoginMapper {

    /**
     * 获取用户账号信息
     * @param userId
     * @return
     */
    @Select("select * from users where username = #{userId} ")
    @Results(id = "userAccountMap",value = {
            @Result(id =true,property = "id",column = "id"),
            @Result(property = "userName",column = "username"),
            @Result(property = "password",column = "password"),
            @Result(property = "roles" ,column = "username",many = @Many(select="com.example.zhangmlea.shiro.dao.LoginMapper.findRoleMap",fetchType = FetchType.LAZY))
    })
    UserDAO findAccountMapByName(@Param("userId") String userId);

    /**
     * 获取用户角色
     * @param username
     * @return
     */
    @Select("select * from user_roles where username = #{username} ")
    @Results(id = "findAccountMapByName",value = {
            @Result(id =true,property = "id",column = "id"),
            @Result(property = "username",column = "username"),
            @Result(property = "roleName",column = "role_name"),
            @Result(property = "permissions" ,column = "role_name",many = @Many(select="com.example.zhangmlea.shiro.dao.LoginMapper.findPermissions",fetchType = FetchType.LAZY))
    })
    Set<RoleDAO> findRoleMap(@Param("username") String username);

    /**
     * 获取角色权限
     * @param roleName
     * @return
     */
    @Select("select * from roles_permissions where role_name = #{roleName}")
    @Results(id = "findPermission",value = {
            @Result(id =true,property = "id",column = "id"),
            @Result(property = "roleName",column = "role_name"),
            @Result(property = "permissions",column = "permission"),
    })
    List<PermissionsPO> findPermissions(String roleName);

    @Select("SELECT * FROM users WHERE username = #{name}")
    UsersPO getUsersByName(String name);
}
