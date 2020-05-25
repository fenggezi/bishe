package com.bishe.text1.dao;

import com.bishe.text1.entities.Sensor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SensorDao {

    // 查询的数值 历史和实时数据
    @Select("select * from t_sensor order by id desc limit 10")
    List<Sensor> selectReal();

    @Select("select * from t_sensor ") // 做个分页
    List<Sensor> selectHistory();
}
