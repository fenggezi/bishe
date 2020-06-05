package com.bishe.lr.dao;

import com.bishe.lr.entities.Sensor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SensorDao {

    // 查询的数值 历史和实时数据
    @Select("select * from t_sensor order by desc limit 1") // 查询实时数据 一条数据
    Sensor selectReal();

    @Select("select * from t_sensor order by id desc limit 10") //查询历史胡数据
    List<Sensor> selectHistory();
}
