package com.example.zhangmlea.login.dao;

import com.example.zhangmlea.login.entity.UsersPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

//    @Select("SELECT * FROM users WHERE username = #{name}")
    UsersPO getUsersByName(String name);
}
