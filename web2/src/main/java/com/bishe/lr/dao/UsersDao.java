package com.bishe.lr.dao;

import com.bishe.lr.entities.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UsersDao {

    @Select("select * from users where username=#{username}")//登录
    Users findByUsername(String username);

    @Select("select * from users where username=#{username} and password=#{password}")//登录查询
    Users login(@Param("username") String username,@Param("password") String password);

    @Insert("insert into users(username,password,createtime) value (#{password},#{username})") // 插入注册信息
    int register(@Param("username") String username,@Param("password") String password);
}
