package com.bishe.lr.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface TerminalStatusDao {

    @Update("update t_status set lightstatus = #{updatestatus} ")
    public int updateLight(int updatestatus);

    @Update("update t_status set windowstatus = #{updatestatus} ")
    public int updatewindow(int updatestatus);

}
