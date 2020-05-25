package com.bishe.text1.dao;

import com.bishe.text1.entities.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UsersDao {

    @Select("select * from users where username=#{username}")
    Users findByUsername(String username);

    @Select("select * from users where username=#{username} and password=#{password}")
    Users login(@Param("username") String username,@Param("password") String password);
}
