package com.bishe.lr.service;

import com.bishe.lr.dao.SensorDao;
import com.bishe.lr.entities.Sensor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class SensorServiceImpl implements SensorService {

    @Autowired
    SensorDao sensorDao;

    @Override
    public Sensor realTimeDate() {// 查询实时数据
        Sensor sensorN = new Sensor();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Sensor dao = sensorDao.selectReal();
        sensorN.setCarbon(dao.getCarbon());
        sensorN.setHumidity(dao.getHumidity());
        sensorN.setLight(dao.getLight());
        sensorN.setTimesx(df.format(new Date()));
        sensorN.setId(dao.getId());
        return sensorN;
    }

    @Override
    public  List<Sensor>  sensorHistoryDate() {
        return sensorHistoryDate(); //查询历史数据
    }
}
