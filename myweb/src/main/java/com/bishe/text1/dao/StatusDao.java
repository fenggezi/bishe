package com.bishe.text1.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface StatusDao {

    @Update("update t_status set wendu value (#{wendu})")
    public int changgewendu(int wendu);

    @Update("update t_status set light value (#{light})")
    public int changelight(int light);

    @Update("update t_status set window value (#{window})")
    public int changgewindow(int window);
}
