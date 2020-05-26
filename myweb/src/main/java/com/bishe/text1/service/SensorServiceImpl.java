package com.bishe.text1.service;

import com.bishe.text1.dao.SensorDao;
import com.bishe.text1.entities.Sensor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorServiceImpl implements SensorService {

    @Autowired
    SensorDao sensorDao;

    @Override
    public Sensor realTimeDate() {// 查询实时数据
        return sensorDao.selectReal();
    }

    @Override
    public  List<Sensor>  sensorHistoryDate() {
        return sensorHistoryDate(); //查询历史数据
    }
}
