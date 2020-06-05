package com.bishe.lr.service;


import com.bishe.lr.entities.Sensor;

import java.util.List;

public interface SensorService {
    public Sensor realTimeDate();

    public  List<Sensor>  sensorHistoryDate();

}
